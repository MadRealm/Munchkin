package cards;

import presentation.Joueur;

public enum Classe {
    sans_classe(true),
	guerrier(true),
	voleur(true),
	magicien(true),
	pretre(true);
	
	private boolean Equipable;
	private Joueur joueur;
	
	
	Classe(boolean Equipable){
		this.Equipable = Equipable;
}
	
	public boolean EstEquipable() {
		if(joueur.getClasse() == sans_classe) {
			Equipable = true;
			
		}
		return true;
	}

	public void EquiperGuerrier() {
		if(Equipable == true) {
			joueur.setClasse(Classe.guerrier);
		}
	}

	public void EquiperVoleur() {
		if(Equipable == true) {
			joueur.setClasse(Classe.voleur);
		}
	}

	public void EquiperMagicien() {
		if(Equipable == true) {
			joueur.setClasse(Classe.magicien);
		}
	}
	
	public void EquiperPretre() {
		if(Equipable == true) {
			joueur.setClasse(Classe.pretre);
		}
	}
		
	public void DesequiperClasse() {
		joueur.setClasse(Classe.sans_classe);
	}
}




