package ressources;
import java.util.ArrayList;
import java.util.Collection;
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
public class ListeCompetences extends ArrayList<Competence>{
	/*
	 * Ajoute une comp�tence dans la liste des comp�tences.
	 * 
	 * @param comp La comp�tence � ajouter
	 */
	public void ajouterCompetence(Competence comp){
		add(comp);
	}
	
	/*
	 * Ajoute plusieurs comp�tences dans la liste des comp�tences.
	 * 
	 * @param comps La liste de comp�tences � ajouter
	 */
	public void ajouterCompetence(ListeCompetences comps){
		addAll(comps);
	}
	
	/*
	 * Affiche la liste des comp�tences.
	 */
	public void afficher(){
		System.out.println("-- Liste de comp�tences --");
		
		for (Competence cmpt : this) {
			cmpt.afficher();
		}
	}
}
