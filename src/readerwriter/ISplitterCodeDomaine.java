package readerwriter;
/*
 * Interface qui fait le lien entre un conteneur de donn�es et le domaine et le code d'une comp�tence
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface ISplitterCodeDomaine extends ISplitter{
	public abstract String getDomaine();
	public abstract String getCode();
}
