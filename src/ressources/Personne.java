package ressources;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import missions.PlanCompetences;
import reader_writer.IHMCompetencesAccessor;

/**
 * La classe Personne représente un collaborateur de la liste du personnel.
 * Elle permet de réaliser les fonctionnalités suivantes :
 * a) créer un objet de type Personne (collaborateur)
 * b) afficher les données d'un collaborateur
 * c) afficher les compétences d'un collaborateur
 * @author Emma, Manuela
 * @version 0.0
 */
public class Personne extends Ressource<Integer> implements Comparable {
	private static Set<Integer> setID = new TreeSet<Integer>();
	private Integer ID;
	private String nom;
	private String prenom;
	private Date dateEntree;
	private ListeCompetences competences = new ListeCompetences();
	
	public Personne(String prenom, String nom, Integer id, String ddMMyyyy) {
		this(prenom, nom, id, Calendrier.date(ddMMyyyy));
	}
	
	public Personne(String prenom, String nom, Integer id, Date date) {
		this.prenom = prenom;
		this.nom = nom; 
		this.dateEntree = date;
		this.initID(id);
	}
	
	public Personne(String prenom, String nom, Date date) {
		this(prenom, nom, null, date);
	}
	
	
	public Personne(String prenom, String nom, String ddMMyyyy) {
		this(prenom, nom, null, Calendrier.date(ddMMyyyy));
	}
	
	private void initID(Integer id){
		if ((id != null) && (! existeID(id))) {
			this.ID = id;
		} else {
			this.ID = nextID();
		}
		
		setID.add(ID);
	}
	
	public static void initPersonnes(){
		setID = new TreeSet<Integer>();
	} 
	
	private static boolean existeID(int id){
		return setID.contains(id);
	}
	
	private static int nextID(){
		int last = setID.toArray(new Integer[setID.size()])[setID.size() - 1];
		return ++last;
	}
	
	/**
	 * Renvoie un String représentant les données d'un employé sous la forme suivante :
	 * "prenom;nom;date d'entrée en entreprise;identifiant"
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = prenom + ";" + nom + ";" + Calendrier.date(dateEntree) + ";" + ID; 
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
	
	public Personne ajouterCompetence(ListeCompetences cmpts){
		
		for (Competence cmpt : cmpts.getTab()) {
			ajouterCompetence(cmpt);
		}
		
		return this;
	}
	
	/**
	 * renvoyer le liste des compétences d'une personne dous forme de tableau
	 * @return Un tableau de compétences
	 */
	public Competence[] getTabCompetences(){
		return (Competence[]) competences.getTab();
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
		Compatibilite compat = new Compatibilite();
		
		for (Competence cmpt : (Competence[]) liste.getTab()) {
			if (this.aCompetence(cmpt)) {
				nb ++;
				compat.add((Competence) cmpt.clone());
			} 
		}
		compat.add((double) nb/total);
		return compat;
	}
	
	public Compatibilite compatible(PlanCompetences plan){
		int nb = 0, total = plan.size();
		Compatibilite compat = new Compatibilite();
		
		for (Competence cmpt : plan.keySet()) {
			if (this.aCompetence(cmpt)) {
				nb ++;
				compat.add((Competence) cmpt.clone());
			} 
		}
		compat.add((double) nb/total);
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

	@Override
	public Integer getIdent() {
		return ID;
	}


}
