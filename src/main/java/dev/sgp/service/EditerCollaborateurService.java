package dev.sgp.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

@Stateless
public class EditerCollaborateurService {

	
	@PersistenceContext(unitName="sgp-pu")
	private EntityManager em;
	
	
	
	public Collaborateur findCollaborateurByMatricule(String matricule){
		String jpql = "SELECT c FROM Collaborateur c WHERE c.matricule=:matricule";
		Query query = em.createQuery(jpql);
		query.setParameter("matricule", matricule);
		Collaborateur collab  = (Collaborateur)query.getSingleResult();
		return collab;
	}
	
	public void editerCollaborateur(Collaborateur collab, String intitulePoste,String adresse, Departement depart, String banque, String bic, String iban){
		
		collab.setIntitulePoste(intitulePoste);
		collab.setAdresse(adresse);
		collab.setDepartement(depart);
		collab.setBanque(banque);
		collab.setBic(bic);
		collab.setIban(iban);
		em.merge(collab);
		
	}
	
}
