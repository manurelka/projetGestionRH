package missions;

import ressources.ListePersonnes;
import ressources.Personne;

public interface IMission {
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel) throws EtatMissionIncompatibleException;
	public void affecter(Personne personne) throws EtatMissionIncompatibleException;
	public void affecter(ListePersonnes personnel) throws EtatMissionIncompatibleException;
}
