package readerwriter;
/**
 * Ce splitter permet de diviser les cha�nes de caract�res par le d�limit�teur ";"
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public abstract class ObjectSplitter extends Splitter {
	private static final String REGEX = ";"; 
	
	protected ObjectSplitter(int nbCases){
		super(nbCases);
	}
	
	@Override
	public String getRegex() {
		return REGEX;
	}

}
