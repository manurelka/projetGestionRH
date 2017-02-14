package readerwriter;
import java.util.Set;
/*
 * Interface permettant d'acceder aux données du conteneur
 * TODO à revoir si ce n'est pas mieux de garder la visibilité de cette méthode dans le paquetage
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface IConteneur<T>{
	public abstract Set<T> getDonnees();
}
