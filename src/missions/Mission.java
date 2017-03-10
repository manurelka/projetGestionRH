package missions;

import ressources.Date;
import ressources.ListeCompetences;
import ressources.ListePersonnes;

public abstract class Mission {
	private int nbPersonnes;
	private PlanCompetences plan;
	private Date dateDebut;
	private int duree;
	private EtatMission etat;
	private ListePersonnes personnel;
	
}
