package cards;

public class Armure extends CarteTresor implements IArmure {
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private int Bonus;
	
	public Armure (String NomCarte,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,Boolean Gros) {
		super(NomCarte);
		this.Bonus = Bonus;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
	}
	
	public int getValeurEnOr() {
		return ValeurEnOr;
	}

	public void setValeurEnOr(int valeurEnOr) {
		ValeurEnOr = valeurEnOr;
	}

	public String getReserve() {
		return Reserve;
	}

	public void setReserve(String reserve) {
		Reserve = reserve;
	}

	public String getInterdit() {
		return Interdit;
	}

	public void setInterdit(String interdit) {
		Interdit = interdit;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Boolean getGros() {
		return Gros;
	}

	public void setGros(Boolean gros) {
		Gros = gros;
	}

	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	@Override
	public void Equiper(Armure armure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(Armure armure) {
		// TODO Auto-generated method stub
		
	}

	public void Vendre(Armure armure) {
		// TODO Auto-generated method stub

	}
}
