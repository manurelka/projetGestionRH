package missions;

import java.util.Date;

import ressources.Calendrier;
import ressources.Competence;
import ressources.ListePersonnes;

public class MissionRealisation extends Mission {
	private PlanCompetences plan;
	
	public MissionRealisation(String nom, int nbPersonnes, String ddMMyyyy, int duree){
		this(nom, nbPersonnes, Calendrier.date(ddMMyyyy), duree);
	}
	
	public MissionRealisation(String nom, int nbPersonnes, Date date, int duree){
		super(nom, nbPersonnes, date, duree);
		this.plan = new PlanCompetences();
	}

	public ListePersonnes recommander(ListePersonnes personnel){
		try {
			return super.recommander(plan, personnel);
		} catch (EtatMissionIncompatibleException e) {
			System.out.println(e.getMessage());
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
