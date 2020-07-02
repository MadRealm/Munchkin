package cards;

public class Casque implements ICasque {
	private String NomCasque;
	private Integer ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private Integer Bonus;
	
	public Casque (String NomCasque,Integer ValeurEnOr,String Reserve,String Interdit,Integer Bonus,String Description,Boolean Gros) {
		this.Bonus = Bonus;
		this.NomCasque = NomCasque;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
	}
}
