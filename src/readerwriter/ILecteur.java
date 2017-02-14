package readerwriter;
/*
 * Interface permettant de lire un flux d'entré et de rmeplir un conteneur de données
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ILecteur {
	/*
	 * Ouvrir un flux d'entrée.
	 */
	public abstract void openFlux() throws FileNotFoundException;
	
	/*
	 * Fermer un flux d'entrée.
	 */
	public abstract void closeFlux() throws IOException;
	
	/*
	 * Remplir un conteneur de données.
	 */
	public abstract void remplir(IConteneurStr conteneur) throws IOException;
}
