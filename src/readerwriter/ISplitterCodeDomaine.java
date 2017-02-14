package readerwriter;
/*
 * Interface qui fait le lien entre un conteneur de données et le domaine et le code d'une compétence
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface ISplitterCodeDomaine extends ISplitter{
	public abstract String getDomaine();
	public abstract String getCode();
}
