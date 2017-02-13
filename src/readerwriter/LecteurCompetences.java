package readerwriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import ressources.Competence;
import ressources.DomaineCompetences;
import ressources.ListeCompetences;

public class LecteurCompetences extends Lecteur implements ILecteurCompetences {
	private static final String CHEMIN = "FichiersConfiguration/liste_competences.csv";
	private static LecteurCompetences instance = null;
	
	private LecteurCompetences (){
		super(CHEMIN);
	}
	
	public static LecteurCompetences Instance (){
		if ( instance == null){
			instance = new LecteurCompetences();
		}
		return instance;
	}

	public  ListeCompetences lireCompetences (){
		ListeCompetences liste = new ListeCompetences();
		try {
			openFlux();
			ArrayList <String> lignes = readLine();
			// TODO Revoir attribut lignes
			closeFlux();
			for( String ligne : lignes){
				String [] tab = ligne.split(";");
				String [] domaineCode = tab[0].split("");
				// TODO A spliter par point
				liste.ajouterCompetence(new Competence(DomaineCompetences.parseDomaine(domaineCode[0]), 
										Integer.parseInt(domaineCode[2]), tab[1], tab[2]));
			}
		} catch(FileNotFoundException e){
			System.out.println("Le fichier est introuvable.");
		} catch (IOException e) {
			System.out.println("Porblème lors de la fermeure du fichier.");
		}
		
		return liste;
		
	}
}
