package ressources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public abstract class ListeRessources<T, E extends Ressource<T>> implements IListeRessources<T, Ressource<T>>, IListeModifiable{
	
	protected Map<T, Ressource<T>> ressources = new TreeMap<T, Ressource<T>>();
	protected ArrayList<IModifEcouteur> ecouteurs = new ArrayList<IModifEcouteur>();
	
	public int taille(){
		return ressources.size();
	}
	
	@Override
	public void modifContenu(ModifType type){
		ModifEvenement evt = new ModifEvenement(type);
		
		for (IModifEcouteur e : ecouteurs){
			e.reagir(evt);
		}
	}
	
	@Override
	public void ajouter(IListeRessources<T, Ressource<T>> res){
		try {
			for(T key : ((ListeRessources<T, Ressource<T>>) res).ressources.keySet()){
				ajouter(((ListeRessources<T, Ressource<T>>) res).ressources.get(key));
			}
		} catch (ClassCastException e){
			//TODO
			System.out.println(TypeDifferentExceptionMSG.LISTE_COMP);
			e.printStackTrace();
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@Override
	public boolean estAjoute(Ressource<T> ressource){
		return ressources.containsKey(ressource.getIdent());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void ajouter(Ressource<T> objet){
		if(! estAjoute((Ressource<T>) objet)){
			ressources.put(((Ressource<T>) objet).getIdent(), (Ressource<T>) objet);
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void afficher(){
		System.out.println("-- Liste de personnes --");
		
		for (T key : ressources.keySet()) {
			((Ressource<T>) ressources.get(key)).afficher();
		}
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public void supprimer(Ressource<T> objet) {
		ressources.remove(((Ressource <T>) objet).getIdent());
		modifContenu(ModifType.SUPPR);
	}

	@Override
	public void ajouter(Collection<Ressource<T>> objets) {
		for(Ressource objet : objets){
			ajouter(objet);
		}
	}

	

	@Override
	public boolean isEmpty() {
		return ressources.isEmpty();
	}

	public void addModifEcouteur(IModifEcouteur e){
		this.ecouteurs.add(e);
	}
	
	public void removeModifEcouteur(IModifEcouteur e){
		this.ecouteurs.remove(e);
	}

}
