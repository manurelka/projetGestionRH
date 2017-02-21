package reader_writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileWriter;

public abstract class Ecriteur extends GestionnaireFlux implements IEcriteur{
	private OutputStreamWriter writer ;
	
	protected Ecriteur(String chemin){
		super(chemin);
	}
	
	@Override
	public void openWriter() throws FileNotFoundException, IOException {
		if (writer == null){
			FileOutputStream fileStream = new FileOutputStream(new File(chemin));
			writer = new OutputStreamWriter(fileStream, "UTF-8");
		}
	}

	@Override
	public void closeWriter() throws IOException {
		writer.close();
	}

	@Override
	public void ecrire(String ligne) throws IOException{
		writer.write(ligne + "\n");
	}
}
