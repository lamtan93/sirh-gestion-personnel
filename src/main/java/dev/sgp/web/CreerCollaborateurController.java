package dev.sgp.web;

import java.io.IOException;
import java.util.Date;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.generationMatricule;

@WebServlet("/collaborateurs/creer")
public class CreerCollaborateurController extends HttpServlet {


	@EJB
	@Inject 
	private CollaborateurService collabService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		req.getRequestDispatcher("/WEB-INF/views/collab/creationCollaborateur.jsp").forward(req, resp);
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
			req.setAttribute("message", "Création OK !");
			resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
			
		} catch (Exception e) {
			req.getRequestDispatcher("/WEB-INF/views/collab/creationCollaborateur.jsp")
			.forward(req, resp);
			
		}
			
		req.getRequestDispatcher("/WEB-INF/views/collab/creationCollaborateur.jsp")
		.forward(req, resp);
	}
	
	
	
	
}
