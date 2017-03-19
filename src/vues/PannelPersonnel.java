package vues;

import javax.swing.JPanel;

import reader_writer.IHMCompetencesAccessor;
import reader_writer.IHMPersonnelAccessor;
import ressources.Competence;
import ressources.IModifEcouteur;
import ressources.Personne;

public abstract class PannelPersonnel extends JPanel implements IModifEcouteur{
	protected Personne[] personnes;
	protected Personne persCourantes;
	protected void initPersonnes(){
		personnes = IHMPersonnelAccessor.personnes_init.getTab();
    }
	protected void ajouter(Personne p) {
		IHMPersonnelAccessor.personnes_init.ajouter(p);
    }
	
	
	
	//protected void setCompetences()

}
