package cards;

public class Chaussures extends CarteTresor implements IChaussures{
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private int Bonus;
	
	public Chaussures (String NomCarte,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,Boolean Gros) {
		super(NomCarte);
		this.Bonus = Bonus;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
	}

	@Override
	public void Equiper(Chaussures chaussures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(Chaussures chaussures) {
		// TODO Auto-generated method stub
		
	}
}
