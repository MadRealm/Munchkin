package cards;

public interface IArme {
	public default boolean EstEquipable(Arme arme) {
		return true;
	}
	public default boolean EstDeffaussable(Arme arme) {
		return true;
	}
	public void Equiper(Arme arme);
	public void Desequiper(Arme arme);
}
