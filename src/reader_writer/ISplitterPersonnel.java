package reader_writer;

import ressources.Date;
import ressources.DomaineCompetences;
import ressources.ListeCompetences;
import ressources.ListePersonnes;

public interface ISplitterPersonnel extends ISplitter {
	public abstract void setID(String mot);

	public abstract void setNom(String mot);

	public abstract void setPrenom(String mot);

	public abstract void setDateJour(String mot);

	public abstract void setDateMois(String mot);
	
	public abstract void setDateAnnee(String mot);

	public abstract Integer getID();

	public abstract String getNom();

	public abstract String getPrenom();
	
	public abstract int getDateJour();
	
	public abstract int getDateMois();
	
	public abstract int getDateAnnee();

	public abstract ListePersonnes getPersonnel(ConteneurStr conteneur);
}
