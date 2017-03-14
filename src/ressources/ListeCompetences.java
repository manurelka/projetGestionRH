package ressources;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;
/**
 * La classe ListeCompetences permet de gérer une collection de compétences.
 * 
 * Elle implante les fonctionnaliés suivantes :
 * 
 * a) créer une liste de compétences ;
 * b) ajouter une (ou plusieurs) compétence(s) à la liste ;
 * c) supprimer une (ou plusieurs) compétence(s) de la liste ;
 * d) rechercher une compétence dans la liste ;
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class ListeCompetences extends ListeRessources<DCCompetence, Competence> implements IListeCompetences, IListeModifiable {
	
	//private Map<DCCompetence, Competence> competences = new TreeMap<DCCompetence, Competence>();
	//private ArrayList<IModifEcouteur> ecouteurs = new ArrayList<IModifEcouteur>();
	
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
	
	
}
