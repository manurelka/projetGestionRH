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

}
