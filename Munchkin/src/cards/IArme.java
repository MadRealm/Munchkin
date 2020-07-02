package cards;

public interface IArme {
	public default boolean EstEquipable(Arme arme) {
		return true;
	}
}
