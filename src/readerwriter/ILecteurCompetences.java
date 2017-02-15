package readerwriter;

import ressources.ListeCompetences;
/**
 * Interface permettant de lier le lecteur de comp�tences � un client
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface ILecteurCompetences extends ILecteur{
	/**
	 * Lire une liste de comp�tences
	 * 
	 * @return Une liste de comp�tences
	 */
	public abstract ListeCompetences lireCompetences ();	
}
