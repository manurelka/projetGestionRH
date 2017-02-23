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
	
	protected void openWriter() throws FileNotFoundException, IOException {
		if (!isInit()){
			FileOutputStream fileStream = new FileOutputStream(new File(chemin));
			writer = new OutputStreamWriter(fileStream, "UTF-8");
		}
	}

	protected void closeWriter() throws IOException {
		if(isInit()){
			writer.close();
			writer = null;
		}	
	}

	protected void ecrire(String ligne) throws IOException{
		if(!isInit()){
			openWriter();
		}
		writer.write(ligne + "\n");
	}
	
	private boolean isInit(){
		return !(writer == null);
	}
}
