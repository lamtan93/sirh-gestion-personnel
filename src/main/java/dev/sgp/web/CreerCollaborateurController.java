package dev.sgp.web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;
import dev.sgp.util.generationMatricule;

public class CreerCollaborateurController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		req.getRequestDispatcher("/WEB-INF/views/collab/creationCollaborateur.jsp")
		.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		
		String matricule = generationMatricule.generateMatricule();
		String nom = req.getParameter("inputNom");
		String prenom = req.getParameter("inputPrenom");
		String dateDeNaissance = req.getParameter("inputDateNaissance");
		String adresse = req.getParameter("inputAdresse");
		String numSecure = req.getParameter("inputNumeroSecure");
		
		
		String emailPro = prenom+"."+nom+"@societe.com";	
		
		Collaborateur collab = new Collaborateur();
		
		collab.setMatricule(matricule);
		collab.setNom(nom);
		collab.setPrenom(prenom);
		collab.setDateNaissance(new Date());
		collab.setDateHeureCreation(new Date());
		collab.setAdresse(adresse);
		collab.setNumSecure(numSecure);
		collab.setEmailPro(emailPro);
		
		try {
			collabService.sauvegarderCollaborateur(collab);
			List<Collaborateur> listCollaborateurs = collabService.getListeCollaborateurs();
			
			req.setAttribute("listeCollaborateurs", listCollaborateurs);
			
			resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
			
		} catch (Exception e) {
			req.getRequestDispatcher("/WEB-INF/views/collab/creationCollaborateur.jsp")
			.forward(req, resp);
			
		}
			
		req.getRequestDispatcher("/WEB-INF/views/collab/creationCollaborateur.jsp")
		.forward(req, resp);
	}
	
	
	
	
}
