package dev.sgp.entite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CollabEvt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date dateHeure; 
	private TypeCollabEvt typeCollabEvt;
	private String matricule;
	
	public CollabEvt() {
	
	}

	public CollabEvt(Date dateHeure, TypeCollabEvt typeCollabEvt, String matricule) {
		
		this.dateHeure = dateHeure;
		this.typeCollabEvt = typeCollabEvt;
		this.matricule = matricule;
	}

	public Date getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}

	public TypeCollabEvt getTypeCollabEvt() {
		return typeCollabEvt;
	}

	public void setTypeCollabEvt(TypeCollabEvt typeCollabEvt) {
		this.typeCollabEvt = typeCollabEvt;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public String toString() {
		return "CollabEvt [dateHeure=" + dateHeure + ", typeCollabEvt=" + typeCollabEvt + ", matricule=" + matricule
				+ "]";
	} 
	
	
	
	
}
