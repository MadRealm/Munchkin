package cards;

public interface IAutreObjet {
	public default boolean EstEquipable(AutreObjet autreobjet) {
		return true;
	}
	public default boolean EstDeffaussable(AutreObjet autreobjet) {
		return true;
	}
	public void Equiper(AutreObjet autreobjet);
	public void Desequiper(AutreObjet autreobjet);
}
