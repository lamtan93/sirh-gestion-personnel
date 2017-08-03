package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import dev.sgp.entite.Departement;

public class DepartementService {

	List<Departement> listDepartements = new ArrayList<>();
	
	public DepartementService(){
		Departement dep1 = new Departement(1,"Comptabilité");
		Departement dep2 = new Departement(2,"Ressources Humaines");
		Departement dep3 = new Departement(3,"Informatique");
		Departement dep4 = new Departement(4,"Comptabilité");
		Departement dep5 = new Departement(5,"Administratif");
		
		Stream.of(
				new Departement(1,"Comptabilité"),
				new Departement(2,"Ressources Humaines"),
				new Departement(1,"Informatique"),
				new Departement(1,"Comptabilité"),
				new Departement(1,"Administratif")
				)
		.forEach( dep->sauvegardeDepartement(dep) );
	}
	
	
	public void sauvegardeDepartement(Departement dep){
		listDepartements.add(dep);
	}
	
	public List<Departement> getListDepartement (){
		return listDepartements;
	}
	
	
}
