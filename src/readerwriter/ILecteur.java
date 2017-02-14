package readerwriter;
/*
 * Interface permettant de lire un flux d'entr� et de rmeplir un conteneur de donn�es
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ILecteur {
	/*
	 * Ouvrir un flux d'entr�e.
	 */
	public abstract void openFlux() throws FileNotFoundException;
	
	/*
	 * Fermer un flux d'entr�e.
	 */
	public abstract void closeFlux() throws IOException;
	
	/*
	 * Remplir un conteneur de donn�es.
	 */
	public abstract void remplir(IConteneurStr conteneur) throws IOException;
}
