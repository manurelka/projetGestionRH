package ressources;
/**
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
	 * Renvoie un String repr�sentant les donn�es d'un employ� sous la forme suivante :
	 * "prenom;nom;date d'entr�e en entreprise;identifiant"
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = prenom + ";" + nom + ";" + dateEntree.toString() + ";" + ID; 
		return str;
	}
	
	/**
	 * Affiche les donn�es d'une instance de la classe dans la console.
	 */
	public void afficher(){
		System.out.println(getClass().getSimpleName() + " : " + toString());
	}
	
	public Integer getID(){
		return ID;
	}
	
	/**
	 * ajouter une comp�tence � la liste des comp�tences d'une personne
	 * @param cmpt La comp�tence
	 * @return la personne elle m�me
	 */
	public Personne ajouterCompetence(Competence cmpt){
		competences.ajouter(cmpt);
		return this;
	}
	
	/**
	 * renvoyer le liste des comp�tences d'une personne dous forme de tableau
	 * @return Un tableau de comp�tences
	 */
	public Competence[] getTabCompetences(){
		return competences.getTab();
	}
	
	/**
	 * afficher la liste des comp�tences d'un personne
	 */
	public void afficherCompetences(){
		competences.afficher();
	}
	
	/**
	 * 
	 * @param dc le domaine et le code d'une comp�tence
	 * @return la comp�tence recherch� si elle est dans la liste, null sinon
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
