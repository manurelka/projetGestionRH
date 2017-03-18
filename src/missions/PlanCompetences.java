package missions;

import java.util.TreeMap;

import ressources.Competence;

public class PlanCompetences extends TreeMap<Competence, Integer>{
	
	public PlanCompetences(){
		super();
	}
	
	public PlanCompetences(PlanCompetences plan){
		for(Competence cmpt : plan.keySet()){
			int value = plan.get(cmpt);
			this.put(cmpt, value);
		}
	}
	
	public int sommePersonnes(){
		int somme = 0;
		
		for(Competence cmpt : this.keySet()){
			somme += this.get(cmpt);
		}
		
		return somme;
	}
	
}
