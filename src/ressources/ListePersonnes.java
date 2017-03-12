package ressources;

import java.util.Collection;

public class ListePersonnes extends ListeRessources<Integer, Personne> implements IListePersonnels, IListeModifiable{
	
	@Override
	public void ajouter(Personne pers){
		if(! estAjoute(pers)){
			ressources.put(pers.getID(), pers);
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@Override
	public void ajouter(IListeRessources<Personne> pers){
		try {
			for(Integer key : ((ListePersonnes) pers).ressources.keySet()){
				ajouter(((ListePersonnes) pers).ressources.get(key));
			}
		} catch (ClassCastException e){
			//TODO
			System.out.println(TypeDifferentExceptionMSG.LISTE_COMP);
			e.printStackTrace();
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@Override
	public void afficher(){
		System.out.println("-- Liste de personnes --");
		
		for (Integer key : ressources.keySet()) {
			ressources.get(key).afficher();
		}
	}
	
	@Override
	public boolean estAjoute(Personne pers){
		//TODO
		return false;
	}
	
	@Override
	public Personne[] getTab(){
		return ressources.values().toArray(new Personne[ressources.size()]);
	}
	
	@Override
	public void modifContenu(ModifType type){
		ModifEvenement evt = new ModifEvenement(type);
		
		for (IModifEcouteur e : ecouteurs){
			e.reagir(evt);
		}
	}

	@Override
	public void supprimer(Personne objet) {
		ressources.remove(objet.getID());
	}

	@Override
	public ListePersonnes get(String nom, String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne get(int code) {
		return ressources.get(code);
	}

	@Override
	public ListePersonnes get(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter(Collection<Personne> objets) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isEmpty(){
		return ressources.isEmpty();
	}

}

