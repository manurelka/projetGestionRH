package missions;

import ressources.Compatibilite;
import ressources.Competence;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class EtatMissionEnPrepa extends EtatMission implements IMission {

	protected EtatMissionEnPrepa() {
		super(EtatMissionType.EnPreparation);
	}

	@Override
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) {
		ListePersonnes listeRep = new ListePersonnes();
		//Liste temporaire des competences
		ListeCompetences listeCompetences = new ListeCompetences();
		listeCompetences.ajouter(plan.keySet());
		
		//Tableau temporaire des personnes
		ListePersonnes personnes = new ListePersonnes();
		personnes.ajouter(liste);
		
		Personne candidat = null;
		Compatibilite compa, compaMax;
		
		while ((!listeCompetences.isEmpty()) && (personnes.taille() != 0)) {
			compa = new Compatibilite();
			compaMax = new Compatibilite();
			candidat = null;
			
			for (Personne personne : personnes.getTab()) {
				compa = personne.compatible(listeCompetences);
				if (compa.getTaux() > compaMax.getTaux()) {
					candidat = personne;
					compaMax = personne.compatible(listeCompetences);
				}
			}
			
			if (candidat != null) {
				listeRep.ajouter(candidat);
				personnes.supprimer(candidat);
			}
			
			for (Competence cmpt : compaMax.getCompetences()) {
				plan.put(cmpt, plan.get(cmpt) - 1);
				if (plan.get(cmpt) == 0){
					listeCompetences.supprimer(cmpt);
				}
			}
		}
		
		return listeRep;
	}

	@Override
	public void affecter(ContexteMission contexte, Mission mission, Personne personne) {
		System.out.println("etat : mono");
		mission.getPersonnel().ajouter(personne);
		if ( mission.getNbPersonnes() == mission.getNbPersonnesEffectif()) {
			contexte.setEtat(new EtatMissionPlanifiee());
		}
	}
	
	@Override
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste) {
		System.out.println("etat : liste");
		for (Personne personne : liste.getTab()) {
			affecter(contexte, mission, personne);
		}
	}
	
	@Override
	public void etatSuivant(ContexteMission contexte){
		contexte.setEtat(new EtatMissionPlanifiee());
	}

}
