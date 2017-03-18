package missions;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public interface IEtatMission {
	/**
	 * Passer à l'état suivant
	 * @param contexte
	 * @throws EtatMissionIncompatibleException
	 */
	public void etatSuivant(ContexteMission contexte) throws EtatMissionIncompatibleException;
	/**
	 * Recommander des personnes pour une mission
	 * @param plan Le plan de compétenes nécessaires pour la mission
	 * @param liste La liste des candidats
	 * @return Une liste de personnes
	 */
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) throws EtatMissionIncompatibleException;
	
	/**
	 * Recommander des personnes pour une mission
	 * @param prerequis La liste de compétenes nécessaires pour suivre la formation
	 * @param liste La liste des candidats
	 * @return Une liste de personnes
	 */
	public ListePersonnes recommander(int nbPersonnes, ListeCompetences prerequis, ListePersonnes liste) throws EtatMissionIncompatibleException;
	
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
	
	/**
	 * Enlever une personne affectée de la mission
	 * @param contexte Le contexte de la mission 
	 * @param mission La mission
	 * @param personne La personne à supprimer
	 * @throws EtatMissionIncompatibleException
	 */
	public void enlever(ContexteMission contexte, Mission mission, Personne personne) throws EtatMissionIncompatibleException;
}
