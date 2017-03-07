package ressources;
/**
 * La classe Competence permet de rep�senter une comp�tence de la liste des comp�tences.
 * 
 * Elle permet de r�aliser les fonctionnalit�s suivantes :
 * a) cr�er un objet de type Competence ;
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class Competence implements Comparable {
	private final DCCompetence DC;
	//private final DomaineCompetences DOMAINE;
	//private final Integer CODE;
	// TODO gestion de la traduction
	private LibelleCompetence libelle;
	
	/**
	 * @param domaine Le domaine de la comp�tence (A, B, C, etc.)
	 * @param code Un entier positif repr�sentant le code de la comp�tence [1..n]
	 * @param libGB Le libelle de la comp�tence en anglais
	 * @param libFR Le libell� de la comp�tance en fran�ais
	 */
	public Competence(DomaineCompetences domaine, int code, String libGB, String libFR){
		//this.DOMAINE = domaine;
		//this.CODE = code;
		this.DC = new DCCompetence(domaine, code);
		this.libelle = new LibelleCompetence(libGB, libFR);
	}
	
	public Competence(DomaineCompetences domaine, String libGB, String libFR){
		this.DC = new DCCompetence(domaine, DCCompetence.nextCode(domaine));
		this.libelle = new LibelleCompetence(libGB, libFR);
	}
	
	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String str = DC.toString() + ";" + libelle.getLibGB() + ";" + libelle.getLibFR();
		return str;
	}
	
	/**
	 *  Affichage de la comp�tance sous forme "domaine.code. ;libelle(GB);libelle(FR)"
	 */
	public void afficher(){
		System.out.println(getClass().getSimpleName() + " : " + toString());
	}
	
	public DCCompetence getDC(){
		return DC;
	}
	
	/**
	 * Permet de savoir si une comp�tence a le libell� sp�cifi�
	 * 
	 * @param libelle Le libell� recherch�de type LibelleCompetence
	 * @return boolean
	 */
	public boolean aLibelle(LibelleCompetence libelle){
		return this.libelle.equals(libelle);
	}
	
	/**
	 * Permet de savoir si une comp�tence a le libell� sp�cifi� (en fran�ais ou en anglais)
	 * 
	 * @param libelle Le libell� recherch�de type String
	 * @return boolean
	 */
	public boolean aLibelle(String libelle){
		return aLibGB(libelle) || aLibFR(libelle);
	}
	
	/**
	 * Permet de savoir si le libell� d'une comp�tence a un mot cl� sp�cifi� (en fran�ais ou en anglais)
	 * 
	 * @param motCle Le mot cl� recherch�de type String
	 * @return boolean
	 */
	public boolean aMotCle(String motCle){
		return libelle.aMotCle(motCle);
	}
	
	/**
	 * Permet de savoir si une comp�tence a le libell� sp�cifi� (an anglais)
	 * 
	 * @param libelle Le libell� recherch� en anglais sous forme de String
	 * @return boolean
	 */
	public boolean aLibGB(String libelle){
		return this.libelle.aLibGB(libelle);
	}
	
	/**
	 * Permet de savoir si une comp�tence a le libell� sp�cifi� (an fran�ais)
	 * 
	 * @param libelle Le libell� recherch� en fran�ais sous forme de String
	 * @return boolean
	 */
	public boolean aLibFR(String libelle){
		return this.libelle.aLibFR(libelle);
	}
	
	public boolean equals(Object o){
		boolean rep = false;
		try {
			Competence cmpt = (Competence) o;
			rep = this.getDC().equals(cmpt.getDC()) && this.aLibelle(cmpt.libelle); 
		} catch(ClassCastException e) {
			System.out.println(TypeDifferentExceptionMSG.MESSAGE_ERREUR);
			e.printStackTrace();
		}
		return rep;
	}
	
	/**
	 * Permet de savoir si une comp�tence appartient au domaine sp�cifi�
	 * 
	 * @param domaine Le domaine � v�rifier de type DomaineCompetences
	 * @return boolean
	 */
	public boolean aDomaine(DomaineCompetences domaine){
		return DC.aDomaine(domaine);
	}
	
	/**
	 * Permet de savoir si une comp�tence a le code sp�cifi�
	 * 
	 * @param domaine Le code � v�rifier de type int
	 * @return boolean
	 */
	public boolean aCode(int code){
		return DC.aCode(code);
	}

	@Override
	public int compareTo(Object objet) {
		Competence cmp = (Competence) objet;
		
		return this.getDC().compareTo(cmp.getDC());
	}
	
	public String getLibFR(){
		return libelle.getLibFR();
	}
	
	public String getLibGB(){
		return libelle.getLibGB();
	}
	
	public void setLibFR(String libFR){
		libelle.setLibFR(libFR);
	}
	
	public void setLibGB(String libGB){
		libelle.setLibGB(libGB);
	}
	
	public DomaineCompetences getDomaine(){
		return DC.getPrem();
	}
	
	public Integer getCode(){
		return DC.getSec();
	}
}
