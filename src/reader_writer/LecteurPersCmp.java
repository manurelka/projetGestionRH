package reader_writer;

import java.io.FileNotFoundException;
import java.io.IOException;

import ressources.ListeCompetences;
import ressources.ListePersonnes;

public class LecteurPersCmp extends Lecteur implements ILecteurPersCmp{
	private static final String CHEMIN = "fichConfig/competences_personnel.csv";
	private static LecteurPersCmp instance = null;

	private LecteurPersCmp() {
		super(CHEMIN);
	}

	public static LecteurPersCmp Instance() {
		if (instance == null) {
			instance = new LecteurPersCmp();
		}
		return instance;
	}

	@Override
	public void lirePersCmp () {
		// System.out.println("Je lis les personnes et leur liste de comp�tences");//debug
				try {
					// Ovrir le flux d'entr�e
					openFlux();

					// Remplir le conteneur des donn�es
					ConteneurStr conteneur = new ConteneurStr();
					remplir(conteneur);
					

					// Utiliser un splitter pour extraire la liste des personnes du
					// conteneur
					SplitterPersCmp splitter = new SplitterPersCmp();
					splitter.affecterCompetences(conteneur);
					

				} catch (FileNotFoundException e) {
					// TODO une meilleure gestion des messsages d'erreur
					System.out.println("Le fichier est introuvable.");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Probl�me lors de la lecture des donn�es.");
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
	}
}
