package dev.sgp.entite;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisiteWeb {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String chemin;
	private int tempsExecution;
	
	public VisiteWeb() {
			
	}
	
	
	public VisiteWeb(int id, String chemin, int tempsExecution) {
		
		this.id = id;
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public int getTempsExecution() {
		return tempsExecution;
	}
	public void setTempsExecution(int tempsExecution) {
		this.tempsExecution = tempsExecution;
	}


	@Override
	public String toString() {
		return "VisiteWeb [id=" + id + ", chemin=" + chemin + ", tempsExecution=" + tempsExecution + "]";
	}
	
	
	
}
