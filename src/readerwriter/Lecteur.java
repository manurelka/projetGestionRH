package readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Lecteur {
	private BufferedReader flux;
	private String chemin;
	
	public Lecteur(String str){
		this.chemin = str;
	}
	
	public void openFlux () throws FileNotFoundException{
		if (flux == null){
			flux = new BufferedReader (new FileReader (chemin));
		}
	}

	public void closeFlux () throws IOException{
		if (flux != null){
			flux.close();
		}
	}

	
	public ArrayList<String> readLine () throws IOException{
		ArrayList<String> rep = new ArrayList<>();
		if(flux == null){
			openFlux();
		}
		while ( flux.ready()){
			rep.add(flux.readLine());		}
		return rep;
	}
}
