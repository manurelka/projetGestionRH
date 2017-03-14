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
public interface IListeRessources<T, E extends Ressource<T>> {
	/**
	 * Ajoute une ressource dans la collection des ressources.
	 * 
	 * @param objet L'objet à ajouter de type générique
	 */
	public abstract void ajouter(Ressource<T> objet);
	
	/**
	 * Supprime une ressource dans la collection des ressources.
	 * 
	 * @param objet L'objet à supprimer de type générique
	 */
	public abstract void supprimer(Ressource<T> objet);

	/**
	 * Ajoute plusieurs ressources dans la collection.
	 * 
	 * @param objets La collection de compétences à ajouter
	 */
	public abstract void ajouter(IListeRessources<T, Ressource<T>> objets);
	
	public abstract void ajouter(Collection<Ressource<T>> objets);
	/**
	 * Vérifie si une ressource est ajoutée dans la collection.
	 * 
	 * @param objet L'objet à rechercher
	 * @return bollean
	 */
	public abstract boolean estAjoute(Ressource<T> objet);
	
	/**
	 * Affiche la collection de ressources.
	 */
	public abstract void afficher();
	
	/**
	 * Renvoit la liste des ressources sous forme d'un tableau.
	 */
	public abstract Ressource<T>[] getTab();
	
	/**
	 * Renvoit vrai s'il n'y a pas de ressources dans la liste
	 */
	public boolean isEmpty();
	
	public int taille();
}
