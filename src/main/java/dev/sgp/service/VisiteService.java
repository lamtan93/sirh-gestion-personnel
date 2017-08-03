package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.sgp.entite.VisiteWeb;

@ApplicationScoped
public class VisiteService {
	List<VisiteWeb> listeVisiteWeb = new ArrayList<>();
	
	public VisiteService(){
		
	}

	public List<VisiteWeb> getListeVisiteWeb() {
		return listeVisiteWeb;
	}

	public void sauvegarderVisiteWeb(VisiteWeb visiteWeb) {
		listeVisiteWeb.add(visiteWeb);
	}

}
