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
	private LibelleCompetence libelle;
	
	/*
	 * @param domaine Le domaine de la comp�tence (A, B, C, etc.)
	 * @param code Un entier positif repr�sentant le code de la comp�tence [1..n]
	 * @param libGB Le libelle de la comp�tence en anglais
	 * @param libFR Le libell� de la comp�tance en fran�ais
	 */
	public Competence(DomaineCompetences domaine, int code, String libGB, String libFR){
		this.DOMAINE = domaine;
		this.CODE = code;
		this.libelle = new LibelleCompetence(libGB, libFR);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String str = DOMAINE.getStr() + "." + CODE + ". ;" + libelle.getLibGB() + ";" + libelle.getLibFR();
		return str;
	}
	
	/*
	 *  Affichage de la comp�tance sous forme "domaine.code. ;libelle(GB);libelle(FR)"
	 */
	public void afficher(){
		System.out.println(getClass().getSimpleName() + " : " + toString());
	}
}
