package ressources;

import readerwriter.LecteurCompetences;

/*
 * C'est une classe de test des fonctionnalit�s li�es � la gestion des ressources.
 * Les ressources comprennent le personnel et les comp�tences.
 * (Les missions ne sont pas de resources)
 *  
 * Le syst�me de gestion des ressources doit permettre :
 * 
 * a) la lecture de la liste du personnel et de la liste des comp�tences ;
 * b) la mise � jour / l'ajout / la suppression d'une comp�tence dans la liste des comp�tences ;
 * b) la mise � jour / l'ajout / la suppression d'un collaborateur dans la liste du personnel ;
 * c) la mise � jour / l'ajout / la suppression des comp�tences aux atouts d'un collaborateur ;
 * d) la recherche d'un collaborateur dans la liste du personnel ;
 * b) la recherche d'un collaborateur qui poss�de une (ou plusieurs) comp�tence(s) ;
 * e) l'�criture et l'enr�gistrement (des modifications) des donn�es trait�es dans les listes correspondantes ;
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class TestRessources {

	public static void main(String[] args) {
		
		// TODO ---- Repr�sentation des donn�es dans l'application ----
		
		// Personne (collaborateur)
		Date date;
		try {
			date = new Date(30, 9, 2016);
			Personne manu = new Personne("Manuela", "Ivanova", 1, date);
			manu.afficher();
		} catch (DateErronneeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Comp�tence (classe)
		Competence cmpt = new Competence(DomaineCompetences.A, 1, "Libell� en anglais...", "Libell� en fran�ais...");
		cmpt.afficher();
		
		// TODO Gestion d'une liste de comp�tences
		ListeCompetences lcmpts = new ListeCompetences();
		lcmpts.add(cmpt);
		lcmpts.add(new Competence(DomaineCompetences.A, 2, "Libell� en anglais...", "Libell� en fran�ais..."));
		lcmpts.add(new Competence(DomaineCompetences.B, 1, "Libell� en anglais...", "Libell� en fran�ais..."));
		lcmpts.afficher();
		
		// TODO Gestion des comp�tences d'une personne
		
		// TODO Personnel
		
		// TODO Gestion de la liste du personnel
		
		
		// TODO ---- Lecture et �criture des donn�es ----
		
		// TODO Lecture de la liste du personnel (fichier csv)
		
		// TODO Lecture de la liste des comp�tences (fichier csv)
		LecteurCompetences reader = LecteurCompetences.Instance();
		lcmpts = reader.lireCompetences();
		lcmpts.afficher();
		
		// TODO Ajout de comp�tences par personne (lecture de la liste comp�tences personnel) (fichier csv)
		
		// TODO Enr�gistrement des donn�es (ecriture dans les fichiers csv)
		
	}

}
