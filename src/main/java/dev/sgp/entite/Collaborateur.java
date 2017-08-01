package dev.sgp.entite;

import java.util.Date;

public class Collaborateur {

	private String matricule;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String adresse;
	private String numSecure;
	private String emailPro;
	private String photo;
	private Date dateHeureCreation;
	private boolean actif;
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumSecure() {
		return numSecure;
	}

	public void setNumSecure(String numSecure) {
		this.numSecure = numSecure;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(Date dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", numSecure=" + numSecure + ", emailPro=" + emailPro
				+ ", photo=" + photo + ", dateHeureCreation=" + dateHeureCreation + ", actif=" + actif + "]";
	}

	public Collaborateur(){};
	
	public Collaborateur(String matricule, String nom, String prenom, Date dateNaissance, String adresse,
			String numSecure, String emailPro, String photo, Date dateHeureCreation, boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numSecure = numSecure;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	
	
	
}
