package reader_writer;

import ressources.ListePersonnes;

public interface ILecteurPersonnel extends ILecteur {
	public abstract ListePersonnes lirePersonnel ();
}
