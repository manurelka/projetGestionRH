package ressources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class ListeRessources<T, E> implements IListeRessources<T, E>, IListeModifiable{
	
	protected Map<T, E> ressources = new TreeMap<T, E>();
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
	public void ajouter(IListeRessources<T, E> res){
		try {
			for(T key : ((ListeRessources<T, E>) res).ressources.keySet()){
				ajouter(((ListeRessources<T, E>) res).ressources.get(key));
			}
		} catch (ClassCastException e){
			//TODO
			System.out.println(TypeDifferentExceptionMSG.LISTE_COMP);
			e.printStackTrace();
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@Override
	public boolean estAjoute(IRessource<T> ressource){
		return ressources.containsKey(ressource.getIdent());
	}
	
	@Override
	public void ajouter(E objet){
		if(! estAjoute((IRessource<T>) objet)){
			ressources.put(((IRessource<T>) objet).getIdent(), (E) objet);
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@Override
	public void afficher(){
		System.out.println("-- Liste de personnes --");
		
		for (T key : ressources.keySet()) {
			((IListeRessources<T, E>) ressources.get(key)).afficher();
		}
	}
	

	@Override
	public void supprimer(E objet) {
		ressources.remove(((IRessource <T>) objet).getIdent());
	}

	@Override
	public void ajouter(Collection<E> objets) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E[] getTab() {
		return (E[]) ressources.values().toArray(new IRessource[ressources.size()]);
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
