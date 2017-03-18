package missions;
import ressources.Competence;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class MissionFormation extends Mission {
	private ListeCompetences prerequis;
	private ListeCompetences objectifs;
	
	public MissionFormation(String nom, int nbPersonnes, int jour, int mois, int annee, int duree){
		super(nom, nbPersonnes, jour, mois, annee, duree);
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
