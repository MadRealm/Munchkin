package cards;

public class Arme extends CarteTresor implements IArme {
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private int NbrMain;
	private Boolean Gros;
	private int Bonus;

	public Arme (String NomCarte,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,int NbrMain,Boolean Gros) {
		super(NomCarte);
		this.Bonus = Bonus;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.NbrMain = NbrMain;
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



	public int getNbrMain() {
		return NbrMain;
	}



	public void setNbrMain(int nbrMain) {
		NbrMain = nbrMain;
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
	public void Equiper(Arme arme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Desequiper(Arme arme) {
		// TODO Auto-generated method stub
		
	}

}
