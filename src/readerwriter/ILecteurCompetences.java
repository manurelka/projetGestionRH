package readerwriter;

import ressources.ListeCompetences;
/**
 * Interface permettant de lier le lecteur de compétences à un client
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface ILecteurCompetences extends ILecteur{
	/**
	 * Lire une liste de compétences
	 * 
	 * @return Une liste de compétences
	 */
	public abstract ListeCompetences lireCompetences ();	
}
