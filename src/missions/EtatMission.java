package missions;

public abstract class EtatMission implements IMission {
	private EtatMissionType ETAT;
	
	protected EtatMission(EtatMissionType etat){
		this.ETAT = etat;
	}
	
	public String toString(){
		return ETAT.toString();
	}
}
