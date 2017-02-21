package reader_writer;
/**
 * Permet de diviser les cha�nes de caract�res par "."
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public abstract class PointSplitter extends Splitter {
	private static final String REGEX = "\\."; 
	
	public PointSplitter(int nbCases){
		super(nbCases);
	}
	
	@Override
	public String getRegex() {
		return REGEX;
	}
}
