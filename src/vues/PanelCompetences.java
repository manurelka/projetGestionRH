package vues;

import javax.swing.JPanel;

import reader_writer.IHMCompetencesAccessor;
import ressources.Competence;
import ressources.DomaineCompetences;
import ressources.IModifEcouteur;

public abstract class PanelCompetences extends JPanel implements IModifEcouteur{
	protected Competence[] competences;
    protected Competence cptCourante;
    
    protected final DomaineCompetences[] DOMAINES = DomaineCompetences.values();
    

    protected void initCompetences(){
    	competences = (Competence[]) IHMCompetencesAccessor.competences_init.getTab();
    }
    
    protected void ecrireCompetences(){
    	IHMCompetencesAccessor.EC.ecrireCompetences(IHMCompetencesAccessor.competences_init);
    }
    
    protected void setCompetences(int code){
    	competences = IHMCompetencesAccessor.competences_init.get(code).getTab();
    }
    
    protected void setCompetences(DomaineCompetences domaine){
        competences = IHMCompetencesAccessor.competences_init.get(domaine).getTab();
    }
    
    protected void setCompetences(String motCle){
    	competences = IHMCompetencesAccessor.competences_init.get(motCle).getTab();
    }
    
    protected void abonnerModif(){
    	IHMCompetencesAccessor.addModifEcouteur(this);
    }
    
    protected void ajouter(Competence cmpt) {
    	IHMCompetencesAccessor.competences_init.ajouter(cmpt);
    }
    
    protected void supprimer(Competence cmpt){
    	IHMCompetencesAccessor.competences_init.supprimer(cmpt);
    }
}
