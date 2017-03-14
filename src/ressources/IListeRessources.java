package ressources;

import java.util.Collection;

/**
 * Permet la communication avec une collection de ressources
 * 
 * @author Emma, Manuela
 * @version 0.1
 * 
 * @param <T>
 */
public interface IListeRessources<T, E> {
	/**
	 * Ajoute une ressource dans la collection des ressources.
	 * 
	 * @param objet L'objet à ajouter de type générique
	 */
	public abstract void ajouter(E objet);
	
	/**
	 * Supprime une ressource dans la collection des ressources.
	 * 
	 * @param objet L'objet à supprimer de type générique
	 */
	public abstract void supprimer(E objet);

	/**
	 * Ajoute plusieurs ressources dans la collection.
	 * 
	 * @param objets La collection de compétences à ajouter
	 */
	public abstract void ajouter(IListeRessources<T, E> objets);
	
	public abstract void ajouter(Collection<E> objets);
	/**
	 * Vérifie si une ressource est ajoutée dans la collection.
	 * 
	 * @param objet L'objet à rechercher
	 * @return bollean
	 */
	public abstract boolean estAjoute(IRessource<T> objet);
	
	/**
	 * Affiche la collection de ressources.
	 */
	public abstract void afficher();
	
	/**
	 * Renvoit la liste des ressources sous forme d'un tableau.
	 */
	public abstract E[] getTab();
	
	/**
	 * Renvoit vrai s'il n'y a pas de ressources dans la liste
	 */
	public boolean isEmpty();
	
	public int taille();
}
