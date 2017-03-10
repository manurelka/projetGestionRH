package ressources;
/**
 * La classe Personne représente un collaborateur de la liste du personnel.
 * Elle permet de réaliser les fonctionnalités suivantes :
 * a) créer un objet de type Personne (collaborateur)
 * b) afficher les données d'un collaborateur
 * c) afficher les compétences d'un collaborateur
 * @author Emma, Manuela
 * @version 0.0
 */
public class Personne {
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
	
	public double compatible(ListeCompetences liste){
		int nb = 0, total = liste.taille();
		for (Competence cmpt : liste.getTab()) {
			if (this.aCompetence(cmpt)) {
				nb ++;
			} 
		}
		
		return (double) nb / total;
	}
}
