package ressources;

public abstract class Couple<T, S> implements Comparable{
	private T prem;
	private S sec;
	private final int HASH_CODE = 0;
	
	protected Couple(T prem, S sec){
		this.prem = prem;
		this.sec = sec;
	}
	
	protected T getPrem(){
		return this.prem;
	}
	
	protected S getSec(){
		return this.sec;
	}
	
	protected void setPrem(T obj){
		this.prem = obj;
	}
	
	protected void setSec(S obj){
		this.sec = obj;
	}
	
	@Override
	public boolean equals(Object o){
		boolean rep = false;
		try {
			Couple<T, S> couple = (Couple<T, S>) o;
			rep = this.prem.equals(couple.prem) && this.sec.equals(couple.sec);
		} catch (ClassCastException e) {
			System.out.println(TypeDifferentExceptionMSG.MESSAGE_ERREUR);
			e.printStackTrace();
		}
		return rep;
	}
	
	@Override
	public int hashCode(){
		return HASH_CODE;
	}
	
	public void afficher(){
		System.out.println(prem.toString() + " " + sec.toString());
	}
	
	
	@Override
	public int compareTo(Object o){
		int ret = 0;
		
		Couple couple = (Couple) o;
		if (((Comparable) this.prem).compareTo(couple.prem) > 0) {
			ret = 1;
		} else {
			if (((Comparable) this.prem).compareTo(couple.prem) < 0) {
				ret = -1;
			} else {
				if (((Comparable) this.sec).compareTo(couple.sec) > 0){
					ret = 1;
				} else if (((Comparable) this.sec).compareTo(couple.sec) < 0) {
					ret = -1;
				}
			}
		}
		
		return ret;
	}
}
