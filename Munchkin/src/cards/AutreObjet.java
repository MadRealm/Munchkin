package cards;

public class AutreObjet {
	private String NomAutreObjet;
	private Integer ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private Integer Bonus;
	
	public AutreObjet (String NomAutreobjet,Integer ValeurEnOr,String Reserve,String Interdit,Integer Bonus,String Description,Boolean Gros) {
		this.Bonus = Bonus;
		this.NomAutreObjet = NomAutreObjet;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
	}
}
