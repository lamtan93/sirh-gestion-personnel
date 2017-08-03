package dev.sgp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@ApplicationScoped
public class CollaborateurService {

	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	@Inject Event<CollabEvt> collabEvt;

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
