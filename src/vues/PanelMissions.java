package vues;
import javax.swing.JPanel;

import missions.Mission;
import reader_writer.IHMMissionsAccessor;
import ressources.IModifEcouteur;

public abstract class PanelMissions extends JPanel implements IModifEcouteur{
	protected Mission[] missions;
	
	protected void initMissions(){
		missions = IHMMissionsAccessor.missions_init.getTab();
    }
	
	protected void abonnerModif(){
		IHMMissionsAccessor.addModifEcouteur(this);
    }
    
    protected void ajouter(Mission mission) {
    	IHMMissionsAccessor.missions_init.ajouter(mission);
    }
    
    protected void supprimer(Mission mission){
    	IHMMissionsAccessor.missions_init.supprimer(mission);
    }
    
}
