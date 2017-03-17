package reader_writer;
/**
 * Ce splitter permet de diviser les chaînes de caractères par le délimitéteur ";"
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public abstract class ObjectSplitter extends Splitter {
	private static final String REGEX = ";"; 
	
	protected ObjectSplitter(int nbCases){
		super(nbCases);
	}
	
	protected ObjectSplitter(){
		super();
	}
	
	@Override
	public String getRegex() {
		return REGEX;
	}

}
