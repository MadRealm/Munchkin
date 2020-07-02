package cards;

public interface ICasque {
	public default boolean EstEquipable(Casque casque) {
		return true;
	}
	public default boolean EstDeffaussable(Casque casque) {
		return true;
	}
	public void Equiper(Casque casque);
	public void Desequiper(Casque casque);
}
