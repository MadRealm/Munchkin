package cards;

public interface IArmure {
	public default boolean EstEquipable(Armure armure) {
		return true;
	}
	public default boolean EstDeffaussable(Armure armure) {
		return true;
	}
	public void Equiper(Armure armure);
	public void Desequiper(Armure armure);
}
