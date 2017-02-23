package ressources;
import java.util.Map;
import java.util.TreeMap;
/**
 * Cette classe permet de stocker un couple contenant le domaine et le code d'une compétence.
 * Ce couple forme l'identifiant de la compétence et on estime que dans une collection de compétences
 * on ne peut pas avoir deux compétences de même identifiant (domaine plus code).
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class DCCompetence extends Couple<DomaineCompetences, Integer> {
	private static Map<DomaineCompetences, Integer> derniersCodes = new TreeMap<DomaineCompetences, Integer>();
	
	public DCCompetence(DomaineCompetences domaine, Integer code){
		super(domaine, code);
		
		if(!derniersCodes.containsKey(domaine) || (derniersCodes.containsKey(domaine) && code > derniersCodes.get(domaine))){
			derniersCodes.put(domaine, code);
		}
	}
	
	public String toString(){
		return getPrem() + "." + this.getSec() + ".";
	}
	
	public boolean aDomaine(Object domaine){
		return this.getPrem().equals(domaine);
	}
	
	public boolean aCode(Object code){
		return this.getSec().equals(code);
	}
	
	public static int nextCode(DomaineCompetences domaine){
		return derniersCodes.get(domaine).intValue() + 1;
	}
}
