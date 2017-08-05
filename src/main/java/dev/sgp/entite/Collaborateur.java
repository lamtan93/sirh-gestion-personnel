package dev.sgp.entite;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Collaborateur implements Serializable{
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
       
    private String matricule;
	private String nom;
	private String prenom;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date dateNaissance;
	private String adresse;
	private String numSecure;
	private String emailPro;
	private String photo;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date dateHeureCreation;
	private boolean actif;
	
	
	private String intitulePoste;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Departement departement;
	
	
	private String banque;
	private String bic;
	private String iban;
	
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

	
	
	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", numSecure=" + numSecure + ", emailPro=" + emailPro
				+ ", photo=" + photo + ", dateHeureCreation=" + dateHeureCreation + ", actif=" + actif
				+ ", intitulePoste=" + intitulePoste + ", departement=" + departement + "]";
	}

	public Collaborateur(){}
	
	
	public Collaborateur(String matricule, String nom, String prenom, Date dateNaissance, String adresse,
			String numSecure, String emailPro, String photo, Date dateHeureCreation, boolean actif) {
		
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

	public Collaborateur(String matricule, String nom, String prenom, Date dateNaissance, String adresse,
			String numSecure, String emailPro, String photo, Date dateHeureCreation, boolean actif,
			String intitulePoste, Departement departement) {
		
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
		this.intitulePoste = intitulePoste;
		this.departement = departement;
	}

	public Collaborateur(String matricule, String nom, String prenom, Date dateNaissance, String adresse,
			String numSecure, String emailPro, String photo, Date dateHeureCreation, boolean actif,
			String intitulePoste,  String banque, String bic, String iban, Departement dept) {
		
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
		this.intitulePoste = intitulePoste;
		
		this.banque = banque;
		this.bic = bic;
		this.iban = iban;
                this.departement = dept;
               
	}
	
	
	
	
}
