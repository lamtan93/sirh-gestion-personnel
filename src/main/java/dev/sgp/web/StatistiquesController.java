package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.VisiteService;
import dev.sgp.util.Constantes;


@WebServlet("/statistiques")
public class StatistiquesController extends HttpServlet {
	
	private VisiteService visiteService = Constantes.VISITE_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{

	req.setAttribute("listVisiteWeb", visiteService.getListeVisiteWeb());	
		
	req.getRequestDispatcher("/WEB-INF/views/collab/statistiquesVisite.jsp").forward(req, resp);
		
	}

}