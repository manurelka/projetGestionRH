package ressources;

public class ListePersonnes extends ListeRessources<Integer, Personne> implements IListeRessources, IListeModifiable{
	
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
			for(DCCompetence key : ((ListePersonnes) pers).ressources.keySet()){
				ajouter(((ListePersonnes) pers).ressources.get(key));
			}
		} catch (ClassCastException e){
			System.out.println(TypeDifferentExceptionMSG.LISTE_COMP);
			e.printStackTrace();
		}
		
		modifContenu(ModifType.AJOUT);
	}
	
	@Override
	public void afficher(){
		System.out.println("-- Liste de compétences --");
		
		for (Integer key : ressources.keySet()) {
			ressources.get(key).afficher();
		}
	}
	
	@Override
	public boolean estAjoute(Competence comp){
		return ressources.containsKey(comp.getDC());
	}
	
	@Override
	public ListeCompetences get(String motCle){
		ListeCompetences rep = new ListeCompetences();
		Competence comp;
		
		for(DCCompetence key : ressources.keySet()) {
			comp = ressources.get(key);
			if (comp.aMotCle(motCle)){
				rep.ajouter(comp);
			}
		}
		
		return rep;
	}
	
	@Override
	public ListeCompetences get(int code){
		ListeCompetences rep = new ListeCompetences();
		Competence comp;
		
		for(DCCompetence key : ressources.keySet()) {
			comp = ressources.get(key);
			if (comp.aCode(code)){
				rep.ajouter(comp);
			}
		}
		
		return rep;		
	}
	
	@Override
	public ListeCompetences get(DomaineCompetences domaine){
		ListeCompetences rep = new ListeCompetences();
		Competence comp;
		
		for(DCCompetence key : ressources.keySet()) {
			comp = ressources.get(key);
			if (comp.aDomaine(domaine)){
				rep.ajouter(comp);
			}
		}
		
		return rep;
	}
	
	@Override
	public Competence get(DCCompetence dc){
		return this.ressources.get(dc);
	}
	
	@Override
	public Competence[] getTab(){
		return ressources.values().toArray(new Competence[ressources.size()]);
	}
	
	@Override
	public void modifContenu(ModifType type){
		ModifEvenement evt = new ModifEvenement(type);
		
		for (IModifEcouteur e : ecouteurs){
			e.reagir(evt);
		}
	

}
