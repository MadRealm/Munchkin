package cards;

public interface IChaussures {
	public default boolean EstEquipable(Chaussures chaussures) {
		return true;
	}
}
