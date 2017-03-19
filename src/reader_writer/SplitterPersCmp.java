package reader_writer;

import ressources.ListeCompetences;

public class SplitterPersCmp extends ObjectSplitter implements ISplitterPersCmp{
	private static final int NB_ID = 0;
	private static final int NB_PREM_CMP = 1;

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
	public ListeCompetences getCompetences(ConteneurStr conteneur) {
		ListeCompetences rendu = new ListeCompetences();
		for( int i =NB_PREM_CMP; i<getLength(); i++){
			rendu.ajouter(IHMCompetencesAccessor.competences_init.get(getMot(i)));
		}
		return rendu;
	}
	
	public void affecterCompetences (ConteneurStr conteneur){
		for (line : lines[] ){
			this.splitLine(line);
			IHMPersonnelAccessor.personnes_init.get(getID());
			ajouterCompetences(getCompetences(conteneur));
			
		}
	}
}
