package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public interface IMissionAffectable extends IMission{
	public ListePersonnes recommander(Mission mission, ListePersonnes liste);
	public void affacter(Mission mission, Personne personne);
}
