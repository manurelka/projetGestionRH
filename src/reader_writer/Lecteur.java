package reader_writer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.FileInputStream;
import java.io.File;
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
	public void openFlux () throws FileNotFoundException, UnsupportedEncodingException{
		if (flux == null){
			flux = new BufferedReader (new InputStreamReader( new FileInputStream( new File(chemin)), "UTF8"));
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
		flux.readLine();// on n'a pas besoin de la première ligne pour l'instant
		while ( flux.ready()){
			//System.out.println(flux.readLine()); // debug
			conteneur.addLine(flux.readLine());
		}
	}
}
