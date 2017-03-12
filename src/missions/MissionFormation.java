package missions;
import ressources.ListeCompetences;

public class MissionFormation extends Mission {
	private ListeCompetences prerequis;
	private ListeCompetences objectifs;
	
	public MissionFormation(String nom, int nbPersonnes, int jour, int mois, int annee, int duree){
		super(nom, nbPersonnes, jour, mois, annee, duree);
	}
}
