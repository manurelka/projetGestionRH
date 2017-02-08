package ressources;
/*
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
	private final int ID;
	private String nom;
	private String prenom;
	private Date dateEntree;
	private ListeCompetences competences;
	
	public Personne(String prenom, String nom, int id, int jour, int mois, int annee) {
		this(prenom, nom, id);
		try {
			Date newDate = new Date(jour, mois, annee);
			this.dateEntree = newDate;
		} catch (DateErronneeException e) {
			System.out.println(e.getMessage() + "\nSpécifier la date plus tard.");
		}
	}
	
	private Personne(String prenom, String nom, int id){
		this.nom = nom;
		this.prenom = prenom;
		this.ID = id;
	}
	/*
	 * Renvoie un String représentant les données d'un employé sous la forme suivante :
	 * "prenom;nom;date d'entrée en entreprise;identifiant"
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = prenom + ";" + nom + ";" + dateEntree.toString() + ";" + ID; 
		return str;
	}
	
	/*
	 * Affiche les données d'une instance de la classe dans la console.
	 */
	public void afficher(){
		System.out.println(toString());
	}
}
