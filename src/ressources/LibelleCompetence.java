package ressources;
/*
 * La classe LibelleCompetence repésente le libellé d'une compétence en français et en anglais.
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class LibelleCompetence {
	private String libFR;
	private String libGB;
	
	public LibelleCompetence(String libGB, String libFR){
		this.libGB = libGB;
		this.libFR = libFR;
	}
	
	String getLibFR(){
		return this.libFR;
	}
	
	String getLibGB(){
		return this.libGB;
	}
}
