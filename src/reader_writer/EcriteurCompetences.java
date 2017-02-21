package reader_writer;
import java.io.FileNotFoundException;
import java.io.IOException;
import ressources.ListeCompetences;
import ressources.Competence;

public class EcriteurCompetences extends Ecriteur implements IEcriteurCompetence {
	private static final String CHEMIN = "fichConfig/liste_competences_ecr.csv";
	private static final String EN_TETE = "Domaine.Code.;Libell� en anglais;Libell� en fran�ais";
	private static EcriteurCompetences instance = null;
	
	private EcriteurCompetences() {
		super(CHEMIN);
	}
	
	public static EcriteurCompetences Instance (){
		if ( instance == null){
			instance = new EcriteurCompetences();
		}
		return instance;
	}
	
	@Override
	public void ecrireCompetences(ListeCompetences competences){
		try {
			openWriter();
			ecrire(EN_TETE);
			for (Competence competence : competences.getTab()) {
				ecrire(competence.toString());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Probl�me d'ouverture du fichier.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Probl�me lors de l'�criture des comp�tences.");
			e.printStackTrace();
		}finally {
			try {
				closeWriter();
			} catch (IOException e) {
				System.out.println("Probl�me de fermeture de fichier.");
				e.printStackTrace();
			}
		}
	}
}
