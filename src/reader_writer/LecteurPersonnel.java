package reader_writer;

import java.io.FileNotFoundException;
import java.io.IOException;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class LecteurPersonnel extends Lecteur implements ILecteurPersonnel {
	private static final String CHEMIN = "fichConfig/liste_personnel.csv";
	private static LecteurPersonnel instance = null;

	private LecteurPersonnel() {
		super(CHEMIN);
	}

	public static LecteurPersonnel Instance() {
		if (instance == null) {
			instance = new LecteurPersonnel();
		}
		return instance;
	}

	@Override
	public ListePersonnes lirePersonnel() {
		// System.out.println("Je lis les personnes");//debug
		ListePersonnes liste = new ListePersonnes();
		try {
			// Ovrir le flux d'entrée
			openFlux();

			// Remplir le conteneur des données
			ConteneurStr conteneur = new ConteneurStr();
			remplir(conteneur);
			

			// Utiliser un splitter pour extraire la liste des personnes du
			// conteneur
			Personne.initPersonnes(); // initialiser le compteur des identifiants des personnes
			SplitterPersonnel splitter = new SplitterPersonnel();
			liste = splitter.getPersonnel(conteneur);

		} catch (FileNotFoundException e) {
			// TODO une meilleure gestion des messsages d'erreur
			System.out.println("Le fichier est introuvable.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Porblème lors de la lecture des données.");
			e.printStackTrace();
		} finally {
			// Fermer le flux d'entrée (à faire dans tous les cas)
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
