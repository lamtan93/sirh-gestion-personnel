package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Departement;

@Stateless
public class DepartementService {

	@PersistenceContext(unitName="sgp-pu")private EntityManager em;
	
	List<Departement> listDepartements = new ArrayList<>();
	
	
	
	public void sauvegardeDepartement(Departement dep){
		em.persist(dep);
	}
	
	public List<Departement> getListDepartement (){
		TypedQuery<Departement> query = em.createQuery("SELECT d from Departement d", Departement.class);	
		listDepartements =  query.getResultList();
		return listDepartements;
	}
	
	
	
	
}
