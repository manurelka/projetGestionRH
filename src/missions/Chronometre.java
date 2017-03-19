package missions;
import ressources.Calendrier;

public class Chronometre extends Thread {
	ListeMissions missions;
	
	public Chronometre(ListeMissions missions){
		this.missions = missions;
	}
	
	public void run(){
		while (true) {
			missions.majTemps();
			
			try {
				sleep(Calendrier.J);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
