package missions;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class ContexteMission {
	private EtatMission etat;
	
	public ContexteMission(){
		etat = new EtatMissionEnPrepa();
	}
	
	public void etatSuivant(){
		try {
			etat.etatSuivant(this);
		} catch (EtatMissionIncompatibleException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void setEtat(EtatMission etat){
		System.out.println("set etat");
		System.out.println(etat.toString());
		this.etat = etat;
	}
	
	public String toString(){
		return this.etat.toString();
	}
	
	public void affecter(Mission mission, Personne personne) throws EtatMissionIncompatibleException {
		System.out.println("contexte");
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
}
