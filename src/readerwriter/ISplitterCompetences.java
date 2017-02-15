package readerwriter;
import ressources.ListeCompetences;
import ressources.DomaineCompetences;
/**
 * Interface qui fait le lien entre un conteneur de données et des compétences
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface ISplitterCompetences extends ISplitter{
	public abstract void setLibFR(String mot);
	public abstract void setLibGB(String mot);
	public abstract void setDomaine(String mot);
	public abstract void setCode(String mot);
	
	public abstract String getLibFR();
	public abstract String getLibGB();
	public abstract DomaineCompetences getDomaine();
	public abstract Integer getCode();
	
	public abstract ListeCompetences getCompetences(ConteneurStr conteneur);
}
