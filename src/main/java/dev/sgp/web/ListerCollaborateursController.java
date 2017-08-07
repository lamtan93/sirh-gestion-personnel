package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;


@WebServlet("/collaborateurs/lister")
public class ListerCollaborateursController extends HttpServlet {
	
	@EJB
	@Inject 
	CollaborateurService collabService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		
		
		req.setAttribute("listeCollaborateurs", collabService.getListeCollaborateurs());

		String matricule = req.getParameter("matriculeCollabMore");
		
		if(matricule!=null){
			Collaborateur collabMore = collabService.getCollabByMatricule(matricule);
			req.setAttribute("collabMore", collabMore);
			
		}
		
		
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		
		String inputRecherche = req.getParameter("inputRecherche");
		String choixSelected = req.getParameter("choixSelected");
		
		if(inputRecherche!=null || choixSelected !=null){
		List<Collaborateur> listCollab = collabService.listcollabsBeginByNomOrPrenom(inputRecherche);	
		req.setAttribute("listCollabsAfterRecherecheByAlpha", listCollab);
		}
		
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
		
		
		
	}
	
	
}
