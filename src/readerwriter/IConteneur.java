package readerwriter;
import java.util.Set;
/*
 * Interface permettant d'acceder aux donn�es du conteneur
 * TODO � revoir si ce n'est pas mieux de garder la visibilit� de cette m�thode dans le paquetage
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface IConteneur<T>{
	public abstract Set<T> getDonnees();
}
