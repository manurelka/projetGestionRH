package missions;

public class EtatMissionIncompatibleException extends Exception {
	public EtatMissionIncompatibleException(){
		super("L'�tat actuel de la mission ne donne pas acc�s � cette fonctionnalit�.");
	}
}
