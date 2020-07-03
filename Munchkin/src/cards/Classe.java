package cards;

import presentation.Joueur;

public enum Classe {
    sans_classe(true),
	guerrier(true),
	voleur(true),
	magicien(true),
	prêtre(true);
	
	private boolean Equipable;
	
	Classe classe = Joueur.getClasse();
	
	Classe(boolean Equipable){
		this.Equipable = Equipable;
	}
	
	public boolean EstEquipable() {
		if(Joueur.getClasse() == sans_classe) {
			return true;
		}
	}
}




