package cards;

public interface IChaussures {
	public default boolean EstEquipable(Chaussures chaussures) {
		return true;
	}
	public default boolean EstDeffaussable(Chaussures chaussures) {
		return true;
	}
	public void Equiper(Chaussures chaussures);
	public void Desequiper(Chaussures chaussures);
}
