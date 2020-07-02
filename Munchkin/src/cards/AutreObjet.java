package cards;

public class AutreObjet implements IAutreObjet {
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

	@Override
	public void Equiper(AutreObjet autreobjet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(AutreObjet autreobjet) {
		// TODO Auto-generated method stub
		
	}
}
