package missions;

public class MissionRealisation extends Mission {
	private PlanCompetences plan;
	
	public MissionRealisation(String nom, int nbPersonnes, int jour, int mois, int annee, int duree){
		super(nom, nbPersonnes, jour, mois, annee, duree);
	}
}
