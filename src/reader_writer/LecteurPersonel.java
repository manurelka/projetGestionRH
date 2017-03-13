package reader_writer;

import java.io.FileNotFoundException;
import java.io.IOException;

import ressources.ListeCompetences;
import ressources.ListePersonnes;

public class LecteurPersonel extends Lecteur implements ILecteurPersonnel {
	private static final String CHEMIN = "fichConfig/liste_personnel.csv";
	private static LecteurPersonel instance = null;

	private LecteurPersonel() {
		super(CHEMIN);
	}

	public static LecteurPersonel Instance() {
		if (instance == null) {
			instance = new LecteurPersonel();
		}
		return instance;
	}

	@Override
	public ListePersonnes lirePersonnel() {
		// System.out.println("Je lis les personnes");//debug
		ListePersonnes liste = new ListePersonnes();
		try {
			// Ovrir le flux d'entr�e
			openFlux();

			// Remplir le conteneur des donn�es
			ConteneurStr conteneur = new ConteneurStr();
			remplir(conteneur);
			

			// Utiliser un splitter pour extraire la liste des personnes du
			// conteneur
			SplitterPersonnel splitter = new SplitterPersonnel();
			liste = splitter.getPersonnel(conteneur);

		} catch (FileNotFoundException e) {
			// TODO une meilleure gestion des messsages d'erreur
			System.out.println("Le fichier est introuvable.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Porbl�me lors de la lecture des donn�es.");
			e.printStackTrace();
		} finally {
			// Fermer le flux d'entr�e (� faire dans tous les cas)
			try {
				closeFlux();
			} catch (IOException e) {
				System.out.println("Porbl�me lors de la fermeture du fichier.");
				e.printStackTrace();
			}
		}

		return liste;
	}
}
