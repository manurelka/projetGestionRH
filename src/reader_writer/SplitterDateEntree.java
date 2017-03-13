package reader_writer;

public class SplitterDateEntree extends SlashSplitter implements ISplitterDateEntree{
	private static final int NB_CASES = 3;
	private static final int NB_DATEJ = 0;
	private static final int NB_DATEM = 1;
	private static final int NB_DATEA = 2;
	
	public SplitterDateEntree(){
		super(NB_CASES);
	}
	
	@Override
	public void splitLine(String line) {
		setMots(line.split(getRegex()));
	}

	@Override
	public String getDateJour() {
		return getMot(NB_DATEJ);
	}

	@Override
	public String getDateMois() {
		return getMot(NB_DATEM);
	}

	@Override
	public String getDateAnnee() {
		return getMot(NB_DATEA);
	}


}
