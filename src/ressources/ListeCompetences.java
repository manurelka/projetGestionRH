package ressources;
import java.util.ArrayList;
import java.util.Collection;
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
public class ListeCompetences extends ArrayList<Competence>{
	/*
	 * Ajoute une compétence dans la liste des compétences.
	 * 
	 * @param comp La compétence à ajouter
	 */
	public void ajouterCompetence(Competence comp){
		add(comp);
	}
	
	/*
	 * Ajoute plusieurs compétences dans la liste des compétences.
	 * 
	 * @param comps La liste de compétences à ajouter
	 */
	public void ajouterCompetence(ListeCompetences comps){
		addAll(comps);
	}
	
	/*
	 * Affiche la liste des compétences.
	 */
	public void afficher(){
		System.out.println("-- Liste de compétences --");
		
		for (Competence cmpt : this) {
			cmpt.afficher();
		}
	}
}
