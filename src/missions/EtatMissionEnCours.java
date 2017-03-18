package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class EtatMissionEnCours extends EtatMission {

	protected EtatMissionEnCours() {
		super(EtatMissionType.EnCours);
	}

	@Override
	public void etatSuivant(ContexteMission contexte) {
		contexte.setEtat(new EtatMissionTerminee());
	}

}
