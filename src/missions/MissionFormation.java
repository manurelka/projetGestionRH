package missions;
import java.util.Date;

import ressources.Calendrier;
import ressources.Competence;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;
/**
 * Une mission de formation caractérisée par une liste de prérequis et une liste de compétences visées (objectifs)
 * @author Manuela
 *
 */
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
	 * Ajouter une compétence aux prérequis de la mission
	 * @param prerequis La compétence à ajouter
	 */
	public void add(Competence prerequis){
		this.prerequis.ajouter(prerequis);
	}
	
	/**
	 * Ajouter une liste de compétences aux prérequis pour la formation
	 * @param prerequis La liste de compétences à ajouter 
	 */
	public void add(ListeCompetences prerequis){
		this.prerequis.ajouter(prerequis);
	}
	
	/**
	 * Ajouter une compétence aux objectifs de la mission
	 * @param prerequis La compétence à ajouter
	 */
	public void objectif(Competence objectif){
		this.objectifs.ajouter(prerequis);
	}
	
	/**
	 * Ajouter une liste de compétences aux objectifs pour la formation
	 * @param prerequis La liste de compétences à ajouter 
	 */
	public void objectif(ListeCompetences objectifs){
		this.objectifs.ajouter(objectifs);
	}
	
	/**
	 * Attribuer des compétences aux personnes à la fin de la formation
	 */
	public void attribuer(){
		try {
			super.attribuer(objectifs);
		} catch (EtatMissionIncompatibleException e) {
			System.out.println(e.getMessage());
		}
	}
}
