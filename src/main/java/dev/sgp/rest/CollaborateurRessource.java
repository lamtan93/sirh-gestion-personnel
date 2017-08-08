package dev.sgp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.EditerCollaborateurService;

@Path("/collaborateurs")
public class CollaborateurRessource {

	@EJB
	@Inject
	private CollaborateurService collabService;
	
	@EJB
	@Inject
	private EditerCollaborateurService editerService;
	
	List<Collaborateur> listCollab = new ArrayList<>();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Collaborateur> listCollabs (){
		
		 listCollab = collabService.getListeCollaborateurs();
		 
//		 return Response.status(200)
//				 .entity(listCollab)
//				 .header("Access-Control-Allow-Origin", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
//				 .build(); 
		 
		return listCollab;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/byDepartement/{id}")
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
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{matricule}")
	public void editerCollaborateur(@PathParam("matricule")String matricule, Collaborateur collab){
		
		Collaborateur collabToModifie = editerService.findCollaborateurByMatricule(matricule);
		editerService.editerCollaborateur(collabToModifie, collab.getIntitulePoste(), collab.getAdresse(), collab.getDepartement(), collab.getBanque(), collab.getBic(), collab.getIban());
		
	}
	
	
	@GET
	@Path("/{matricule}/banque")
	@Produces(MediaType.APPLICATION_JSON)
	public String getInfosBankByMatriculeCollab (@PathParam("matricule") String matricule){
		
		Collaborateur collab = editerService.findCollaborateurByMatricule(matricule);
		
		String infosBanque = collab.getBanque() + " " + collab.getBic()+ " " + collab.getIban();
		
		return infosBanque;
}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{matricule}/banque")
	@Produces(MediaType.APPLICATION_JSON)
	public void modifieInfosBankByMatriculeCollab (@PathParam("matricule") String matricule, Collaborateur collabInput){
		
		Collaborateur collab = editerService.findCollaborateurByMatricule(matricule);
		
		editerService.editerCollaborateur(collab, collab.getIntitulePoste(), collab.getAdresse(), collab.getDepartement(), collabInput.getBanque(), collabInput.getBic(), collabInput.getIban());	
		
}
	
	
	
}
