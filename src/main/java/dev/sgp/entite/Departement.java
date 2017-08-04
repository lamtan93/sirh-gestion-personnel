package dev.sgp.entite;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@OneToMany(mappedBy = "departement")
	private Collection<Collaborateur> listCollaborateurs;
	
	public Departement(){
		listCollaborateurs = new ArrayList<>();
	}
	
	
	
	public Departement(String nom) {
	
		
		this.nom = nom;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}



//	public Collection<Collaborateur> getListCollaborateurs() {
//		return listCollaborateurs;
//	}
//
//
//
//	public void setListCollaborateurs(Collection<Collaborateur> listCollaborateurs) {
//		this.listCollaborateurs = listCollaborateurs;
//	}
//	
	
	
	
}
