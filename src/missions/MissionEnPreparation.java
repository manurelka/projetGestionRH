package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class MissionEnPreparation extends EtatMission implements IMissionAffectable{
	public MissionEnPreparation(){
		super(EtatMissionType.EnPreparation);
	}
	
	@Override
	public ListePersonnes[] recommander(Mission mission, ListePersonnes liste){
		return new ListePersonnes[4];
	}

	@Override
	public void affecter(Mission mission, Personne personne) {
		// TODO Auto-generated method stub
		
	}

}
