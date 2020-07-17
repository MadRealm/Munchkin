package cards;

import presentation.Joueur;

public interface IAutreObjet {
	
	public void Equiper(Joueur joueur);
	
	public void Desequiper(Joueur joueur);
	
	public void Defausser(Joueur joueur);
	
	public void Vendre(Joueur joueur);
}
