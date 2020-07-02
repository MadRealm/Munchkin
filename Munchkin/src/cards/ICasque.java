package cards;

public interface ICasque {
	public default boolean EstEquipable(Casque casque) {
		return true;
	}
}
