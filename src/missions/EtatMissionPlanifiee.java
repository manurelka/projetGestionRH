package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class EtatMissionPlanifiee extends EtatMission {

	protected EtatMissionPlanifiee() {
		super(EtatMissionType.Planifiee);
	}
	
	@Override
	public void etatSuivant(ContexteMission contexte){
		contexte.setEtat(new EtatMissionEnCours());
	}
	
	@Override
	public void enlever(ContexteMission contexte, Mission mission, Personne personne){
		mission.getPersonnel().supprimer(personne);
	}
	
	@Override
	public void affecter(ContexteMission contexte, Mission mission, Personne personne) {	
		
		if ( (mission.getNbPersonnes() > mission.getNbPersonnesEffectif()) && (!Mission.estOccupe(personne)) ) {
			mission.getPersonnel().ajouter(personne);
			Mission.occuper(personne);
		}
	}
	
	@Override
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste) {
		
		for (Personne personne : (Personne[]) liste.getTab()) {
			affecter(contexte, mission, personne);
		}
	}
}
