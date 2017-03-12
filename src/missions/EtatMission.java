package missions;

public abstract class EtatMission {
	private EtatMissionType ETAT;
	
	protected EtatMission(EtatMissionType etat){
		this.ETAT = etat;
	}
	
	public String toString(){
		return ETAT.toString();
	}
}
