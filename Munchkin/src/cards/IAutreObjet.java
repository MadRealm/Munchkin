package cards;

public interface IAutreObjet {
	public default boolean EstEquipable(AutreObjet autreobjet) {
		return true;
	}
}
