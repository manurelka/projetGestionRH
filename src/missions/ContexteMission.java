package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class ContexteMission {
	private EtatMission etat;
	
	public ContexteMission(){
		etat = new EtatMissionEnPrepa();
	}
	
	public void etatSuivant(){
		etat.etatSuivant(this);
	}
	
	public void setEtat(EtatMission etat){
		System.out.println("set etat");
		System.out.println(etat.toString());
		this.etat = etat;
	}
	
	public String toString(){
		return this.etat.toString();
	}
	
	public void affecter(Mission mission, Personne personne){
		System.out.println("contexte");
		etat.affecter(this, mission, personne);
	}
	
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("Entrée contexte");//debug
		return etat.recommander(plan, personnel);
	}
	
	public void affecter(Mission mission, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("contexte");
		etat.affecter(this, mission, personnel);
	}
}
