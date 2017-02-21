package reader_writer;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IEcriteur {
	/**
	 * Ouvrir un writer.
	 */
	public abstract void openWriter() throws FileNotFoundException, IOException;
	
	/**
	 * Fermer un writer.
	 */
	public abstract void closeWriter() throws IOException;
	
	/**
	 * Ecrire une ligne dans le fichier.
	 */
	public abstract void ecrire(String ligne) throws IOException;
	
}
