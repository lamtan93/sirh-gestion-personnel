package dev.sgp.ecouteurs;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

@WebListener
public class CreationCollaborateurListener implements ServletContextListener{
	
	@EJB
	@Inject	
	private CollaborateurService collabService;	
	
	@EJB
	@Inject	
	private DepartementService deparService;	

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
Departement dept01 = new Departement(1,"Comptabilité");
Departement dept02 = new Departement(2,"Ressources Humaines");
Departement dept03 = new Departement(3,"Informatique");
Departement dept04 =new Departement(4,"Administratif");
		
		
Collaborateur collab01 = new Collaborateur(1,"72DVND", "MARTIN ", "Armand", new Date(), "Paris1", "12457858", "MARTIN.Armand@societe.com", "Belle photo", new Date(), true , "Developpeur",  "Banque_Postale", "PHTDHFLMPPR", "FR71-2524-4574-0609-8888-1Y02-543",dept01);
Collaborateur collab02 = new Collaborateur(2,"73DVND", "BERNARD", "Béranger", new Date(), "Paris2", "22457858", "BERNARD.Béranger@societe.com", "Belle photo", new Date(), true, "Directeur Technique", "LCL", "PHTHUFRGHTR", "FR72-2554-4574-0609-8888-1Y02-543",dept02);
Collaborateur collab03 = new Collaborateur(3,"74DVND", "THOMAS", "Daniel", new Date(), "Paris1", "12457858", "THOMAS.Daniel@societe.com", "Belle photo", new Date(), true, "Technicien", "BNP_Parisbas", "PHTDHFRJHPR", "FR73-2554-4574-0609-7788-1Y02-543",dept03);
Collaborateur collab04 = new Collaborateur(4,"75DVND", "PETIT", "Émeric ", new Date(), "Paris2", "22457858", "PETIT.Émeric@societe.com", "Belle photo", new Date(), true, "Developpeur Java junior", "Societe_General", "PHTDHFRJHPR", "FR74-2554-4574-0609-6688-1Y02-543",dept02);
Collaborateur collab05 = new Collaborateur(5,"76DVND", "ROBERT", "Innocent", new Date(), "Paris3", "32457858", "ROBERT.Innocent@societe.com", "Belle photo", new Date(), true, "Developpeur .NET", "LCL", "PHTDHUTJHPR", "FR75-2554-4574-0609-5588-1Y02-543",dept01);
Collaborateur collab06 = new Collaborateur(6,"77DVND", "RICHARD", "Jonathan", new Date(), "Paris4", "42457858", "RICHARD.Jonathan@societe.com", "Belle photo", new Date(), true, "Architecte", "CIC", "PHTDHFRJHPR", "FR76-2554-4574-0609-1288-1Y02-543",dept04);
Collaborateur collab07 = new Collaborateur(7,"78DVND", "DURAND", "Luc", new Date(), "Paris5", "52457858", "DURAND.Luc@societe.com", "Belle photo", new Date(), true, "Directeur d'Argent", "Banque_Postale", "PHTDABCJHPR", "FR77-2554-4574-0859-8888-1Y02-543",dept01);
Collaborateur collab08 = new Collaborateur(8,"79DVND", " DUBOIS ", "Marcel", new Date(), "Paris6", "62457858", "DUBOIS.Marcel@societe.com", "Belle photo", new Date(), true, "Developpeur retraité", "Boursorama", "POKYHFRJHPR", "FR78-2554-4574-6509-8888-1Y02-543",dept04);
Collaborateur collab09 = new Collaborateur(9,"80DVND", " MOREAU ", "Michel", new Date(), "Paris7", "72457858", "MOREAU.Michel@societe.com", "Belle photo", new Date(), true, "RH",  "LCL", "PHTDHFPOUPR", "FR79-2554-4574-0609-9988-1Y02-543",dept01);
Collaborateur collab10 = new Collaborateur(10,"81DVND", "LAURENT ", "Norbert", new Date(), "Paris8", "82457858", "LAURENT.Norbert@societe.com", "Belle photo", new Date(), true, "Commercial",  "BNP_Parisbas", "PHEDYFRJHPR", "FR80-2554-4574-0609-8888-1Y02-543",dept03);
Collaborateur collab11 = new Collaborateur(11,"82DVND", "SIMON ", "Olivier", new Date(), "Paris9", "92457858", "SIMON.Olivier@societe.com", "Belle photo", new Date(), true, "RH",  "AXXA", "PHTDHFPKHPR", "FR81-2554-4574-0609-1188-1Y02-543",dept01);
Collaborateur collab12 = new Collaborateur(12,"83DVND", "MICHEL", "Raoul", new Date(), "Paris10", "02457858", "MICHEL.Raoul@societe.com", "Belle photo", new Date(), true, "Chef de projet",  "Banque_Postale", "PHTDTGHJHPR", "FR82-2554-2074-0609-8888-1Y02-543",dept03);



Stream.of(collab01,collab02,collab03,collab04,collab05,collab06,collab07,collab08,collab09,collab10,collab11,collab12
		 ).forEach(collabService::sauvegarderCollaborateur);

}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

}
