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
			joueur.setClasse(guerrier);
		}
	}

	public void EquiperVoleur() {
		if(Equipable == true) {
			joueur.setClasse(voleur);
		}
	}

	public void EquiperMagicien() {
		if(Equipable == true) {
			joueur.setClasse(magicien);
		}
	}
	
	public void EquiperPretre() {
		if(Equipable == true) {
			joueur.setClasse(pretre);
		}
	}
		
	public void DesequiperClasse() {
		joueur.setClasse(sans_classe);
	}
		
}






