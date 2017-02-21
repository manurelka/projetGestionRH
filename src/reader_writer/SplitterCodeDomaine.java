package reader_writer;

import java.util.regex.Pattern;
/**
 * Utiliser cette classe pour séparer le domaine et le code d'une compétence.
 * L'état initial du string étant "Domaine.Code. ", le but est d'avoir
 * un dmaine et un code séparés.
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class SplitterCodeDomaine extends PointSplitter implements ISplitterCodeDomaine{
	private static final int NB_CASES = 3;
	private static final int NB_DOMAINE = 0;
	private static final int NB_CODE = 1;
	
	public SplitterCodeDomaine(){
		super(NB_CASES);
	}
	
	@Override
	public void splitLine(String line) {
		setMots(line.split(getRegex()));
	}

	@Override
	public String getDomaine() {
		return getMot(NB_DOMAINE);
	}

	@Override
	public String getCode() {
		return getMot(NB_CODE);
	}

}
