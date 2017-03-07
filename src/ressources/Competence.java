package ressources;
/**
 * La classe Competence permet de repésenter une compétence de la liste des compétences.
 * 
 * Elle permet de réaliser les fonctionnalités suivantes :
 * a) créer un objet de type Competence ;
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
	 * @param domaine Le domaine de la compétence (A, B, C, etc.)
	 * @param code Un entier positif représentant le code de la compétence [1..n]
	 * @param libGB Le libelle de la compétence en anglais
	 * @param libFR Le libellé de la compétance en français
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
	 *  Affichage de la compétance sous forme "domaine.code. ;libelle(GB);libelle(FR)"
	 */
	public void afficher(){
		System.out.println(getClass().getSimpleName() + " : " + toString());
	}
	
	public DCCompetence getDC(){
		return DC;
	}
	
	/**
	 * Permet de savoir si une compétence a le libellé spécifié
	 * 
	 * @param libelle Le libellé recherchéde type LibelleCompetence
	 * @return boolean
	 */
	public boolean aLibelle(LibelleCompetence libelle){
		return this.libelle.equals(libelle);
	}
	
	/**
	 * Permet de savoir si une compétence a le libellé spécifié (en français ou en anglais)
	 * 
	 * @param libelle Le libellé recherchéde type String
	 * @return boolean
	 */
	public boolean aLibelle(String libelle){
		return aLibGB(libelle) || aLibFR(libelle);
	}
	
	/**
	 * Permet de savoir si le libellé d'une compétence a un mot clé spécifié (en français ou en anglais)
	 * 
	 * @param motCle Le mot clé recherchéde type String
	 * @return boolean
	 */
	public boolean aMotCle(String motCle){
		return libelle.aMotCle(motCle);
	}
	
	/**
	 * Permet de savoir si une compétence a le libellé spécifié (an anglais)
	 * 
	 * @param libelle Le libellé recherché en anglais sous forme de String
	 * @return boolean
	 */
	public boolean aLibGB(String libelle){
		return this.libelle.aLibGB(libelle);
	}
	
	/**
	 * Permet de savoir si une compétence a le libellé spécifié (an français)
	 * 
	 * @param libelle Le libellé recherché en français sous forme de String
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
	 * Permet de savoir si une compétence appartient au domaine spécifié
	 * 
	 * @param domaine Le domaine à vérifier de type DomaineCompetences
	 * @return boolean
	 */
	public boolean aDomaine(DomaineCompetences domaine){
		return DC.aDomaine(domaine);
	}
	
	/**
	 * Permet de savoir si une compétence a le code spécifié
	 * 
	 * @param domaine Le code à vérifier de type int
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
