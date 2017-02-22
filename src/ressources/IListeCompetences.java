package ressources;
/**
 * Assure la communication avec une collection de compétences
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public interface IListeCompetences extends IListeRessources<Competence>{

	/**
	 * Recherche des compétences par domaine.
	 * 
	 * @param domaine Le domaine recherhcé de type DomaineCompetences
	 * @retun Une collection de compétences
	 */
	public abstract ListeCompetences get(DomaineCompetences domaine);
	
	/**
	 * Recherche des compétences par code.
	 * 
	 * @param code Le code recherhcé de type int
	 * @return Une collection de compétences
	 */
	public abstract ListeCompetences get(int code);
	
	/**
	 * Recherche des compétences par mot clé.
	 * 
	 * @param motCle Le mot clé recherhcé de type String
	 * @return Une collection de compétences
	 */
	public abstract ListeCompetences get(String motCle);

	/**
	 * Recherche des compétences par domaine et code.
	 * 
	 * @param dc Le paramètre recherhcé de type DCCompetence
	 * @return La référence vers une compétence
	 */
	public abstract Competence get(DCCompetence dc);
}
