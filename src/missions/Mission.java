package missions;

import ressources.Date;
import ressources.DateErronneeException;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public abstract class Mission {
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
	
	public void affecter(Personne personne){
		System.out.println("mission");
		contexte.affecter(this, personne);
	}
	
	public void afficherPersonnel(){
		this.personnel.afficher();
	}
	
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel){
		return contexte.recommander(plan, personnel);
	}
	
	public void affecter(ListePersonnes personnel){
		System.out.println("mission");
		contexte.affecter(this, personnel);
	}
	
	ListePersonnes getPersonnel(){
		return personnel;
	}
	
	int getNbPersonnesEffectif(){
		return personnel.taille();
	}
	
}
