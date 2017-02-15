package ressources;
/**
 * La classe Date repr�sente une date.
 * 
 * @author Emma, Manuela
 * @version 0.0
 */
public class Date implements Comparable{
	private int jour;
	private int mois;
	private int annee;
	
	/**
	 * Cr�e un objet Date � partir de trois entiers.
	 * Une exception est lev�e si les entiers pass�s en param�tre ne correspondent pas
	 * aux valeurs possibles pour une date.
	 * 
	 * @param jour Le jour du mois compris entre 1 et le nombre maximum de jours selon le mois (! TODO gestion du mois de f�vrier)
	 * @param mois Le mois compris entre 1 et 12
	 * @param annee Un entier positif
	 */
	public Date(int jour, int mois, int annee) throws DateErronneeException {
		if (annee >= 0) {
			this.annee = annee;
			if (mois < 13 && mois > 0) {
				this.mois = mois;
				if (jour < 32 && jour > 0) {
					switch (jour) {
					case 31:
						if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
							this.mois = mois;
						} else {
							throw new DateErronneeException("Le mois " + mois + ", que vous avez indiqu� n'a pas 31 jours.");
						}
						break;
						
					case 30:
						if (mois != 2) {
							this.mois = mois;
						} else {
							throw new DateErronneeException("Le mois " + mois + ", que vous avez indiqu� n'a pas 31 jours.");
						}						
						break;
					
					default:
						this.jour = jour;						
					}
				} else {
					throw new DateErronneeException("Jour erronn�.");
				}
			} else {
				throw new DateErronneeException("Mois erronn�.");
			}
		} else {
			throw new DateErronneeException("Ann�e erronn�.");
		}
	}
	
	/**
	 * Retourne la date sous la forme suivante :
	 * "jour/mois/ann�e"
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return jour + "/" + mois + "/" + annee;
	}

	public int getAnnee() {
		return annee;
	}
	
	/**
	 * Deux dates sont �gales si elles repr�sentent le m�me jour du m�me mois de la m�me ann�e.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o){
		boolean rep = false;
		Date d;
		
		if (o.getClass().equals(this.getClass())) {
			d = (Date) o;
			if (d.annee == this.annee && d.mois == this.mois && d.jour == this.jour) {
				rep = true;
			}
		}
		
		return rep;
	}

	@Override
	public int compareTo(Object obj) {
		int rep = -3;
		Date d;
		
		if (obj.getClass().equals(this.getClass())) {
			rep = -2;
			d = (Date) obj;
			
			if (d.annee < this.annee) {
				rep = -1;
			} else if (d.annee == this.annee){
				if (d.mois < this.mois) {
					rep = -1;
				} else if (d.mois == this.mois){
					if (d.jour < this.jour) {
						rep = -1;
					} else if (d.jour == this.jour){
						rep = 0;
					} else {
						rep = 1;
					}
				} else {
					rep = 1;
				}
			} else {
				rep = 1;
			}
		}
		
		return rep;
	}
}
