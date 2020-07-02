package cards;

public class Arme extends Stuff {
	private String NomArme;
	private Integer ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Integer NbrMain;
	private Boolean Gros;

	public Arme (String NomArme,Integer ValeurEnOr,String Reserve,String Interdit,Integer Bonus,String Description,Integer NbrMain,Boolean Gros) {
		super(Bonus);
		this.NomArme = NomArme;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.NbrMain = NbrMain;
		this.Gros = Gros;
	}

	public boolean EstEquipable(String Reserve,String Interdit,String Description,Integer NbrMain,Boolean Gros) {
		
	}
}

