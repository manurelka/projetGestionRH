package missions;

import ressources.Compatibilite;
import ressources.Competence;
import ressources.DCCompetence;
import ressources.IListeRessources;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;
import ressources.Ressource;

public class EtatMissionEnPrepa extends EtatMission implements IEtatMission {

	protected EtatMissionEnPrepa() {
		super(EtatMissionType.EnPreparation);
	}

	@Override
	public ListePersonnes recommander(PlanCompetences plan, ListePersonnes liste) {
		//System.out.println("Entrée état en préparation"); // debug
		
		//Liste temporaire de personnes
		ListePersonnes candidats = new ListePersonnes();
		candidats.ajouter(liste);
		
		//La liste des personnes compatibles
		ListePersonnes propo = new ListePersonnes();
		
		//Plan de competences temporaire
		PlanCompetences planClone = new PlanCompetences(plan);
		
		//Compatibilités
		Compatibilite compatMax = new Compatibilite();
		Compatibilite compatCour = new Compatibilite();
		
		//Candidat courant
		Personne candidatMax = null;
		
		//Tant qu'il y a encore des compétences à satifaire et la liste des candidats n'est pas vide 
		while((!planClone.isEmpty()) && (!candidats.isEmpty())) {
			
			//Rechercher parmi les candidats la personne la plus compatible
			for (Personne personne : candidats.getTab()) {
				//Calculer la compatibilité courante
				compatCour = personne.compatible(planClone);
				
				/*System.out.println("for"); // debug
				personne.afficher(); // debug
				System.out.println("compat cour :"); // debug
				compatCour.afficher(); // debug
				System.out.println("compat max :"); // debug
				compatMax.afficher(); // debug
*/				
				//Si elle est plus grande que le compatibilité maximale
				if (compatCour.getTaux() > compatMax.getTaux()){
					//System.out.println("if"); // debug
					
					//Mettre à jour la valeur de la compatibilité maximale
					compatMax = (Compatibilite) compatCour.clone();
					//Enrégistrer le candidat compatible
					candidatMax = personne;
					
					/*System.out.println("candidat max :"); // debug
					candidatMax.afficher(); // debug
*/				}
			}
			
			//Si un candidat a été choisi
			if (candidatMax != null) {
				//Aouter le candidat compatible à la liste des propositions
				/*System.out.println("Ajouter candidat"); // debug
				System.out.println("candidat max :"); // debug
				candidatMax.afficher(); // debug
*/				
				propo.ajouter(candidatMax);
				
				//propo.afficher(); // debug
				
				//Supprimer le candidat compatible de la liste des candidats
				candidats.supprimer(candidatMax);
				
				//candidats.afficher(); // debug
				
				//Réinitialiser le candidat choisi pour une nouvelle recherche
				candidatMax = null;
				
				//Mettre à jour le plan des compétences
				//Pour chaque compétence que le candidat choisi satisfait
				for (Competence cmpt : compatMax.getCompetences()) {
					//diminuer le nombre de personnes recherhcées
					int value = planClone.get(cmpt) - 1;
					
					/*System.out.println("Competence maj"); //debug
					cmpt.afficher(); //debug
					System.out.println(value); //debug
*/					
					//Si aucune personne n'est plus nécessaire
					if(value == 0) {
						//supprimer la compétence de la liste
						planClone.remove(cmpt);
					} else {
						//sinon mettre à jour le nombre de personnes nécessaires
						planClone.put(cmpt, value);
					}
				}
				
				//Réinitialiser la compatibilité maximale pour une nouvelle recherche
				compatMax = new Compatibilite();
				
				/*compatCour.afficher(); //debug
				compatMax.afficher(); //debug
*/			}	
			
		}
		
		//Retourner la liste des propositions
		return propo;
	}

	@Override
	public void affecter(ContexteMission contexte, Mission mission, Personne personne) {
		mission.getPersonnel().ajouter(personne);
		
		if ( mission.getNbPersonnes() == mission.getNbPersonnesEffectif()) {
			contexte.setEtat(new EtatMissionPlanifiee());
		}
	}
	
	@Override
	public void affecter(ContexteMission contexte, Mission mission, ListePersonnes liste) {
		
		for (Personne personne : (Personne[]) liste.getTab()) {
			affecter(contexte, mission, personne);
		}
	}
	
	@Override
	public void etatSuivant(ContexteMission contexte){
		contexte.setEtat(new EtatMissionPlanifiee());
	}

}
