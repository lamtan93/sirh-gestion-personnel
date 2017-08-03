package dev.sgp.filtre;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteService;



@WebFilter(urlPatterns= {"/*"},
description = "Request Timer filter") 
public class FrequentationFilter implements Filter {
	
	private ServletContext context;

	
	@Inject private VisiteService visiteService; 

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String URI = req.getRequestURI();
		
		
		
		
		if(URI.equalsIgnoreCase("/sgp/collaborateurs/creer")){
			VisiteWeb visiteWeb = new VisiteWeb();
			long start = System.currentTimeMillis();
			
			chain.doFilter(req, res);
			
			long end = System.currentTimeMillis();
			long tempsExecution = end-start;
			
			visiteWeb.setId(visiteWeb.getId()+1);
			visiteWeb.setChemin(URI);
			visiteWeb.setTempsExecution((int)tempsExecution);
			
			
			visiteService.sauvegarderVisiteWeb(visiteWeb);

		}
		
		if(URI.equalsIgnoreCase("/sgp/collaborateurs/lister")){
			
			VisiteWeb visiteWeb = new VisiteWeb();
			long start = System.currentTimeMillis();
			
			chain.doFilter(req, res);
			
			long end = System.currentTimeMillis();
			long tempsExecution = end-start;
			
			visiteWeb.setId(visiteWeb.getId()+1);
			visiteWeb.setChemin(URI);
			visiteWeb.setTempsExecution((int)tempsExecution);
		
			visiteService.sauvegarderVisiteWeb(visiteWeb);
			
		}
		
		//req.setAttribute("listVisiteWeb", getListeVisiteWeb());
		chain.doFilter(req, res);
		
		
	}


	@Override
	public void destroy() {}
}
