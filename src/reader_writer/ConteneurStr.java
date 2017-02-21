package reader_writer;
/**
 * Permet de contenir les lignes d'un fichier csv en lecture, sous forme de chaînes de caractères
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class ConteneurStr extends Conteneur<String> implements IConteneurStr{
	public ConteneurStr(){
		super();
	}

	@Override
	public void addLine(String donnee) {
		add(donnee);
	}

}
