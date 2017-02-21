package readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Ecriteur extends GestionnaireFlux implements IEcriteur{
	private FileWriter writer ;
	
	public Ecriteur(String chemin){
		super(chemin);
	}
	
	@Override
	public void openWriter() throws FileNotFoundException, IOException {
		if (writer == null){
			writer = new FileWriter(chemin);
		}
	}

	@Override
	public void closeWriter() throws IOException {
		writer.close();
	}

}
