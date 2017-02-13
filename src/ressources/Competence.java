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
	private LibelleCompetence libelle;
	
	/*
	 * @param domaine Le domaine de la compétence (A, B, C, etc.)
	 * @param code Un entier positif représentant le code de la compétence [1..n]
	 * @param libGB Le libelle de la compétence en anglais
	 * @param libFR Le libellé de la compétance en français
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
	 *  Affichage de la compétance sous forme "domaine.code. ;libelle(GB);libelle(FR)"
	 */
	public void afficher(){
		System.out.println(getClass().getSimpleName() + " : " + toString());
	}
}
