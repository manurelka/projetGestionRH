package missions;

import ressources.Competence;
import ressources.ListePersonnes;

public class MissionRealisation extends Mission {
	private PlanCompetences plan;
	
	public MissionRealisation(String nom, int nbPersonnes, int jour, int mois, int annee, int duree){
		super(nom, nbPersonnes, jour, mois, annee, duree);
		this.plan = new PlanCompetences();
	}

	public ListePersonnes recommander(ListePersonnes personnel){
		System.out.println("Entrée mission réalisation");
		
		try {
			return super.recommander(plan, personnel);
		} catch (EtatMissionIncompatibleException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void addPlan(Competence cmpt, int nbPersonnes){
		plan.put(cmpt, nbPersonnes);
		if (plan.sommePersonnes() > getNbPersonnes()) {
			setNbPersonnes(plan.sommePersonnes());
		}
	}
	
}
