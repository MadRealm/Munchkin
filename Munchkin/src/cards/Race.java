package cards;

import presentation.Joueur;

public enum Race {
	humain(true),
	elfe(true),
	nain(true),
	halfelin(true),
	orque(true);

	private boolean Equipable;
	private Joueur joueur;
	
	
	Race(boolean Equipable){
		this.Equipable = Equipable;
	}
	
	public boolean EstEquipable() {
		if(joueur.getRace() == humain) {
			Equipable = true;
			
		}
		return true;
	}

	public void EquiperNain() {
		if(Equipable == true) {
			joueur.setRace(nain);
		}
	}

	public void EquiperElfe() {
		if(Equipable == true) {
			joueur.setRace(elfe);
		}
	}

	public void EquiperOrque() {
		if(Equipable == true) {
			joueur.setRace(orque);
		}
	}
	
	public void EquiperHalfelin() {
		if(Equipable == true) {
			joueur.setRace(halfelin);
		}
	}
		
	public void DesequiperRace() {
		joueur.setRace(humain);
	}

}