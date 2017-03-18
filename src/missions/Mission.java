package missions;

import ressources.Date;
import ressources.DateErronneeException;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public abstract class Mission implements IMissionActions{
	private static ListePersonnes listeTotaleOccupes = new ListePersonnes();
	private String nom;
	private int nbPersonnes;
	private Date dateDebut;
	private int duree; // en jours
	protected ContexteMission contexte;
	private ListePersonnes personnel;
	
	public Mission(String nom, int nbPersonnes, int jour, int mois, int annee, int duree){
		this.nom = nom;
		this.nbPersonnes  = nbPersonnes;
		try {
			this.dateDebut = new Date(jour, mois, annee);
		} catch (DateErronneeException e) {
			e.printStackTrace();
		}
		this.duree = duree;
		this.contexte = new ContexteMission();
		personnel = new ListePersonnes();
	}
	
	public String toString(){
		String rep = nom + ";";
		rep += nbPersonnes + ";";
		rep += dateDebut.toString() + ";";
		rep += contexte.toString();
		return rep;
	}
	
	public void afficher(){
		System.out.println("Mission : " + toString());
	}
	
	public int getNbPersonnes(){
		return nbPersonnes;
	}
	
	public void setNbPersonnes(int nbPersonnes){
		this.nbPersonnes = nbPersonnes;
	}
	
	public void afficherPersonnel(){
		this.personnel.afficher();
	}

	ListePersonnes getPersonnel(){
		return personnel;
	}
	
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
