package cards;

public class Arme implements IArme {
	private String NomArme;
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private int NbrMain;
	private Boolean Gros;
	private int Bonus;

	public Arme (String NomArme,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,int NbrMain,Boolean Gros) {
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
