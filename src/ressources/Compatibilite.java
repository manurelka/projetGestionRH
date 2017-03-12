package ressources;
import java.util.ArrayList;

public class Compatibilite extends Couple<Double, ArrayList<Competence>>{

	protected Compatibilite(Double prem, ArrayList<Competence> sec) {
		super(prem, sec);
	}
	
	public Compatibilite() {
		super(0., new ArrayList<Competence>());
	}
	
	public Double getTaux(){
		return getPrem();
	}
	
	public ArrayList<Competence> getCompetences(){
		return getSec();
	}

}
