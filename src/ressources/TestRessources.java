package ressources;
/*
 * C'est une classe de test des fonctionnalités liées à la gestion des ressources.
 * Les ressources comprennent le personnel et les compétences.
 * (Les missions ne sont pas de resources)
 *  
 * Le système de gestion des ressources doit permettre :
 * 
 * a) la lecture de la liste du personnel et de la liste des compétences ;
 * b) la mise à jour / l'ajout / la suppression d'une compétence dans la liste des compétences ;
 * b) la mise à jour / l'ajout / la suppression d'un collaborateur dans la liste du personnel ;
 * c) la mise à jour / l'ajout / la suppression des compétences aux atouts d'un collaborateur ;
 * d) la recherche d'un collaborateur dans la liste du personnel ;
 * b) la recherche d'un collaborateur qui possède une (ou plusieurs) compétence(s) ;
 * e) l'écriture et l'enrégistrement (des modifications) des données traitées dans les listes correspondantes ;
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class TestRessources {

	public static void main(String[] args) {
		
		// TODO ---- Représentation des données dans l'application ----
		
		// Personne (collaborateur)
		Personne manu = new Personne("Manuela", "Ivanova", 1, 31, 9, 2016);
		manu.afficher();
		
		// TODO Compétence (classe)
		
		// TODO Gestion des compétences d'une personne
		
		// TODO Personnel
		
		// TODO Gestion de la liste du personnel
		
		
		// TODO ---- Lecture et écriture des données ----
		
		// TODO Lecture de la liste du personnel (fichier csv)
		
		// TODO Lecture de la liste des compétences (fichier csv)
		
		// TODO Ajout de compétences par personne (lecture de la liste compétences personnel) (fichier csv)
		
		// TODO Enrégistrement des données (ecriture dans les fichiers csv)
		
	}

}
