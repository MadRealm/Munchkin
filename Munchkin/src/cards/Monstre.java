package cards;

public class Monstre {
	private String Nom;
	private int Force;
	private int NbrNiveau;
	private int NbrTresor;
	private String IncidentFacheux;
	private String Description;
	
	public Monstre(String Nom,int Force,int NbrNiveau,int NbrTresor,String IncidentFacheux,String Description) {
		this.Nom = Nom;
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

	
	
}
