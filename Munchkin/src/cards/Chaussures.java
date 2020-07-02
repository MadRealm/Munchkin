package cards;

public class Chaussures extends CarteTresor implements IChaussures{
	private String NomChaussures;
	private Integer ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private Integer Bonus;
	
	public Chaussures (String NomChaussures,Integer ValeurEnOr,String Reserve,String Interdit,Integer Bonus,String Description,Boolean Gros) {
		this.Bonus = Bonus;
		this.NomChaussures = NomChaussures;
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
