package ressources;
/**
 * Cette classe permet de stocker un couple contenant le domaine et le code d'une compétence.
 * Ce couple forme l'identifiant de la compétence et on estime que dans une collection de compétences
 * on ne peut pas avoir deux compétences de même identifiant (domaine plus code).
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class DCCompetence extends Couple<DomaineCompetences, Integer> {
	public DCCompetence(DomaineCompetences domaine, Integer code){
		super(domaine, code);
	}
	
}
