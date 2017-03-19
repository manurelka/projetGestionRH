package missions;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public abstract class EtatMission implements IEtatMission {
	private EtatMissionType ETAT;
	
	protected EtatMission(EtatMissionType etat){
		this.ETAT = etat;
	}
	
	public String toString(){
		return ETAT.toString();
	}
	
	@Override
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) throws EtatMissionIncompatibleException{
		throw new EtatMissionIncompatibleException();
	}
	
	@Override
	public ListePersonnes recommander(int nbPersonnes, ListeCompetences prerequis, ListePersonnes liste) throws EtatMissionIncompatibleException{
		throw new EtatMissionIncompatibleException();
	}

	@Override
	public void affecter(ContexteMission contexte, Mission mission, Personne personne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste) throws EtatMissionIncompatibleException{
		throw new EtatMissionIncompatibleException();
	}

	@Override
	public void etatSuivant(ContexteMission contexte) throws EtatMissionIncompatibleException {
		throw new EtatMissionIncompatibleException();
	}
	
	@Override
	public void enlever(ContexteMission contexte, Mission mission, Personne personne) throws EtatMissionIncompatibleException {
		throw new EtatMissionIncompatibleException();
	}
	
	@Override
	public void majTemps(ContexteMission contexte, Mission mission){
		if (mission.dateFinPassee()) {
			contexte.setEtat(new EtatMissionTerminee());
		}
		
		if (mission.dateDebutPassee()) {
			contexte.setEtat(new EtatMissionEnCours());
		}
	}
	
	@Override
	public void attribuer(Mission mission, ListeCompetences competences) throws EtatMissionIncompatibleException {
		throw new EtatMissionIncompatibleException();
	}
}
