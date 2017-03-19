package missions;

import ressources.Calendrier;
import java.util.Date;
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
	
	public Mission(String nom, int nbPersonnes, String ddMMyyyy, int duree){
		this(nom, nbPersonnes, Calendrier.date(ddMMyyyy), duree);
	}
	
	public Mission(String nom, int nbPersonnes, Date date, int duree){
		this.nom = nom;
		this.nbPersonnes  = nbPersonnes;
		this.dateDebut = date;
		this.duree = duree;
		this.contexte = new ContexteMission();
		personnel = new ListePersonnes();
	}
	
	public String toString(){
		String rep = nom + ";";
		rep += nbPersonnes + ";";
		rep += Calendrier.date(dateDebut) + ";";
		rep += contexte.toString();
		return rep;
	}
	
	public void afficher(){
		System.out.println("Mission : " + toString());
	}
	
	public Date getDateFin(){
		return Calendrier.dateFin(dateDebut, duree);
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
