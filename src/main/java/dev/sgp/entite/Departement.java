package dev.sgp.entite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement implements Serializable{
private static final long serialVersionUID = 1L;
	@Id
	private int id;
	
	
	private String nom;
	
	@OneToMany(mappedBy = "departement")
	private Collection<Collaborateur> collaborateurs;
	
	public Departement(){
		collaborateurs = new ArrayList<>();
	}
	
	public Departement(String nom) {
		this.nom = nom;
	}
	
	public Departement(int id,String nom) {
		this.id = id;
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

	public Collection<Collaborateur> getListCollaborateurs() {
		return collaborateurs;
	}

	public void setListCollaborateurs(Collection<Collaborateur> listCollaborateurs) {
		this.collaborateurs = listCollaborateurs;
	}

}