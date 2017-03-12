package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public interface IMissionAffectable extends IMission{
	public void affecter(Mission mission, Personne personne);
}
