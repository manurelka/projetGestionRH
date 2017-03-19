package reader_writer;

import ressources.ListeCompetences;

public interface ISplitterPersCmp extends ISplitter{
	public abstract Integer getID();
	
	public abstract ListeCompetences getCompetences();
}
