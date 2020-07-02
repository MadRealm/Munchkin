package cards;

public class Arme implements IArme {
	private String NomArme;
	private Integer ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Integer NbrMain;
	private Boolean Gros;
	private Integer Bonus;

	public Arme (String NomArme,Integer ValeurEnOr,String Reserve,String Interdit,Integer Bonus,String Description,Integer NbrMain,Boolean Gros) {
		this.Bonus = Bonus;
		this.NomArme = NomArme;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.NbrMain = NbrMain;
		this.Gros = Gros;
	}

	@Override
	public void Equiper(Arme arme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(Arme arme) {
		// TODO Auto-generated method stub
		
	}

}
