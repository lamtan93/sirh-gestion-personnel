package dev.sgp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@Stateless
@ApplicationScoped
public class CollaborateurService {

	@Inject Event<CollabEvt> collabEvt;

	@PersistenceContext(unitName="sgp-pu")
	private EntityManager em;
	
	
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	public CollaborateurService(){
		
	}
	
	public List<Collaborateur> getListeCollaborateurs() {
	return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {
		
		
		
	listeCollaborateurs.add(collab);
	
	collabEvt.fire(new CollabEvt(new Date(),TypeCollabEvt.CREATION_COLLAB, collab.getMatricule()));
	
	}
	
	
	
	
}
