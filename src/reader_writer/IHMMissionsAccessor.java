package reader_writer;

import missions.ListeMissions;
import ressources.IModifEcouteur;
import ressources.ListePersonnes;

public interface IHMMissionsAccessor {
	//public static final LecteurMissions LM = LecteurMissions.Instance();
	//TODO public static final EcriteurMissions EM = EcriteurMissions.Instance();
	//public static ListeMissions missions_init = LM.lireMissions();
	public static ListeMissions missions_init = new ListeMissions();
	public static void addModifEcouteur(IModifEcouteur e){
		missions_init.addModifEcouteur(e);
	}
}
