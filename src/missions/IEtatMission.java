package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public interface IEtatMission {

	public void etatSuivant(ContexteMission contexte);
	/**
	 * Recommander des personnes pour une mission
	 * @param plan Le plan de compétenes nécessaires pour la mission
	 * @param liste La liste des candidats
	 * @return Une liste de personnes
	 */
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) throws EtatMissionIncompatibleException;
	
	/**
	 * Affecter une personne à une mission
	 * @param contexte Le contexte de la mission
	 * @param mission La mission
	 * @param personne La personne à afecter
	 */
	public void affecter(ContexteMission contexte, Mission mission, Personne personne)  throws EtatMissionIncompatibleException;
	
	/**
	 * Affecter une liste de personnes à une mission
	 * @param contexte Le contexte de la mission
	 * @param mission La mission
	 * @param liste La liste de personnes à affecter
	 */
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste)  throws EtatMissionIncompatibleException;
}
