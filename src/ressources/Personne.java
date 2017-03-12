package ressources;

import java.util.ArrayList;

/**
 * La classe Personne représente un collaborateur de la liste du personnel.
 * Elle permet de réaliser les fonctionnalités suivantes :
 * a) créer un objet de type Personne (collaborateur)
 * b) afficher les données d'un collaborateur
 * c) afficher les compétences d'un collaborateur
 * @author Emma, Manuela
 * @version 0.0
 */
public class Personne implements Comparable {
	//TODO créer une date par défaut
	private final Integer ID;
	private String nom;
	private String prenom;
	private Date dateEntree;
	private ListeCompetences competences = new ListeCompetences();
	
	public Personne(String prenom, String nom, Integer id, int jour, int mois, int annee) {
		this.prenom = prenom;
		this.nom = nom; 
		this.ID = id;
		try {
			this.dateEntree = new Date(jour, mois, annee);
		} catch (DateErronneeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Renvoie un String représentant les données d'un employé sous la forme suivante :
	 * "prenom;nom;date d'entrée en entreprise;identifiant"
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = prenom + ";" + nom + ";" + dateEntree.toString() + ";" + ID; 
		return str;
	}
	
	/**
	 * Affiche les données d'une instance de la classe dans la console.
	 */
	public void afficher(){
		System.out.println(getClass().getSimpleName() + " : " + toString());
	}
	
	public Integer getID(){
		return ID;
	}
	
	/**
	 * ajouter une compétence à la liste des compétences d'une personne
	 * @param cmpt La compétence
	 * @return la personne elle même
	 */
	public Personne ajouterCompetence(Competence cmpt){
		competences.ajouter(cmpt);
		return this;
	}
	
	/**
	 * renvoyer le liste des compétences d'une personne dous forme de tableau
	 * @return Un tableau de compétences
	 */
	public Competence[] getTabCompetences(){
		return competences.getTab();
	}
	
	/**
	 * afficher la liste des compétences d'un personne
	 */
	public void afficherCompetences(){
		competences.afficher();
	}
	
	/**
	 * 
	 * @param dc le domaine et le code d'une compétence
	 * @return la compétence recherché si elle est dans la liste, null sinon
	 */
	public Competence getCompetence(DCCompetence dc){
		return competences.get(dc);
	}
	
	public boolean aCompetence(Competence cmpt){
		return competences.estAjoute(cmpt);
	}
	
	/**
	 * Définit le niveau de compatibilité du profil d'une personne avec une liste de compétences
	 * @param liste la liste de compétences de référence
	 * @return le rapport entre le nombre de compétences possédées par la personne et la taille de la liste
	 */
	public Compatibilite compatible(ListeCompetences liste){
		int nb = 0, total = liste.taille();
		Compatibilite compat;
		
		ArrayList<Competence> listeCompat = new ArrayList<Competence>();
		for (Competence cmpt : liste.getTab()) {
			if (this.aCompetence(cmpt)) {
				nb ++;
				listeCompat.add((Competence) cmpt.clone());
			} 
		}
		compat = new Compatibilite((double) nb/total, listeCompat);
		return compat;
	}

	@Override
	public int compareTo(Object o) {
		Personne personne = (Personne) o;
		int rep = 0;
		if (personne.ID > this.ID) {
			rep = -1;
		} else if (personne.ID < this.ID) {
			rep = 1;
		}
		return rep;
	}
}
