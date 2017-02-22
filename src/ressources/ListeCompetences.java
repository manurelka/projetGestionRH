package ressources;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;
/**
 * La classe ListeCompetences permet de g�rer une collection de comp�tences.
 * 
 * Elle implante les fonctionnali�s suivantes :
 * 
 * a) cr�er une liste de comp�tences ;
 * b) ajouter une (ou plusieurs) comp�tence(s) � la liste ;
 * c) supprimer une (ou plusieurs) comp�tence(s) de la liste ;
 * d) rechercher une comp�tence dans la liste ;
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class ListeCompetences implements IListeCompetences{
	private Map<DCCompetence, Competence> competences = new TreeMap<>();
	
	@Override
	public void ajouter(Competence comp){
		if(! estAjoute(comp)){
			competences.put(comp.getDC(), comp);
		}
	}
	
	@Override
	public void ajouter(IListeRessources<Competence> comps){
		try {
			for(DCCompetence key : ((ListeCompetences) comps).competences.keySet()){
				ajouter(((ListeCompetences) comps).competences.get(key));
			}
		} catch (ClassCastException e){
			System.out.println(TypeDifferentExceptionMSG.LISTE_COMP);
			e.printStackTrace();
		}
	}
	
	@Override
	public void afficher(){
		System.out.println("-- Liste de comp�tences --");
		
		for (DCCompetence key : competences.keySet()) {
			competences.get(key).afficher();
		}
	}
	
	@Override
	public boolean estAjoute(Competence comp){
		return competences.containsKey(comp.getDC());
	}
	
	@Override
	public ListeCompetences get(String motCle){
		ListeCompetences rep = new ListeCompetences();
		Competence comp;
		
		for(DCCompetence key : competences.keySet()) {
			comp = competences.get(key);
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
		
		for(DCCompetence key : competences.keySet()) {
			comp = competences.get(key);
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
		
		for(DCCompetence key : competences.keySet()) {
			comp = competences.get(key);
			if (comp.aDomaine(domaine)){
				rep.ajouter(comp);
			}
		}
		
		return rep;
	}
	
	@Override
	public Competence get(DCCompetence dc){
		return this.competences.get(dc);
	}
	
	@Override
	public Competence[] getTab(){
		return competences.values().toArray(new Competence[competences.size()]);
	}
}
