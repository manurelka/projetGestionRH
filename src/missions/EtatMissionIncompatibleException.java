package missions;

public class EtatMissionIncompatibleException extends Exception {
	public EtatMissionIncompatibleException(){
		super("L'état actuel de la mission ne donne pas accès à cette fonctionnalité.");
	}
}
