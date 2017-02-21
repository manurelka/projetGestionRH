package readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Voir ILecteur
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public abstract class Lecteur extends GestionnaireFlux implements ILecteur{
	private BufferedReader flux;
	
	public Lecteur(String str){
		super(str);
	}
	
	@Override
	public void openFlux () throws FileNotFoundException{
		if (flux == null){
			flux = new BufferedReader (new FileReader (chemin));
		}
	}
	
	@Override
	public void closeFlux () throws IOException{
		if (flux != null){
			flux.close();
		}
	}

	@Override
	public void remplir(IConteneurStr conteneur) throws IOException{
		if(flux == null){
			openFlux();
		}
		while ( flux.ready()){
			conteneur.addLine(flux.readLine());
		}
	}
}
