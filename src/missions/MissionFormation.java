package missions;
import java.util.Date;

import ressources.Calendrier;
import ressources.Competence;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class MissionFormation extends Mission {
	private ListeCompetences prerequis;
	private ListeCompetences objectifs;
	
	public MissionFormation(String nom, int nbPersonnes, String ddMMyyyy, int duree){
		this(nom, nbPersonnes, Calendrier.date(ddMMyyyy), duree);
	}
	
	public MissionFormation(String nom, int nbPersonnes, Date date, int duree){
		super(nom, nbPersonnes, date, duree);
		this.prerequis = new ListeCompetences();
		this.objectifs = new ListeCompetences();
	}
	
	public ListePersonnes recommander(ListePersonnes candidats){
		
		try {
			return super.recommander(prerequis, candidats);
		} catch (EtatMissionIncompatibleException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/**
	 * Ajouter une comp�tence aux pr�requis de la mission
	 * @param prerequis La comp�tence � ajouter
	 */
	public void add(Competence prerequis){
		this.prerequis.ajouter(prerequis);
	}
	
	/**
	 * Ajouter une liste de comp�tences aux pr�requis pour la formation
	 * @param prerequis La liste de comp�tences � ajouter 
	 */
	public void add(ListeCompetences prerequis){
		this.prerequis.ajouter(prerequis);
	}
}
