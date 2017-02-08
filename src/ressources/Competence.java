package ressources;
/*
 * La classe Competence permet de repésenter une compétence de la liste des compétences.
 * 
 * Elle permet de réaliser les fonctionnalités suivantes :
 * a) créer un objet de type Competence ;
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class Competence {
	private final DomaineCompetences DOMAINE;
	private final int CODE;
	// TODO gestion de la traduction
	private String libelle;
	
	/*
	 * @param domaine Le domaine de la compétence (A, B, C, etc.)
	 * @param code Un entier positif représentant le code de la compétence [1..n]
	 * @param libelle Le libelle de la compétence (initiallement de type String)
	 */
	public Competence(DomaineCompetences domaine, int code, String libelle){
		this.DOMAINE = domaine;
		this.CODE = code;
		this.libelle = libelle;
	}
	
	// TODO Affichage de la compétance sous forme "domaine.code. ;libelle(GB);libelle(FR)"
}
