package missions;

import ressources.Competence;
import ressources.ListeCompetences;
import ressources.Personne;

public class EtatMissionTerminee extends EtatMission {
	public EtatMissionTerminee(){
		super(EtatMissionType.Terminee);
	}
	
	@Override
	public void attribuer(Mission mission, ListeCompetences competences){
		for (Personne personne : mission.getPersonnel().getTab()) {
			personne.ajouterCompetence(competences);
		}
	}
}
