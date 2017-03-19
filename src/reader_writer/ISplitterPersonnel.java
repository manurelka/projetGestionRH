package reader_writer;

import java.util.Date;
import ressources.DomaineCompetences;
import ressources.ListeCompetences;
import ressources.ListePersonnes;

public interface ISplitterPersonnel extends ISplitter {
	
	public abstract Integer getID();

	public abstract String getNom();

	public abstract String getPrenom();
	public abstract String getDate();

	public abstract ListePersonnes getPersonnel(ConteneurStr conteneur);
}
