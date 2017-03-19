package missions;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;
/**
 * Le contexte d'une mission qui fait le lien entre la mission et ses états
 * @author Manuela
 *
 */
public class ContexteMission {
	private EtatMission etat;
	
	public ContexteMission(){
		etat = new EtatMissionEnPrepa();
	}
	
	/**
	 * Passer à l'état suivant du déroulement d'une mission
	 */
	public void etatSuivant(){
		try {
			etat.etatSuivant(this);
		} catch (EtatMissionIncompatibleException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void setEtat(EtatMission etat){
		System.out.println("contexte : set etat");
		System.out.println(etat.toString());
		this.etat = etat;
	}
	
	public String toString(){
		return this.etat.toString();
	}
	
	public void affecter(Mission mission, Personne personne) throws EtatMissionIncompatibleException {
		etat.affecter(this, mission, personne);
	}
	
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("Entrée contexte");//debug
		return etat.recommander(plan, personnel);
	}
	
	public ListePersonnes recommander(int nbPersonnes, ListeCompetences prerequis, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("Entrée contexte");//debug
		return etat.recommander(nbPersonnes, prerequis, personnel);
	}
	
	public void affecter(Mission mission, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("contexte");
		etat.affecter(this, mission, personnel);
	}
	
	public void enlever(Mission mission, Personne personne) throws EtatMissionIncompatibleException {
		etat.enlever(this, mission, personne);
	}
	
	public void attribuer(Mission mission, ListeCompetences competences) throws EtatMissionIncompatibleException {
		etat.attribuer(mission, competences);
	}
	
	public void majTemps(Mission mission){
		etat.majTemps(this, mission);
	}
}
