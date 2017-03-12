package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public interface IMission {

	public void etatSuivant(ContexteMission contexte);
	
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste);
	
	public void affecter(ContexteMission contexte, Mission mission, Personne personne);
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste);
}
