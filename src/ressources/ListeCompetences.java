package ressources;
import java.util.HashMap;
import java.util.Map;
/*
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
public class ListeCompetences{
	private Map<DCCompetence, Competence> competences = new HashMap<>();
	/*
	 * Ajoute une compétence dans la liste des compétences.
	 * 
	 * @param comp La compétence à ajouter
	 */
	public void ajouter(Competence comp){
		competences.put(comp.getDC(), comp);
	}
	
	/*
	 * Ajoute plusieurs compétences dans la liste des compétences.
	 * 
	 * @param comps La liste de compétences à ajouter
	 */
	public void ajouter(ListeCompetences comps){
		competences.putAll(comps.competences);
	}
	
	/*
	 * Affiche la liste des compétences.
	 */
	public void afficher(){
		System.out.println("-- Liste de compétences --");
		
		for (DCCompetence key : competences.keySet()) {
			competences.get(key).afficher();
		}
	}
}
