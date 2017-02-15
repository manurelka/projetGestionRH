package readerwriter;
/**
 * Interface qui fait le lien entre un conteneur de données et les objets métier
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface ISplitter {
	
	public abstract String getRegex();
	
	public abstract void splitLine(String line);
}
