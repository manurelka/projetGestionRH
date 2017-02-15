package ressources;
/**
 * L'énumération DomaineCompetences permet de lister les différents domaines de compétences.
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public enum DomaineCompetences {
	A ("A"),
	B ("B"),
	C ("C"),
	D ("D"),
	E ("E"),
	UNDEFINED ("non défini");
	
	private String str; // La chaîne de caractères correspondant audomine de compétences
	
	private DomaineCompetences(String str){
		this.str = str;
	}
	
	public String getStr(){
		return this.str;
	}
	
	public static DomaineCompetences parseDomaine (String str){
		switch (str){
		case "A" : return DomaineCompetences.A;
		case "B" : return DomaineCompetences.B;
		case "C" : return DomaineCompetences.C;
		case "D" : return DomaineCompetences.D;
		case "E" : return DomaineCompetences.E;
		default : return DomaineCompetences.UNDEFINED;
		}
	}
}
