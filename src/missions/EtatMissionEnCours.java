package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class EtatMissionEnCours extends EtatMission implements IEtatMission{

	protected EtatMissionEnCours() {
		super(EtatMissionType.EnCours);
	}

	@Override
	public void etatSuivant(ContexteMission contexte) {
		// TODO Auto-generated method stub
		
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

}
