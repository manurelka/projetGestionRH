package ressources;
/**
 * Assure la communication avec une collection de comp�tences
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface IListeCompetences extends IListeRessources<Competence>{

	/**
	 * Recherche des comp�tences par domaine.
	 * 
	 * @param domaine Le domaine recherhc� de type DomaineCompetences
	 * @retun Une collection de comp�tences
	 */
	public abstract ListeCompetences get(DomaineCompetences domaine);
	
	/**
	 * Recherche des comp�tences par code.
	 * 
	 * @param code Le code recherhc� de type int
	 * @return Une collection de comp�tences
	 */
	public abstract ListeCompetences get(int code);
	
	/**
	 * Recherche des comp�tences par mot cl�.
	 * 
	 * @param motCle Le mot cl� recherhc� de type String
	 * @return Une collection de comp�tences
	 */
	public abstract ListeCompetences get(String motCle);

	/**
	 * Recherche des comp�tences par domaine et code.
	 * 
	 * @param dc Le param�tre recherhc� de type DCCompetence
	 * @return La r�f�rence vers une comp�tence
	 */
	public abstract Competence get(DCCompetence dc);
}
