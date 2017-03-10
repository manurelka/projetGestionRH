package ressources;

import reader_writer.EcriteurCompetences;
import reader_writer.LecteurCompetences;

/**
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
		
		// Compétence (classe)
		Competence cmpt = new Competence(DomaineCompetences.A, 1, "Libellé en anglais...", "Libellé en français...");
		Competence cmpt1 = new Competence(DomaineCompetences.A, 1, "Libellé en anglais...", "Libellé en français...");
		Competence cmpt2 = new Competence(DomaineCompetences.A, 3, "Libellé en anglais...", "Libellé en français...");
		Competence cmpt3 = new Competence(DomaineCompetences.A, 1, "Libellé en anglais...différent", "Libellé en français...");
		Competence cmpt4 = new Competence(DomaineCompetences.A, 1, "Libellé en anglais...", "Libellé en français...différent");
		Competence cmpt5 = new Competence(DomaineCompetences.D, 1, "Libellé en anglais...", "Libellé en français...");
		Competence cmpt6 = new Competence(DomaineCompetences.A, "Libellé en anglais...", "Libellé en français...différent");
		
		cmpt.afficher();
		System.out.println("-- compétence créer en utilisant nextCode() --");
		cmpt6.afficher();
		
		//Comparation de deux compétences identiques
		System.out.println("-- Egalité des compétences --");
		System.out.println(cmpt.equals(cmpt1)); // Résultat attendu : true
		
		//Comparation de deux compétences dont le code est différent
		System.out.println(cmpt.equals(cmpt2)); // Résultat attandu : false
		
		//Comparation de deux compétences dont le libellé en anglais est différent
		System.out.println(cmpt.equals(cmpt3)); // Résultat attandu : false
		
		//Comparation de deux compétences dont le libellé en français est différent
		System.out.println(cmpt.equals(cmpt4)); // Résultat attandu : false
		
		//Comparation de deux compétences dont le domaine est différent
		System.out.println(cmpt.equals(cmpt5)); // Résultat attandu : false
		
		//Comparaison d'une compétence et un autre objet
		System.out.println(cmpt.equals("Quelque chose d'autre")); // gère une exception ClassCastException, résultat : false
		
		//SRegarder si une compétence a le libellé donnée
		System.out.println("-- Recherche libellé --");
		System.out.println(cmpt.aLibelle("Libellé en anglais...")); // Résultat attandu : true
		System.out.println(cmpt.aLibelle("Libellé en français...")); // Résultat attandu : true
		System.out.println(cmpt.aLibelle("Autre chose...")); // Résultat attandu : false
		
		//SRegarder si une compétence a le domaine / code donnée
		System.out.println("-- Recherche domaine et code --");
		System.out.println(cmpt.aDomaine(DomaineCompetences.A)); // Résultat attandu : true
		System.out.println(cmpt.aDomaine(DomaineCompetences.B)); // Résultat attandu : false
		System.out.println(cmpt.aCode(1)); // Résultat attandu : true
		System.out.println(cmpt.aCode(2)); // Résultat attandu : false
		
		// TODO Gestion d'une liste de compétences
		// Initialisation d'une liste de compétences
		ListeCompetences lcmpts = new ListeCompetences();
		
		// Ajout des compétences qui ne sont pas dans la liste 
		lcmpts.ajouter(cmpt);
		lcmpts.ajouter(new Competence(DomaineCompetences.A, 2, "Libellé en anglais...", "Libellé en français..."));
		lcmpts.ajouter(new Competence(DomaineCompetences.B, 1, "Libellé ...", "Libellé ..."));
		
		// Ajouter une compétence qui existe déjà dans la liste => elle ne doit pas s'ajouter
		lcmpts.ajouter(new Competence(DomaineCompetences.A, 2, "Libellé en anglais...", "Libellé en français..."));
		
		// Affichage de la liste
		lcmpts.afficher();
		
		//Comparaison de compétences (plus petite / plus grande)
		System.out.println("-- Comparaison compétence --");
		System.out.println(cmpt.compareTo(cmpt1)); // Doivent être égales don 0
		System.out.println(cmpt.compareTo(cmpt2)); // cmpt2 doit être plus grande, donc -1;
		System.out.println(cmpt2.compareTo(cmpt1)); // ici 1
		// est avec des domaines différents
		System.out.println(cmpt.compareTo(cmpt5)); // ici -1
		System.out.println(cmpt5.compareTo(cmpt)); // ici 1
		
		// Recherche de compétences
		System.out.println("-- Recherche compétence --");
		
		// Par mot clé
		System.out.println("-- x : par mot clé --");
		lcmpts.get("LiBellé").afficher();
		
		// Par code & domaine compétence existante
		System.out.println("-- a : par domaine et code --");
		lcmpts.get(new DCCompetence(DomaineCompetences.A, 2)).afficher();
		
		// Par code & domaine compétence inexistante (ne doit rien trouver)
		try {
			lcmpts.get(new DCCompetence(DomaineCompetences.A, 5)).afficher();
		} catch (NullPointerException e) {
			System.out.println("(Domaine erronné) La compétence n'est pas trouvée");
		}
		
		//Par libellé existant
		System.out.println("-- b : par libellé --");
		lcmpts.get("Libellé en anglais...").afficher();
		
		//Par libellé inexistant
		lcmpts.get("Libellé inexistant").afficher(); // Résultat attendu : une liste vide
		
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
		
		// TODO Gestion des compétences d'une personne
		System.out.println("--- Test compétences d'une personne ---");
		manu.ajouterCompetence(cmpt6).ajouterCompetence(cmpt5).ajouterCompetence(cmpt4);
		manu.afficherCompetences();
		
		System.out.println("------");
		Competence[] competencesManu = manu.getTabCompetences(); 
		System.out.println(competencesManu[1].toString());
		System.out.println("------");
		manu.getCompetence(cmpt6.getDC()).afficher();
		System.out.println(manu.aCompetence(cmpt4)); // true
		System.out.println(manu.aCompetence(cmpt2)); // false
		
		System.out.println("--- Niveau de compatibilité ---");
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
		
		
		// TODO ---- Lecture et écriture des données ----
		
		// TODO Lecture de la liste du personnel (fichier csv)
		
		// Lecture de la liste des compétences (fichier csv)
		/*lcmpts = null;
		
		System.out.println("-- Lecture des compétences --");
		LecteurCompetences reader = LecteurCompetences.Instance();
		lcmpts = reader.lireCompetences();
		lcmpts.afficher();
		
		// Recherche de compétences dans la liste
		System.out.println("-- Recherche de compétences --");
		
		// Par code et domaine (DCCompetence)
		lcmpts.get(new DCCompetence(DomaineCompetences.A, 1)).afficher();
		
		// Par code
		lcmpts.get(1).afficher();
		
		// Par domaine
		lcmpts.get(DomaineCompetences.B).afficher();
		
		// Par libellé
		lcmpts.get("Forecast Development").afficher();
		lcmpts.get("Conception et développement").afficher();
		lcmpts.get("Tests").afficher();
		
		//Ajout de nouvelles compétences
		lcmpts.ajouter((new Competence(DomaineCompetences.A, 20, "Libellé en anglais...éàè", "Libellé en français...")));
		
		//Ecriture de la liste des compétences (Dans un fichier liste_competences_ecr.csv pour le moment)
		System.out.println("-- Ecriture des compétences --");
		EcriteurCompetences writer = EcriteurCompetences.Instance();
		writer.ecrireCompetences(lcmpts);
		writer.ecrireCompetences(lcmpts);*/
		// TODO corriger la recherche par libellé  
		//lcmpts.get("Service Level Management").afficher(); // ne marche pas
		
		// TODO Ajout de compétences par personne (lecture de la liste compétences personnel) (fichier csv)
		
		// TODO Enrégistrement des données (ecriture dans les fichiers csv)
		
	}

}
