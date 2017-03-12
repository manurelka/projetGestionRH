package missions;

public enum EtatMissionType {
	EnPreparation("En préparation"),
	Planifiee("Planifiée"),
	EnCours("En cours");
	
	private String str;
	
	private EtatMissionType(String str){
		this.str = str;
	}
	
	public String toString(){
		return this.str;
	}
}
