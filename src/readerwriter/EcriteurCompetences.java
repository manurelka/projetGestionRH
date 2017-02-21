package readerwriter;

public class EcriteurCompetences extends Ecriteur {
	private static final String CHEMIN = "fichConfig/liste_competences.csv";
	private static EcriteurCompetences instance = null;
	
	private EcriteurCompetences() {
		super(CHEMIN);
	}
	
	public static EcriteurCompetences Instance (){
		if ( instance == null){
			instance = new EcriteurCompetences();
		}
		return instance;
	}

}
