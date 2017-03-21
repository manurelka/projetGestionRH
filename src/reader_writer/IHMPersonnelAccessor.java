package reader_writer;

import ressources.IModifEcouteur;
import ressources.ListePersonnes;

public interface IHMPersonnelAccessor {
	public static final LecteurPersonnel LP = LecteurPersonnel.Instance();
	//TODO public static final EcriteurPersonnel EP = EcriteurPersonnel.Instance();
	public static ListePersonnes personnes_init = LP.lirePersonnel();
	LecteurPersCmp LPC = LecteurPersCmp.Instance();
	
	public static void lireCompetences(){
		LPC.lirePersCmp();
	}
	
	public static void addModifEcouteur(IModifEcouteur e){
		personnes_init.addModifEcouteur(e);
	}
}
