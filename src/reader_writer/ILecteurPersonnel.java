package reader_writer;

import ressources.ListeCompetences;
import ressources.ListePersonnes;

public interface ILecteurPersonnel extends ILecteur {
	public abstract ListePersonnes lirePersonnel ();
}
