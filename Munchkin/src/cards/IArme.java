package cards;

import presentation.Joueur;

public interface IArme {
	public default boolean EstEquipable(Joueur joueur) {
		return true;
	}
	public default boolean EstDeffaussable() {
		return true;
	}

	public default boolean EstVendable() {
		return true;
	}
	public void Equiper(Joueur joueur);
	public void Desequiper(Joueur joueur);
	public void Vendre(Joueur joueur);
}
