package readerwriter;
/**
 * Interface permettant la communication entre un client et le type ConteneurStr
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface IConteneurStr extends IConteneur{
	/**
	 * Ajouter des données de type String
	 * 
	 * @param donnee
	 */
	public abstract void addLine(String donnee);
}
