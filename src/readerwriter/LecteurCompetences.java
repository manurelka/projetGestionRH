package readerwriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import ressources.Competence;
import ressources.DomaineCompetences;
import ressources.ListeCompetences;
/**
 * Voir ILecteurCompetences
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class LecteurCompetences extends Lecteur implements ILecteurCompetences {
	private static final String CHEMIN = "fichConfig/liste_competences.csv";
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
			// Ovrir le flux d'entrée
			openFlux();
			
			// Remplir le conteneur des données
			ConteneurStr conteneur = new ConteneurStr();
			remplir(conteneur);
			
			//Utiliser un splitter pour extraire la liste des compétences du conteneur
			SplitterCompetences splitter = new SplitterCompetences();
			liste = splitter.getCompetences(conteneur);
			
		} catch(FileNotFoundException e){
			// TODO une meilleure gestion des messsages d'erreur
			System.out.println("Le fichier est introuvable.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Porblème lors de la lecture des données.");
			e.printStackTrace();
		} finally {
			//Fermer le flux d'entrée (à faire dans tous les cas)
			try {
				closeFlux();
			} catch (IOException e) {
				System.out.println("Porblème lors de la fermeture du fichier.");
				e.printStackTrace();
			}
		}
		
		return liste;
		
	}
}
