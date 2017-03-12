package ressources;
import java.util.ArrayList;

public class Compatibilite extends Couple<Double, ArrayList<Competence>>{

	protected Compatibilite(Double prem, ArrayList<Competence> sec) {
		super(prem, sec);
	}
	
	public Double getTaux(){
		return getPrem();
	}
	
	public ArrayList<Competence> getCompetences(){
		return getSec();
	}

}
