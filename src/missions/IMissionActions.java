package missions;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;
/**
 * La liste des acions que l'on peut effectuer sur une mission
 * @author Manuela
 *
 */
public interface IMissionActions {
	/**
	 * Recommander des personnes pour une mission de réalisation.
	 * A partir du plan de compétences nécessaires à la mission et une liste de personnel
	 * trouver les personnes qui sont les plus compatibles avec les compétences demandées.  
	 * @param plan Le plan de compétences pour une mission
	 * @param personnel La liste du personnel
	 * @return Une liste de personnes proposées pour la mission
	 * @throws EtatMissionIncompatibleException
	 */
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel) throws EtatMissionIncompatibleException;
	/**
	 * Recommander des personnes pour une formation.
	 * A partir d'une liste de prérequis pour la formation et d'une liste de personnes
	 * proposer des candidats pour la formation.
	 * @param prerequis
	 * @param personnel
	 * @return Une liste de personnes proposées pour la formation
	 * @throws EtatMissionIncompatibleException
	 */
	public ListePersonnes recommander(ListeCompetences prerequis, ListePersonnes personnel) throws EtatMissionIncompatibleException;
	/**
	 * Affecter une personne à une mission. La personne sera inscrite dans la liste des personnes occupées.
	 * @param personne
	 * @throws EtatMissionIncompatibleException
	 */
	public void affecter(Personne personne) throws EtatMissionIncompatibleException;
	/**
	 * Affecter une liste de personnes à une mission. Les personnes seront inscrites dans la liste des personnes occupées
	 * @param personnel
	 * @throws EtatMissionIncompatibleException
	 */
	public void affecter(ListePersonnes personnel) throws EtatMissionIncompatibleException;
	/**
	 * Enlever une personne de la liste du personnel pour une mission
	 * @param personne
	 * @throws EtatMissionIncompatibleException
	 */
	public void enlever(Personne personne) throws EtatMissionIncompatibleException;
	
	/**
	 * Atribuer des compétences aux personnel suite à une montée en copétences
	 * @return 
	 */
	public void attribuer(ListeCompetences competences) throws EtatMissionIncompatibleException;
}
