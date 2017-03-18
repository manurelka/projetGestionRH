package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public interface IEtatMission {

	public void etatSuivant(ContexteMission contexte);
	/**
	 * Recommander des personnes pour une mission
	 * @param plan Le plan de comp�tenes n�cessaires pour la mission
	 * @param liste La liste des candidats
	 * @return Une liste de personnes
	 */
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) throws EtatMissionIncompatibleException;
	
	/**
	 * Affecter une personne � une mission
	 * @param contexte Le contexte de la mission
	 * @param mission La mission
	 * @param personne La personne � afecter
	 */
	public void affecter(ContexteMission contexte, Mission mission, Personne personne)  throws EtatMissionIncompatibleException;
	
	/**
	 * Affecter une liste de personnes � une mission
	 * @param contexte Le contexte de la mission
	 * @param mission La mission
	 * @param liste La liste de personnes � affecter
	 */
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste)  throws EtatMissionIncompatibleException;
}
