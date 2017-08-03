package dev.sgp.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.ActiviteService;

@WebServlet("/activites")
public class ActivitesController extends HttpServlet{
	
	@Inject ActiviteService activService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		request.setAttribute("listCollabActivites", activService.listerActivitesCollab());
		
		request.getRequestDispatcher("/WEB-INF/views/collab/activites.jsp").forward(request, response);
		
		
	}
	
}
