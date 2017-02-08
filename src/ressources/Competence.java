package ressources;
/*
 * La classe Competence permet de rep�senter une comp�tence de la liste des comp�tences.
 * 
 * Elle permet de r�aliser les fonctionnalit�s suivantes :
 * a) cr�er un objet de type Competence ;
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
	 * @param domaine Le domaine de la comp�tence (A, B, C, etc.)
	 * @param code Un entier positif repr�sentant le code de la comp�tence [1..n]
	 * @param libelle Le libelle de la comp�tence (initiallement de type String)
	 */
	public Competence(DomaineCompetences domaine, int code, String libelle){
		this.DOMAINE = domaine;
		this.CODE = code;
		this.libelle = libelle;
	}
	
	// TODO Affichage de la comp�tance sous forme "domaine.code. ;libelle(GB);libelle(FR)"
}
