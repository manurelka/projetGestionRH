package reader_writer;

import ressources.Competence;
import java.util.Date;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class SplitterPersonnel extends ObjectSplitter implements ISplitterPersonnel {
	private static final int NB_CASES = 4;
	
	private static final int NB_PRENOM = 0;
	private static final int NB_NOM = 1;
	private static final int NB_DATE = 2;
	private static final int NB_ID = 3;
		
	public SplitterPersonnel(){
		super(NB_CASES);
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
	public String getNom() {
		return getMot(NB_NOM);
	}

	@Override
	public String getPrenom() {
		return getMot(NB_PRENOM);
	}


	@Override
	public String getDate() {
		return getMot(NB_DATE);
	}
	
	@Override
	public ListePersonnes getPersonnel(ConteneurStr conteneur) {
		ListePersonnes liste = new ListePersonnes();
		
		for (String ligne : conteneur.getDonnees()){
			this.splitLine(ligne);
			//DEBUG afficher();
			liste.ajouter(new Personne(getNom(), getPrenom(), getID(), getDate()));
		}
		
		return liste;
	}

	

}
