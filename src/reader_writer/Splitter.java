package reader_writer;
/**
 * Diviser les chaînes de caractères représentant des objets par mots représentant des attributs 
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public abstract class Splitter implements ISplitter{
	private String[]  mots;
	
	protected Splitter(int nbCases){
		this.mots = new String[nbCases];
	}
	
	protected Splitter(){
		this.mots = null;
	}
	
	protected String getMot(int index){
		// TODO throw une exception IOB
		return mots[index];
	}
	
	protected int getLength(){
		return mots.length;
	}
	
	protected void setMot(String mot, int nbCase){
		mots[nbCase] = mot;
	}
	
	protected void setMot(String tab[]){
		mots = tab;		
	}
	
	protected void setMots(String[] mots){
		this.mots = mots;
	}
	
	public String toString(){
		String ret = "";
		for(int i = 0; i < mots.length; i++)
			ret += mots[i] + ";";
		return ret;
	}
	
	public void afficher(){
		System.out.println(toString());
	}
}
