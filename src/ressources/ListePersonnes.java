package ressources;

import java.util.Collection;

public class ListePersonnes extends ListeRessources<Integer, Personne> implements IListePersonnels {	
	
	@Override
	public ListePersonnes get(String nom, String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne get(int code) {
		return (Personne) ressources.get(code);
	}

	@Override
	public ListePersonnes get(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Personne[] getTab() {
		return ressources.values().toArray(new Personne[ressources.size()]);
	}
	
	public void ajouter(ListePersonnes res){
		for(Integer key : ressources.keySet()){
			ajouter( res.ressources.get(key));
		}
		
		modifContenu(ModifType.AJOUT);
	}

	@Override
	public void ajouter(Collection<Personne> objets) {
		for(Personne personne : objets){
			this.ajouter(personne);
		}
	}
}

