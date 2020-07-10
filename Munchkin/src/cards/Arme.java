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

	public void Equiper(Joueur joueur){
		if (this.EstEquipable(joueur)){
			joueur.Equiper(this);
		}	
	}

	public void Desequiper(Joueur joueur) {
		if (this.EstDeffaussable()){
			joueur.Desequiper(this);
		}
	}
	public void Vendre(Joueur joueur) {
		
	}
}
