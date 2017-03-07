package reader_writer;

import ressources.ListeCompetences;

public interface ILecteurPersonnel extends ILecteur {
	public abstract ListesPersonnels lireCompetences ();
}
