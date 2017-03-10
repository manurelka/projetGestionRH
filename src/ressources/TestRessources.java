package ressources;

import reader_writer.EcriteurCompetences;
import reader_writer.LecteurCompetences;

/**
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
		
		// Comp�tence (classe)
		Competence cmpt = new Competence(DomaineCompetences.A, 1, "Libell� en anglais...", "Libell� en fran�ais...");
		Competence cmpt1 = new Competence(DomaineCompetences.A, 1, "Libell� en anglais...", "Libell� en fran�ais...");
		Competence cmpt2 = new Competence(DomaineCompetences.A, 3, "Libell� en anglais...", "Libell� en fran�ais...");
		Competence cmpt3 = new Competence(DomaineCompetences.A, 1, "Libell� en anglais...diff�rent", "Libell� en fran�ais...");
		Competence cmpt4 = new Competence(DomaineCompetences.A, 1, "Libell� en anglais...", "Libell� en fran�ais...diff�rent");
		Competence cmpt5 = new Competence(DomaineCompetences.D, 1, "Libell� en anglais...", "Libell� en fran�ais...");
		Competence cmpt6 = new Competence(DomaineCompetences.A, "Libell� en anglais...", "Libell� en fran�ais...diff�rent");
		
		cmpt.afficher();
		System.out.println("-- comp�tence cr�er en utilisant nextCode() --");
		cmpt6.afficher();
		
		//Comparation de deux comp�tences identiques
		System.out.println("-- Egalit� des comp�tences --");
		System.out.println(cmpt.equals(cmpt1)); // R�sultat attendu : true
		
		//Comparation de deux comp�tences dont le code est diff�rent
		System.out.println(cmpt.equals(cmpt2)); // R�sultat attandu : false
		
		//Comparation de deux comp�tences dont le libell� en anglais est diff�rent
		System.out.println(cmpt.equals(cmpt3)); // R�sultat attandu : false
		
		//Comparation de deux comp�tences dont le libell� en fran�ais est diff�rent
		System.out.println(cmpt.equals(cmpt4)); // R�sultat attandu : false
		
		//Comparation de deux comp�tences dont le domaine est diff�rent
		System.out.println(cmpt.equals(cmpt5)); // R�sultat attandu : false
		
		//Comparaison d'une comp�tence et un autre objet
		System.out.println(cmpt.equals("Quelque chose d'autre")); // g�re une exception ClassCastException, r�sultat : false
		
		//SRegarder si une comp�tence a le libell� donn�e
		System.out.println("-- Recherche libell� --");
		System.out.println(cmpt.aLibelle("Libell� en anglais...")); // R�sultat attandu : true
		System.out.println(cmpt.aLibelle("Libell� en fran�ais...")); // R�sultat attandu : true
		System.out.println(cmpt.aLibelle("Autre chose...")); // R�sultat attandu : false
		
		//SRegarder si une comp�tence a le domaine / code donn�e
		System.out.println("-- Recherche domaine et code --");
		System.out.println(cmpt.aDomaine(DomaineCompetences.A)); // R�sultat attandu : true
		System.out.println(cmpt.aDomaine(DomaineCompetences.B)); // R�sultat attandu : false
		System.out.println(cmpt.aCode(1)); // R�sultat attandu : true
		System.out.println(cmpt.aCode(2)); // R�sultat attandu : false
		
		// TODO Gestion d'une liste de comp�tences
		// Initialisation d'une liste de comp�tences
		ListeCompetences lcmpts = new ListeCompetences();
		
		// Ajout des comp�tences qui ne sont pas dans la liste 
		lcmpts.ajouter(cmpt);
		lcmpts.ajouter(new Competence(DomaineCompetences.A, 2, "Libell� en anglais...", "Libell� en fran�ais..."));
		lcmpts.ajouter(new Competence(DomaineCompetences.B, 1, "Libell� ...", "Libell� ..."));
		
		// Ajouter une comp�tence qui existe d�j� dans la liste => elle ne doit pas s'ajouter
		lcmpts.ajouter(new Competence(DomaineCompetences.A, 2, "Libell� en anglais...", "Libell� en fran�ais..."));
		
		// Affichage de la liste
		lcmpts.afficher();
		
		//Comparaison de comp�tences (plus petite / plus grande)
		System.out.println("-- Comparaison comp�tence --");
		System.out.println(cmpt.compareTo(cmpt1)); // Doivent �tre �gales don 0
		System.out.println(cmpt.compareTo(cmpt2)); // cmpt2 doit �tre plus grande, donc -1;
		System.out.println(cmpt2.compareTo(cmpt1)); // ici 1
		// est avec des domaines diff�rents
		System.out.println(cmpt.compareTo(cmpt5)); // ici -1
		System.out.println(cmpt5.compareTo(cmpt)); // ici 1
		
		// Recherche de comp�tences
		System.out.println("-- Recherche comp�tence --");
		
		// Par mot cl�
		System.out.println("-- x : par mot cl� --");
		lcmpts.get("LiBell�").afficher();
		
		// Par code & domaine comp�tence existante
		System.out.println("-- a : par domaine et code --");
		lcmpts.get(new DCCompetence(DomaineCompetences.A, 2)).afficher();
		
		// Par code & domaine comp�tence inexistante (ne doit rien trouver)
		try {
			lcmpts.get(new DCCompetence(DomaineCompetences.A, 5)).afficher();
		} catch (NullPointerException e) {
			System.out.println("(Domaine erronn�) La comp�tence n'est pas trouv�e");
		}
		
		//Par libell� existant
		System.out.println("-- b : par libell� --");
		lcmpts.get("Libell� en anglais...").afficher();
		
		//Par libell� inexistant
		lcmpts.get("Libell� inexistant").afficher(); // R�sultat attendu : une liste vide
		
		//Par domain existant
		System.out.println("-- c : par domaine --");
		lcmpts.get(DomaineCompetences.A).afficher();
		
		//Par domaine inexistant
		lcmpts.get(DomaineCompetences.D).afficher(); // Liste vide
		
		//Par code existant
		System.out.println("-- d : par code --");
		lcmpts.get(1).afficher();
		//Par code inexistant
		lcmpts.get(3).afficher(); // Liste vide
		

		// Personne (collaborateur)
		System.out.println("--- Test class Personne ---");
		Personne manu = new Personne("Manuela", "Ivanova", 1, 30, 9, 2016);
		manu.afficher();
		
		// TODO Gestion des comp�tences d'une personne
		System.out.println("--- Test comp�tences d'une personne ---");
		manu.ajouterCompetence(cmpt6).ajouterCompetence(cmpt5).ajouterCompetence(cmpt4);
		manu.afficherCompetences();
		
		System.out.println("------");
		Competence[] competencesManu = manu.getTabCompetences(); 
		System.out.println(competencesManu[1].toString());
		System.out.println("------");
		manu.getCompetence(cmpt6.getDC()).afficher();
		System.out.println(manu.aCompetence(cmpt4)); // true
		System.out.println(manu.aCompetence(cmpt2)); // false
		
		System.out.println("--- Niveau de compatibilit� ---");
		lcmpts = new ListeCompetences();
		lcmpts.ajouter(cmpt4);
		lcmpts.ajouter(cmpt5);
		lcmpts.ajouter(cmpt6);
		System.out.println(manu.compatible(lcmpts));
		lcmpts = new ListeCompetences();
		lcmpts.ajouter(cmpt2);
		lcmpts.ajouter(cmpt5);
		lcmpts.ajouter(cmpt6);
		System.out.println(manu.compatible(lcmpts));
		lcmpts = new ListeCompetences();
		lcmpts.ajouter(cmpt2);
		lcmpts.ajouter(cmpt5);
		System.out.println(manu.compatible(lcmpts));
		lcmpts = new ListeCompetences();
		lcmpts.ajouter(cmpt2);
		System.out.println(manu.compatible(lcmpts));
		
		// TODO Personnel
		
		// TODO Gestion de la liste du personnel
		
		
		// TODO ---- Lecture et �criture des donn�es ----
		
		// TODO Lecture de la liste du personnel (fichier csv)
		
		// Lecture de la liste des comp�tences (fichier csv)
		/*lcmpts = null;
		
		System.out.println("-- Lecture des comp�tences --");
		LecteurCompetences reader = LecteurCompetences.Instance();
		lcmpts = reader.lireCompetences();
		lcmpts.afficher();
		
		// Recherche de comp�tences dans la liste
		System.out.println("-- Recherche de comp�tences --");
		
		// Par code et domaine (DCCompetence)
		lcmpts.get(new DCCompetence(DomaineCompetences.A, 1)).afficher();
		
		// Par code
		lcmpts.get(1).afficher();
		
		// Par domaine
		lcmpts.get(DomaineCompetences.B).afficher();
		
		// Par libell�
		lcmpts.get("Forecast Development").afficher();
		lcmpts.get("Conception et d�veloppement").afficher();
		lcmpts.get("Tests").afficher();
		
		//Ajout de nouvelles comp�tences
		lcmpts.ajouter((new Competence(DomaineCompetences.A, 20, "Libell� en anglais...���", "Libell� en fran�ais...")));
		
		//Ecriture de la liste des comp�tences (Dans un fichier liste_competences_ecr.csv pour le moment)
		System.out.println("-- Ecriture des comp�tences --");
		EcriteurCompetences writer = EcriteurCompetences.Instance();
		writer.ecrireCompetences(lcmpts);
		writer.ecrireCompetences(lcmpts);*/
		// TODO corriger la recherche par libell�  
		//lcmpts.get("Service Level Management").afficher(); // ne marche pas
		
		// TODO Ajout de comp�tences par personne (lecture de la liste comp�tences personnel) (fichier csv)
		
		// TODO Enr�gistrement des donn�es (ecriture dans les fichiers csv)
		
	}

}
