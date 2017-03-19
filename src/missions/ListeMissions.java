package missions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import ressources.IListeModifiable;
import ressources.IModifEcouteur;
import ressources.ModifEvenement;
import ressources.ModifType;
import ressources.Personne;

/**
 * Liste de missions
 * @author Manuela
 *
 */
public class ListeMissions implements IListeMissions, ITemporaire, IListeModifiable{
	private Map<String, Mission> missions = new TreeMap<String, Mission>();
	protected ArrayList<IModifEcouteur> ecouteurs = new ArrayList<IModifEcouteur>();
	
	@Override
	public void majTemps() {
		for(Mission mission : missions.values()){
			mission.majTemps();
		}
		
		modifContenu(ModifType.MODIF);
	}

	@Override
	public void ajouter(Mission mission) {
		if (! estAjoute(mission)) {
			missions.put(mission.getNom(), mission);
		}
		
		modifContenu(ModifType.AJOUT);
	}

	@Override
	public void ajouter(ListeMissions liste) {
		for (Mission mission : liste.missions.values()) {
			this.ajouter(mission);
		}
	}

	@Override
	public void ajouter(Collection<Mission> liste) {
		for (Mission mission : liste) {
			this.ajouter(mission);
		}
	}
	
	@Override
	public boolean estAjoute(Mission mission){
		return missions.containsKey(mission.getNom());
	}
	
	@Override
	public void supprimer(Mission mission){
		missions.remove(mission.getNom());
		modifContenu(ModifType.SUPPR);
	}
	
	@Override
	public Mission[] getTab() {
		return missions.values().toArray(new Mission[missions.size()]);
	}

	@Override
	public void modifContenu(ModifType type) {
		ModifEvenement evt = new ModifEvenement(type);
		
		for (IModifEcouteur e : ecouteurs){
			e.reagir(evt);
		}
	}

	@Override
	public void addModifEcouteur(IModifEcouteur e) {
		ecouteurs.add(e);
	}

	@Override
	public void removeModifEcouteur(IModifEcouteur e) {
		ecouteurs.remove(e);
	}
	
}
