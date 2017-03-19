package missions;

import java.util.Collection;
/**
 * La liste des missions
 * @author Manuela
 *
 */
public interface IListeMissions {
	/**
	 * Ajouter une mission à la liste
	 * @param mission
	 */
	public void ajouter(Mission mission);
	/**
	 * Ajouter une liste des missions
	 * @param liste
	 */
	public void ajouter(ListeMissions liste);
	/**
	 * Ajouter un ecollection de missions
	 * @param liste
	 */
	public void ajouter(Collection<Mission> liste);
	/**
	 * Vérifier si une mission portant le même nom que la mission en question est ajoutée à la liste
	 * @param mission
	 * @return true si une missoin portant le même nom est déjà ajoutée dans la liste 
	 */
	public boolean estAjoute(Mission mission);
	/**
	 * Supprimer une mission de la liste des missions 
	 * @param mission La mission à supprimer
	 */
	public void supprimer(Mission mission);
	/**
	 * 
	 * @return les missions de la liste sous forme d'un tableau
	 */
	public Mission[] getTab();
}
