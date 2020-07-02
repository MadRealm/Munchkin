package cards;

public class Monstre {
	private String Nom;
	private Integer Force;
	private Integer NbrNiveau;
	private Integer NbrTresor;
	private String IncidentFacheux;
	private String Description;
	
	public Monstre(String Nom,Integer Force,Integer NbrNiveau,Integer NbrTresor,String IncidentFacheux,String Description) {
		this.Nom = Nom;
		this.Force = Force;
		this.NbrTresor = NbrTresor;
		this.NbrNiveau = NbrNiveau;
		this.IncidentFacheux = IncidentFacheux;
		this.Description = Description;
	}

	public Integer getForce() {
		return Force;
	}

	public void setForce(Integer force) {
		Force = force;
	}

	public Integer getNbrNiveau() {
		return NbrNiveau;
	}

	public void setNbrNiveau(Integer nbrNiveau) {
		NbrNiveau = nbrNiveau;
	}

	public Integer getNbrTresor() {
		return NbrTresor;
	}

	public void setNbrTresor(Integer nbrTresor) {
		NbrTresor = nbrTresor;
	}

	
	
}
