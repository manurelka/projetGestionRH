package reader_writer;
import javax.swing.JComponent;

import ressources.IModifEcouteur;
import ressources.ListeCompetences;

public interface IHMCompetencesAccessor {
	public static final LecteurCompetences LC = LecteurCompetences.Instance();
	public static final EcriteurCompetences EC = EcriteurCompetences.Instance();
	public static ListeCompetences competences_init = LC.lireCompetences();
	public static void addModifEcouteur(IModifEcouteur e){
		competences_init.addModifEcouteur(e);
	}
}
