package readerwriter;
import java.util.Set;
import java.util.HashSet;

/*
 * Un conteneur de données
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public abstract class Conteneur<T> implements IConteneur{
	private Set<T> donnees = new HashSet<T>();
	
	protected void add(T donnee){
		this.donnees.add(donnee);
	}
	
	@Override
	public Set<T> getDonnees(){
		return this.donnees;
	}
}
