package cards;

public class Malediction extends CarteDonjon{
	private String Description;
	
	public Malediction(String Description,String NomCarte) {
		super(NomCarte);
		this.Description = Description;
	}
}
