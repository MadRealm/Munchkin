package cards;

public class Monstre extends CarteDonjon{
	private int Force;
	private int NbrNiveau;
	private int NbrTresor;
	private String IncidentFacheux;
	private String Description;
	
	public Monstre(String NomCarte,int Force,int NbrNiveau,int NbrTresor,String IncidentFacheux,String Description) {
		super(NomCarte);
		this.Force = Force;
		this.NbrTresor = NbrTresor;
		this.NbrNiveau = NbrNiveau;
		this.IncidentFacheux = IncidentFacheux;
		this.Description = Description;
	}

	public int getForce() {
		return Force;
	}

	public void setForce(int force) {
		Force = force;
	}

	public int getNbrNiveau() {
		return NbrNiveau;
	}

	public void setNbrNiveau(int nbrNiveau) {
		NbrNiveau = nbrNiveau;
	}

	public int getNbrTresor() {
		return NbrTresor;
	}

	public void setNbrTresor(int nbrTresor) {
		NbrTresor = nbrTresor;
	}

	public String getIncidentFacheux() {
		return IncidentFacheux;
	}

	public void setIncidentFacheux(String incidentFacheux) {
		IncidentFacheux = incidentFacheux;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	
	
}
