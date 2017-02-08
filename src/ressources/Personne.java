package ressources;
/*
 * La classe Personne repr�sente un collaborateur de la liste du personnel.
 * Elle permet de r�aliser les fonctionnalit�s suivantes :
 * a) cr�er un objet de type Personne (collaborateur)
 * b) afficher les donn�es d'un collaborateur
 * c) afficher les comp�tences d'un collaborateur
 * @author Emma, Manuela
 * @version 0.0
 */
public class Personne {
	//TODO cr�er une date par d�faut
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
			System.out.println(e.getMessage() + "\nSp�cifier la date plus tard.");
		}
	}
	
	private Personne(String prenom, String nom, int id){
		this.nom = nom;
		this.prenom = prenom;
		this.ID = id;
	}
	/*
	 * Renvoie un String repr�sentant les donn�es d'un employ� sous la forme suivante :
	 * "prenom;nom;date d'entr�e en entreprise;identifiant"
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = prenom + ";" + nom + ";" + dateEntree.toString() + ";" + ID; 
		return str;
	}
	
	/*
	 * Affiche les donn�es d'une instance de la classe dans la console.
	 */
	public void afficher(){
		System.out.println(toString());
	}
}
