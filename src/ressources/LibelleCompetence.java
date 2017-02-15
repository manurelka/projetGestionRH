package ressources;
/**
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
	
	public boolean equals(Object o){
		boolean rep = false;
		
		try{
			LibelleCompetence lib = (LibelleCompetence) o;
			rep = aLibGB(lib.libGB) && aLibFR(lib.libFR);
		} catch (ClassCastException e) {
			System.out.println(TypeDifferentExceptionMSG.MESSAGE_ERREUR);
			e.printStackTrace();
		}
		
		return rep;
	}
	
	public boolean aLibGB(String libGB){
		return this.libGB.equals(libGB);
	}
	
	public boolean aLibFR(String libFR){
		return this.libFR.equals(libFR);
	}
}
