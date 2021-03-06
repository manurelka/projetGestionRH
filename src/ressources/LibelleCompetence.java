package ressources;
/**
 * La classe LibelleCompetence rep�sente le libell� d'une comp�tence en fran�ais et en anglais.
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class LibelleCompetence implements Cloneable{
	private String libFR;
	private String libGB;
	
	public LibelleCompetence(String libGB, String libFR){
		this.libGB = libGB.trim();
		this.libFR = libFR.trim();
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
		return this.libGB.equals(libGB.trim());
	}
	
	public boolean aLibFR(String libFR){
		return this.libFR.equals(libFR.trim());
	}

	public boolean aMotCle(String motCle) {
		String[] mots = mots();
		int i = 0;
		while(i < mots.length && !mots[i].toLowerCase().equals(motCle.toLowerCase().trim())){
			i++;
		}
		return !(i == mots.length);
	}
	
	private String concatener(){
		return this.libGB + " " + this.libFR;
	}
	
	private String[] mots(){
		//System.out.println(concatener()); // debug
		return concatener().split(" ");
	}

	public void setLibFR(String libFR) {
		this.libFR = libFR;
	}
	
	public void setLibGB(String libGB) {
		this.libGB = libGB;
	}
	
	public Object clone(){
		LibelleCompetence clone = null;
		try {
			clone = (LibelleCompetence) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
