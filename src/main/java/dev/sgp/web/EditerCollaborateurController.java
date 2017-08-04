package dev.sgp.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.EditerCollaborateurService;


@WebServlet("/collaborateurs/editer")
public class EditerCollaborateurController extends HttpServlet {

	@EJB
	@Inject
	private EditerCollaborateurService editerService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
	
		String matricule = req.getParameter("matriculeCollab");
		
		Collaborateur collab = editerService.findCollaborateurByMatricule(matricule);
		
		if(collab!=null){
			req.setAttribute("collabCurrent", collab);
		}else{
			req.setAttribute("message", "Non trouvé !");
		}
		
		req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp")
		.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		
		String matricule = req.getParameter("matriculeCollab");
		String intitulePoste = req.getParameter("inputIntitulePoste");
		String departement = req.getParameter("inputDepartement");
		String banque = req.getParameter("inputBanque");
		String bic = req.getParameter("inputBic");
		String iban = req.getParameter("InputIban");
		String adresse = req.getParameter("inputAdresse");
		Collaborateur collab = editerService.findCollaborateurByMatricule(matricule);
		
		try {
			editerService.editerCollaborateur(collab, intitulePoste,adresse, new Departement(departement), banque, bic, iban);
			req.setAttribute("message", "Edited OK !");
			req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp")
			.forward(req, resp);
		} catch (Exception e) {
			req.setAttribute("message", "Edited KO !");
		}
		
		
		
		
	}
	
}
