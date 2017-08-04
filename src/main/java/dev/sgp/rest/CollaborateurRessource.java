package dev.sgp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@Path("/collaborateurs")
public class CollaborateurRessource {

	@EJB
	@Inject
	private CollaborateurService collabService;
	
	
	List<Collaborateur> listCollab = new ArrayList<>();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Collaborateur> listCollabs (){
		
		 listCollab = collabService.getListeCollaborateurs();
		return listCollab;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/collabByIdDepart/{id}")
	public List<Collaborateur> listCollabByIdDepartement(@PathParam("id")int id){
		
		listCollab = collabService.getListCollabByIdDepart(id);
		
		return listCollab;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{matricule}")
	public Collaborateur collabByMatricule(@PathParam("matricule")String matricule){
		
		Collaborateur collab = collabService.getCollabByMatricule(matricule);
		
		return collab;
	}
	
	
}
