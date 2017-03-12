package missions;

import ressources.ListePersonnes;

public interface IMission {

	public ListePersonnes[] recommander(Mission mission, ListePersonnes liste);
}
