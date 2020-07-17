package cards;
import presentation.Joueur;

public class Armure extends CarteTresor implements IArmure {
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private Boolean Gros;
	private int Bonus;
	private boolean EstEquipable;
	private boolean EstDeffaussable;
	private boolean Estdesequipable;
	private boolean EstVendable;
	
	public Armure (String NomCarte,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,Boolean Gros) {
		super(NomCarte);
		this.Bonus = Bonus;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.Gros = Gros;
		this.EstDeffaussable = true;
		this.EstEquipable = true;
		this.EstVendable = true;
		this.Estdesequipable = true;
		
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

	public void Equiper(Joueur joueur){
		if (this.EstEquipable){
			joueur.Equiper(this);
		}	
	}

	public void Desequiper(Joueur joueur) {
		if (this.Estdesequipable){
			joueur.Desequiper(this);
		}
	}
	public void Vendre(Joueur joueur) {
		if (this.EstVendable){
			joueur.Vendre(this);
		}
	}
	public void Defausser(Joueur joueur){
		if (this.EstDeffaussable){
			joueur.Defausser(this);
		}
	}
}
