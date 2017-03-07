package ressources;

public interface IListePersonnels extends IListeRessources<Personne> {
	
	/**
	 * Recherche des personnes par nom et prénom.
	 * 
	 * @param nom et prenom d'une personne
	 * @retun Une collection de personnes
	 */
	public abstract ListePersonnes get(String nom, String prenom);
	
	/**
	 * Recherche des personnes par code.
	 * 
	 * @param code Le code recherché de type int
	 * @return Une collection de personnes
	 */
	public abstract ListePersonnes get(int code);
	
	/**
	 * Recherche des personnes par mot clé.
	 * 
	 * @param motCle Le mot clé recherché de type String
	 * @return Une collection de personnes
	 */
	public abstract ListePersonnes get(String motCle);

}
