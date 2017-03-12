package missions;

import ressources.Date;
import ressources.DateErronneeException;
import ressources.ListeCompetences;
import ressources.ListePersonnes;

public abstract class Mission {
	private String nom;
	private int nbPersonnes;
	private Date dateDebut;
	private int duree; // en jours
	private EtatMission etat;
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
		this.etat = new MissionEnPreparation();
		personnel = new ListePersonnes();
	}
	
	public String toString(){
		String rep = nom + ";";
		rep += nbPersonnes + ";";
		rep += dateDebut.toString() + ";";
		rep += etat.toString();
		return rep;
	}
	
	public void afficher(){
		System.out.println("Mission : " + toString());
	}
}
