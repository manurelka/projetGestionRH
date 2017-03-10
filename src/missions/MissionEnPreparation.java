package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public class MissionEnPreparation extends EtatMission implements IMissionAffectable{

	@Override
	public ListePersonnes recommander(Mission mission, ListePersonnes liste){
		// TODO Auto-generated method stub
		return new ListePersonnes();
	}

	@Override
	public void affacter(Mission mission, Personne personne) {
		// TODO Auto-generated method stub
		
	}

}
