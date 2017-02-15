package readerwriter;
import ressources.DomaineCompetences;
import ressources.ListeCompetences;
import ressources.Competence;
/**
 * Permet de transformer les données d'un contenuer de compétences
 * en forme compatible avec la classe Competence.
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class SplitterCompetences extends ObjectSplitter implements ISplitterCompetences{
	private static final int NB_CASES = 4;
	private static final int NB_DOMAINE = 0;
	private static final int NB_CODE = 1;
	private static final int NB_LIB_GB = 2;
	private static final int NB_LIB_FR = 3;
	private static final int NB_LIB_FR_INT = 2;
	private static final int NB_LIB_GB_INT = 1;
	
	private SplitterCodeDomaine pointSplitter;
	private String[] interm;
	
	public SplitterCompetences(){
		super(NB_CASES);
		pointSplitter = new SplitterCodeDomaine();
	}
	
	@Override
	public void splitLine(String line) {
		interm = line.split(getRegex());
		pointSplitter.splitLine(interm[0]);
		
		// Remplir les valeurs
		setDomaine(pointSplitter.getDomaine());
		setCode(pointSplitter.getCode());
		setLibGB(getIntLibGB());
		setLibFR(getIntLibFR());
	}

	@Override
	public void setLibFR(String mot) {
		setMot(mot, NB_LIB_FR);
	}

	@Override
	public void setLibGB(String mot) {
		setMot(mot, NB_LIB_GB);
	}

	@Override
	public void setDomaine(String mot) {
		setMot(mot, NB_DOMAINE);
	}

	@Override
	public void setCode(String mot) {
		setMot(mot, NB_CODE);
	}

	@Override
	public String getLibFR() {
		return getMot(NB_LIB_FR);
	}

	@Override
	public String getLibGB() {
		return getMot(NB_LIB_GB);
	}

	@Override
	public DomaineCompetences getDomaine() {
		return DomaineCompetences.parseDomaine(getMot(NB_DOMAINE));
	}

	@Override
	public Integer getCode() {
		return Integer.parseInt(getMot(NB_CODE));
	}

	private String getIntLibFR() {
		return interm[NB_LIB_FR_INT];
	}

	private String getIntLibGB() {
		return interm[NB_LIB_GB_INT];
	}
	
	@Override
	public ListeCompetences getCompetences(ConteneurStr conteneur){
		ListeCompetences liste = new ListeCompetences();
		
		for (String ligne : conteneur.getDonnees()){
			this.splitLine(ligne);
			//DEBUG afficher();
			liste.ajouter(new Competence(getDomaine(), getCode(), getLibGB(), getLibFR()));
		}
		
		return liste;
	}

}
