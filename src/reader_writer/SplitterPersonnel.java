package reader_writer;

import ressources.Competence;
import ressources.Date;
import ressources.ListeCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class SplitterPersonnel extends ObjectSplitter implements ISplitterPersonnel {
	private static final int NB_CASES = 6;
	
	private static final int NB_NOM = 0;
	private static final int NB_PRENOM = 1;
	private static final int NB_ID = 2;
	private static final int NB_DATEJ = 3;
	private static final int NB_DATEM = 4;
	private static final int NB_DATEA = 5;
	
	private static final int NB_PRENOM_INT = 0;
	private static final int NB_NOM_INT = 1;
	private static final int NB_ID_INT = 3;
	
	private SplitterDateEntree slashSplitter;
	private String[] interm;
	
	public SplitterPersonnel(){
		super(NB_CASES);
		slashSplitter = new SplitterDateEntree();
	}
	

	@Override
	public void splitLine(String line) {
		interm = line.split(getRegex());
		slashSplitter.splitLine(interm[2]);
		
		
		// Remplir les valeurs
		setID(getIDInterm());
		setNom(getNomInterm ());
		setPrenom(getPrenomInterm());
		setDateJour(slashSplitter.getDateJour());
		setDateMois(slashSplitter.getDateMois());
		setDateAnnee(slashSplitter.getDateAnnee());
	}
	
	


	@Override
	public void setID(String mot) {
		setMot(mot, NB_ID);
	}


	@Override
	public void setNom(String mot) {
		setMot(mot, NB_NOM);
		
	}


	@Override
	public void setPrenom(String mot) {
		setMot(mot, NB_PRENOM);
		
	}


	@Override
	public void setDateJour(String mot) {
		setMot(mot, NB_DATEJ);
		
	}
	
	@Override
	public void setDateMois(String mot) {
		setMot(mot, NB_DATEM);
		
	}
	
	@Override
	public void setDateAnnee(String mot) {
		setMot(mot, NB_DATEA);
		
	}

	public String getIDInterm() {
		return interm[NB_ID_INT];
	}
	
	@Override
	public Integer getID() {
		return Integer.parseInt(getMot(NB_ID));
	}
	
	public String getNomInterm() {
		return interm[NB_NOM_INT];
	}

	@Override
	public String getNom() {
		return getMot(NB_NOM);
	}

	public String getPrenomInterm() {
		return interm[NB_PRENOM_INT];
	}

	@Override
	public String getPrenom() {
		return getMot(NB_PRENOM);
	}


	@Override
	public int getDateJour() {
		return Integer.parseInt(getMot(NB_DATEJ));
	}
	
	@Override
	public int getDateMois() {
		return Integer.parseInt(getMot(NB_DATEM));
	}
	
	@Override
	public int getDateAnnee() {
		return Integer.parseInt(getMot(NB_DATEA));
	}


	@Override
	public ListePersonnes getPersonnel(ConteneurStr conteneur) {
		ListePersonnes liste = new ListePersonnes();
		
		for (String ligne : conteneur.getDonnees()){
			this.splitLine(ligne);
			//DEBUG afficher();
			liste.ajouter(new Personne(getNom(), getPrenom(), getID(), getDateJour(), getDateMois(), getDateAnnee()));
		}
		
		return liste;
	}

	

}
