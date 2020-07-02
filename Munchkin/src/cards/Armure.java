package cards;

public class Armure extends CarteTresor implements IArmure {
	private String NomArmure;
	private Integer ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private Integer Bonus;
	
	public Armure (String NomArmure,Integer ValeurEnOr,String Reserve,String Interdit,Integer Bonus,String Description,Boolean Gros) {
		this.Bonus = Bonus;
		this.NomArmure = NomArmure;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
	}

	@Override
	public void Equiper(Armure armure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(Armure armure) {
		// TODO Auto-generated method stub
		
	}
}
