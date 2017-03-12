package missions;

import java.util.TreeMap;

import ressources.Competence;

public class PlanCompetences extends TreeMap<Competence, Integer>{
	
	public int sommePersonnes(){
		int somme = 0;
		
		for(Competence cmpt : this.keySet()){
			somme += this.get(cmpt);
		}
		
		return somme;
	}
	
}
