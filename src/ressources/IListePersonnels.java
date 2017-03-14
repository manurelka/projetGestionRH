package ressources;

public interface IListePersonnels extends IListeRessources<Integer, Personne> {
	
	/**
	 * Recherche des personnes par nom et pr�nom.
	 * 
	 * @param nom et prenom d'une personne
	 * @retun Une collection de personnes
	 */
	public abstract ListePersonnes get(String nom, String prenom);
	
	/**
	 * Recherche des personnes par code.
	 * 
	 * @param code Le code recherch� de type int
	 * @return Une collection de personnes
	 */
	public abstract Personne get(int code);
	
	/**
	 * Recherche des personnes par mot cl�.
	 * 
	 * @param motCle Le mot cl� recherch� de type String
	 * @return Une collection de personnes
	 */
	public abstract ListePersonnes get(String motCle);

}
