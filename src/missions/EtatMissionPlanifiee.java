package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class EtatMissionPlanifiee extends EtatMission {

	protected EtatMissionPlanifiee() {
		super(EtatMissionType.Planifiee);
	}

	@Override
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void affecter(ContexteMission contexte, Mission mission, Personne personne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void etatSuivant(ContexteMission contexte) {
		// TODO Auto-generated method stub
		
	}

}
