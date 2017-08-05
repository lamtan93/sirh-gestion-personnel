package dev.sgp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@Stateless
public class CollaborateurService {

	@Inject Event<CollabEvt> collabEvt;

	@PersistenceContext(unitName="sgp-pu")private EntityManager em;
		
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	
	public List<Collaborateur> getListeCollaborateurs() {
		
	TypedQuery<Collaborateur> query = em.createQuery("SELECT c from Collaborateur c", Collaborateur.class);	
	listeCollaborateurs =  query.getResultList();
	return listeCollaborateurs;
	
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {

	em.merge(collab);
	
	collabEvt.fire(new CollabEvt(new Date(),TypeCollabEvt.CREATION_COLLAB, collab.getMatricule()));
	
	}
	
	
	public List<Collaborateur> getListCollabByIdDepart(int id){
		
		String jpql = "SELECT d.listCollaborateurs FROM Departement d WHERE d.id=:id";
		Query query = em.createQuery(jpql);
		
		query.setParameter("id", id);
		
		
		listeCollaborateurs = query.getResultList();
		
		return listeCollaborateurs;
	}
	
	
	public Collaborateur getCollabByMatricule(String matricule){
		
		String jpql = "SELECT c FROM Collaborateur c WHERE c.matricule=:matricule";
		Query query = em.createQuery(jpql);
		query.setParameter("matricule", matricule);
		Collaborateur collab = (Collaborateur) query.getSingleResult();
		
		return collab;
	}
	
}
