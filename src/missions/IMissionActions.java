package missions;

import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public interface IMissionActions {
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes personnel) throws EtatMissionIncompatibleException;
	public ListePersonnes recommander(ListeCompetences prerequis, ListePersonnes personnel) throws EtatMissionIncompatibleException;
	public void affecter(Personne personne) throws EtatMissionIncompatibleException;
	public void affecter(ListePersonnes personnel) throws EtatMissionIncompatibleException;
	public void enlever(Personne personne) throws EtatMissionIncompatibleException;
}
