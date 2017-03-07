package ressources;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ListeRessources<T, E> {
	
	protected Map<T, E> ressources = new TreeMap<T, E>();
	protected ArrayList<IModifEcouteur> ecouteurs = new ArrayList<IModifEcouteur>();

}
