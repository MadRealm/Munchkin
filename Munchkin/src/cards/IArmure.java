package cards;

public interface IArmure {
	public default boolean EstEquipable(Armure armure) {
		return true;
	}
}
