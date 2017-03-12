package missions;

public enum EtatMissionType {
	EnPreparation("En pr�paration"),
	Planifiee("Planifi�e"),
	EnCours("En cours");
	
	private String str;
	
	private EtatMissionType(String str){
		this.str = str;
	}
	
	public String toString(){
		return this.str;
	}
}
