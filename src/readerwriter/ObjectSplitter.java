package readerwriter;
/*
 * Diviser les chaînes de caractères par ";"
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
