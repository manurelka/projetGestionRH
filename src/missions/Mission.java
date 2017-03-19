package missions;

import ressources.Calendrier;
import java.util.Date;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;
/**
 * Une mission abstraite, caractérisée par son nom (identifiant), le nombre de personnes nécessaires à la réalisation de la mission,
 * sa date de début, sa durée.
 * La mission a un contexte contenant l'état actuel de la mission et une liste de personnes affectées.
 * La classe contient une liste de personnes statique qui contient la totalité des personnes occupées dans des missions différentes. 
 * @author Manuela
 *
 */
public abstract class Mission implements IMissionActions, ITemporaire{
	private static ListePersonnes listeTotaleOccupes = new ListePersonnes();
	private String nom;
	private int nbPersonnes;
	private Date dateDebut;
	private int duree; // en jours
	protected ContexteMission contexte;
	private ListePersonnes personnel;
	
	/**
	 * 
	 * @param nom Le nome de la mission. Choisir un nom unique car identifiant.
	 * @param nbPersonnes Le nombre de personnes nécessaires à la réalisation de la mission
	 * @param ddMMyyyy La date de début de la mission sous forme de string en format "jj/MM/aaaa"
	 * @param duree La durée de la mission en nombre de jours (entiers)
	 */
	public Mission(String nom, int nbPersonnes, String ddMMyyyy, int duree){
		this(nom, nbPersonnes, Calendrier.date(ddMMyyyy), duree);
	}
	
	/**
	 * 
	 * @param nom Le nom de la mission. Choisir un nom unique car identifiant
	 * @param nbPersonnes Le nombre de personnes nécessaires à la réalisation de la mission
	 * @param date La date de début de la mission (java.util.Date)
	 * @param duree La durée de la mission en nombre de jours (entiers)
	 */
	public Mission(String nom, int nbPersonnes, Date date, int duree){
		this.nom = nom;
		this.nbPersonnes  = nbPersonnes;
		this.dateDebut = date;
		this.duree = duree;
		this.contexte = new ContexteMission();
		personnel = new ListePersonnes();
	}
	
	/**
	 * Retourne la mission sous forme de string en format : "nom;nbPersonnes;dateDebut;etat"
	 */
	public String toString(){
		String rep = nom + ";";
		rep += nbPersonnes + ";";
		rep += Calendrier.date(dateDebut) + ";";
		rep += contexte.toString();
		return rep;
	}
	
	/**
	 * Affihce les données de la mission
	 */
	public void afficher(){
		System.out.println("Mission : " + toString());
	}
	
	/**
	 * 
	 * @return La date de fin de la mission calculée à la base de la date de début plus le nombre de jours de la durée
	 */
	public Date getDateFin(){
		return Calendrier.dateFin(dateDebut, duree);
	}
	
	/**
	 * 
	 * @return Le nom de la mission (String)
	 */
	public String getNom(){
		return this.nom;
	}
	
	/**
	 * 
	 * @return Le nombre de personnes nécessaires à la réalisation d'une mission
	 */
	public int getNbPersonnes(){
		return nbPersonnes;
	}
	
	public void setNbPersonnes(int nbPersonnes){
		this.nbPersonnes = nbPersonnes;
	}
	
	/**
	 * Affiche la liste des personnes affectées à la mission
	 */
	public void afficherPersonnel(){
		this.personnel.afficher();
	}

	/**
	 * 
	 * @return La liste des parsonnes affectées à la mission
	 */
	ListePersonnes getPersonnel(){
		return personnel;
	}
	
	/**
	 * 
	 * @return Le nombre de personnes affectées à la mission
	 */
	int getNbPersonnesEffectif(){
		return personnel.taille();
	}
	
	@Override
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("Entrée mission"); //debug
		return contexte.recommander(plan, personnel);
	}
	
	@Override
	public ListePersonnes recommander(ListeCompetences prerequis, ListePersonnes personnel) throws EtatMissionIncompatibleException{
		//System.out.println("Entrée mission"); //debug
		return contexte.recommander(nbPersonnes, prerequis, personnel);
	}
	
	@Override
	public void affecter(Personne personne) {
		try {
			contexte.affecter(this, personne);
		} catch (EtatMissionIncompatibleException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Override
	public void affecter(ListePersonnes personnel) {
		try {
			contexte.affecter(this, personnel);
		} catch (EtatMissionIncompatibleException e) {
			System.out.print(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Override
	public void enlever(Personne personne) throws EtatMissionIncompatibleException {
		contexte.enlever(this, personne);
	}
	
	@Override
	public void attribuer(ListeCompetences competences) throws EtatMissionIncompatibleException {
		contexte.attribuer(this, competences);
	}
	
	@Override
	public void majTemps(){
		contexte.majTemps(this);
	}
	
	public boolean dateDebutPassee(){
		return Calendrier.estPassee(dateDebut);
	}
	
	public boolean dateFinPassee(){
		return Calendrier.estPassee(getDateFin());
	}
	
	public static void occuper(Personne personne){
		Mission.listeTotaleOccupes.ajouter(personne);
	}
	
	public static void listeTotaleOccupes(){
		Mission.listeTotaleOccupes.afficher();
	}
	
	public static boolean estOccupe(Personne personne){
		return Mission.listeTotaleOccupes.estAjoute(personne);
	}
	
}
