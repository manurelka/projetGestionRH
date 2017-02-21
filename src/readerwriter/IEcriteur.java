package readerwriter;

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
	
}
