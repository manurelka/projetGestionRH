package ressources;

public interface IListeModifiable {
	public abstract void modifContenu(ModifType type);
	public void addModifEcouteur(IModifEcouteur e);
	public void removeModifEcouteur(IModifEcouteur e);
}
