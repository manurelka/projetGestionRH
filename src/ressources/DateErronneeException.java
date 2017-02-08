package ressources;
/*
 * L'exception DateErronneeException est lancé lors de la création d'un objet de type Date
 * dans le cas d'une incohérence entre les paramètres du constructeur
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
