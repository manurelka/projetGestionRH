package reader_writer;

import ressources.DCCompetence;
import ressources.ListeCompetences;

public class SplitterPersCmp extends ObjectSplitter implements ISplitterPersCmp{
	private static final int NB_ID = 0;
	private static final int NB_PREM_CMP = 1;
	private SplitterCodeDomaine pointSplitter;

	protected SplitterPersCmp() {
		super();
	}

	@Override
	public void splitLine(String line) {
		setMots(line.split(getRegex()));
	}

	@Override
	public Integer getID() {
		return Integer.parseInt(getMot(NB_ID));
	}

	@Override
	public ListeCompetences getCompetences() {
		ListeCompetences rendu = new ListeCompetences();
		for( int i =NB_PREM_CMP; i<getLength(); i++){
			DCCompetence cmp;
			pointSplitter.splitLine(getMot(i));
			cmp = new DCCompetence(pointSplitter.getDomaine(), pointSplitter.getCode());
			rendu.ajouter(IHMCompetencesAccessor.competences_init.get(getMot(i)));
		}
		return rendu;
	}
	
	public void affecterCompetences (ConteneurStr conteneur){
		System.out.println("--- splitter ---");
		for (String ligne : conteneur.getDonnees() ){
			this.splitLine(ligne);
			System.out.println(ligne);
			//IHMPersonnelAccessor.personnes_init.get(getID()).ajouterCompetence(getCompetences());
			IHMPersonnelAccessor.personnes_init.get(getID()).afficher();
			getCompetences().afficher();
		}
	}
}
