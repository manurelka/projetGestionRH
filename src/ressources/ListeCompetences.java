package ressources;
import java.util.HashMap;
import java.util.Map;
/*
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
public class ListeCompetences{
	private Map<DCCompetence, Competence> competences = new HashMap<>();
	/*
	 * Ajoute une comp�tence dans la liste des comp�tences.
	 * 
	 * @param comp La comp�tence � ajouter
	 */
	public void ajouter(Competence comp){
		competences.put(comp.getDC(), comp);
	}
	
	/*
	 * Ajoute plusieurs comp�tences dans la liste des comp�tences.
	 * 
	 * @param comps La liste de comp�tences � ajouter
	 */
	public void ajouter(ListeCompetences comps){
		competences.putAll(comps.competences);
	}
	
	/*
	 * Affiche la liste des comp�tences.
	 */
	public void afficher(){
		System.out.println("-- Liste de comp�tences --");
		
		for (DCCompetence key : competences.keySet()) {
			competences.get(key).afficher();
		}
	}
}
