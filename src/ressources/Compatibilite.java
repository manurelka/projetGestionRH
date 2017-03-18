package ressources;
import java.util.ArrayList;

public class Compatibilite extends Couple<Double, ArrayList<Competence>>{

	public Compatibilite() {
		super(0., new ArrayList<Competence>());
	}
	
	public Double getTaux(){
		return getPrem();
	}
	
	public ArrayList<Competence> getCompetences(){
		return getSec();
	}
	
	public void add(Competence competence){
		getSec().add(competence);
	}
	
	public void add(double taux){
		setPrem(taux);
	}
	
	
	public Object clone(){
		Compatibilite cmp = new Compatibilite();
		cmp.setPrem(this.getPrem());
		
		for (Competence cmpt : getCompetences()) {
			cmp.add((Competence) cmpt.clone());
		}
		
		return cmp;
	}
}
