package cards;

import presentation.Joueur;

public class Arme extends CarteTresor implements IArme {
	private int ValeurEnOr;
	private String Reserve;
	private String Interdit;
	private String Description;
	private int NbrMain;
	private Boolean Gros;
	private int Bonus;
	private boolean EstEquipable;
	private boolean EstDeffaussable;
	private boolean Estdesequipable;
	private boolean EstVendable;

	public boolean isEstEquipable() {
		return this.EstEquipable;
	}

	public void setEstEquipable(boolean EstEquipable) {
		this.EstEquipable = EstEquipable;
	}

	public boolean isEstDeffaussable() {
		return this.EstDeffaussable;
	}

	public void setEstDeffaussable(boolean EstDeffaussable) {
		this.EstDeffaussable = EstDeffaussable;
	}

	public boolean isEstdesequipable() {
		return this.Estdesequipable;
	}

	public void setEstdesequipable(boolean Estdesequipable) {
		this.Estdesequipable = Estdesequipable;
	}

	public boolean isEstVendable() {
		return this.EstVendable;
	}

	public void setEstVendable(boolean EstVendable) {
		this.EstVendable = EstVendable;
	}

	public Arme (String NomCarte,int ValeurEnOr,String Reserve,String Interdit,int Bonus,String Description,int NbrMain,Boolean Gros) {
		super(NomCarte);
		this.Bonus = Bonus;
		this.ValeurEnOr = ValeurEnOr;
		this.Reserve = Reserve;
		this.Interdit = Interdit;
		this.Description = Description;
		this.NbrMain = NbrMain;
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

	
