package ressources;
/*
 * L'exception DateErronneeException est lanc� lors de la cr�ation d'un objet de type Date
 * dans le cas d'une incoh�rence entre les param�tres du constructeur
 * et les valeurs possibles pour une date.
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class DateErronneeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public DateErronneeException(String message){
		super(message);
	}
}
