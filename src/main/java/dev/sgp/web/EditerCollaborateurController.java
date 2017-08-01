package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom =req.getParameter("prenom");
		
		String missingInfos = ""; 
		resp.setContentType("text/html");
		if(!(matricule == null) && !(titre == null) && !(nom==null) && !(prenom==null)){
			
			resp.setStatus(201, "Création d'un collaborateur OK");
			resp.getWriter().write("matricule: " + matricule + "<br>" + "titre: " + titre + "<br>" +"nom: "+ nom + "<br>"+ "prenom: " + prenom);
		}else{
			
			if(matricule == null  || matricule==""){
				missingInfos +="matricule-";
			}
			
			if(titre == null || titre==""){
				missingInfos +="titre-";
			}
			
			if(nom == null || nom==""){
				missingInfos +="nom-";
			}
			
			if(prenom == null || prenom=="") {
				missingInfos +="prenom";
			}
			
			
			resp.setStatus(400, "Erreur de création d'un collaborateur");
			resp.getWriter().write("Les paramètres suivantes sont incorrectes: "+ missingInfos);
			
		}
		
	
	}
	
}
