package cards;

public class Casque extends CarteTresor implements ICasque {
	private String NomCasque;
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private int Bonus;
	
	public Casque (String NomCasque,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,Boolean Gros) {
		this.Bonus = Bonus;
		this.NomCasque = NomCasque;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
	}

	@Override
	public void Equiper(Casque casque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(Casque casque) {
		// TODO Auto-generated method stub
		
	}
}
