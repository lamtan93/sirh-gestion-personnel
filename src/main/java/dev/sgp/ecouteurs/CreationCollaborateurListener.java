package dev.sgp.ecouteurs;

import java.util.Date;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@WebListener
public class CreationCollaborateurListener implements ServletContextListener{
	@Inject	private CollaborateurService collabService;	

	@Override
	public void contextInitialized(ServletContextEvent sce) {
	
		Stream.of( new Collaborateur("74DVND", "NOM1", "Prenom1", new Date(), "Paris1", "12457858", "NOM1.Prenom1@societe.com", "Belle photo", new Date(), true),
				new Collaborateur("75DVND", "NOM2", "Prenom2", new Date(), "Paris2", "22457858", "NOM2.Prenom2@societe.com", "Belle photo", new Date(), true),

		 new Collaborateur("74DVND", "NOM1", "Prenom1", new Date(), "Paris1", "12457858", "NOM1.Prenom1@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("75DVND", "NOM2", "Prenom2", new Date(), "Paris2", "22457858", "NOM2.Prenom2@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("76DVND", "NOM3", "Prenom3", new Date(), "Paris3", "32457858", "NOM3.Prenom3@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("77DVND", "NOM4", "Prenom4", new Date(), "Paris4", "42457858", "NOM4.Prenom4@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("78DVND", "NOM5", "Prenom5", new Date(), "Paris5", "52457858", "NOM5.Prenom5@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("79DVND", "NOM6", "Prenom6", new Date(), "Paris6", "62457858", "NOM6.Prenom6@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("80DVND", "NOM7", "Prenom7", new Date(), "Paris7", "72457858", "NOM7.Prenom7@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("81DVND", "NOM8", "Prenom8", new Date(), "Paris8", "82457858", "NOM8.Prenom8@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("82DVND", "NOM9", "Prenom9", new Date(), "Paris9", "92457858", "NOM9.Prenom9@societe.com", "Belle photo", new Date(), true),
		 new Collaborateur("83DVND", "NOM10", "Prenon10", new Date(), "Paris10", "02457858", "NOM10.Prenom10@societe.com", "Belle photo", new Date(), true)
				)
		.forEach(collabService::sauvegarderCollaborateur);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

}
