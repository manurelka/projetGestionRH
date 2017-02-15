package ressources;
/**
 * Cette classe permet de stocker un couple contenant le domaine et le code d'une comp�tence.
 * Ce couple forme l'identifiant de la comp�tence et on estime que dans une collection de comp�tences
 * on ne peut pas avoir deux comp�tences de m�me identifiant (domaine plus code).
 * 
 * @author Emma, Manuela
 * @version 0.1
 */
public class DCCompetence extends Couple<DomaineCompetences, Integer> {
	public DCCompetence(DomaineCompetences domaine, Integer code){
		super(domaine, code);
	}
	
}
