package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteService {
	List<VisiteWeb> listeVisiteWeb = new ArrayList<>();

	public List<VisiteWeb> getListeVisiteWeb() {
		return listeVisiteWeb;
	}

	public void sauvegarderVisiteWeb(VisiteWeb visiteWeb) {
		listeVisiteWeb.add(visiteWeb);
	}

}
