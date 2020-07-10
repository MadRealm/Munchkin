package presentation;

import java.util.LinkedList;

import cards.Arme;
import cards.Carte;
import cards.Classe;
import cards.Race;
import cards.Malediction;
import cards.Monstre;

public class Joueur {
    private int niveau;
    private int attack;
    private int sex;
    private int argent;
    private String name;
    private LinkedList<Carte> hand;
    private Classe classe;
    private Race race;
    private int classemax;
    private int racemax;
    private int handsizeMax;
    private LinkedList<Carte> equipement;
    private int nbr_armes;
    private int nbr_armesMax;
    private int nbr_chapeau;
    private int nbr_chapeauMax;
    private int nbr_armures;
    private int nbr_armuresMax;
    private int nbr_chaussure;
    private int nbr_chaussuresMax;
    private int nbr_gros;
    private int nbr_grosMax;
    private int fuite;

    public Joueur(String name){
        this.setNiveau(1);
        this.setAttack(1);
        this.setName(name);
        this.setSex(1);
        this.setHand(new LinkedList<Carte>());
        /*for (int i, i < 4, i++) {
            this.hand.add(nextCard("Treasure"))
            this.hand.add(nextCard("Dungeon"))
        }*/
        this.setClasse(Classe.sans_classe);
        this.setRace(Race.humain);
        this.setRacemax(1);
        this.setClassemax(1);
        this.setNbr_armesMax(2);
        this.setHandsizeMax(5);
        this.setNbr_armuresMax(1);
        this.setNbr_chapeauMax(1);
        this.setNbr_chaussuresMax(1);
        this.setNbr_grosMax(1);
        this.setNbr_armures(0);
        this.setNbr_armes(0);
        this.setNbr_chapeau(0);
        this.setNbr_gros(0);
        this.setNbr_chaussure(0);
        this.setFuite(4);
        this.equipement = new LinkedList<Carte>();
        Carte card = new Carte("Meilleure carte"); //Pour éviter d'avoir une liste vide pour la main du joueur
        this.getHand().add(card);
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getArgent() {
        return this.argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Carte> getHand() {
        return this.hand;
    }

    public void setHand(LinkedList<Carte> hand) {
        this.hand = hand;
    }


    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getClassemax() {
        return this.classemax;
    }

    public void setClassemax(int classemax) {
        this.classemax = classemax;
    }

    public int getRacemax() {
        return this.racemax;
    }

    public void setRacemax(int racemax) {
        this.racemax = racemax;
    }

    public int getHandsizeMax() {
        return this.handsizeMax;
    }

    public void setHandsizeMax(int handsizeMax) {
        this.handsizeMax = handsizeMax;
    }

    public LinkedList<Carte> getEquipement() {
        return this.equipement;
    }

    public void setEquipement(LinkedList<Carte> equipement) {
        this.equipement = equipement;
    }

    public int getNbr_armes() {
        return this.nbr_armes;
    }

    public void setNbr_armes(int nbr_armes) {
        this.nbr_armes = nbr_armes;
    }

    public int getNbr_armesMax() {
        return this.nbr_armesMax;
    }

    public void setNbr_armesMax(int nbr_armesMax) {
        this.nbr_armesMax = nbr_armesMax;
    }

    public int getNbr_chapeau() {
        return this.nbr_chapeau;
    }

    public void setNbr_chapeau(int nbr_chapeau) {
        this.nbr_chapeau = nbr_chapeau;
    }

    public int getNbr_chapeauMax() {
        return this.nbr_chapeauMax;
    }

    public void setNbr_chapeauMax(int nbr_chapeauMax) {
        this.nbr_chapeauMax = nbr_chapeauMax;
    }

    public int getNbr_armures() {
        return this.nbr_armures;
    }

    public void setNbr_armures(int nbr_armures) {
        this.nbr_armures = nbr_armures;
    }

    public int getNbr_armuresMax() {
        return this.nbr_armuresMax;
    }

    public void setNbr_armuresMax(int nbr_armuresMax) {
        this.nbr_armuresMax = nbr_armuresMax;
    }

    public int getNbr_chaussure() {
        return this.nbr_chaussure;
    }

    public void setNbr_chaussure(int nbr_chaussure) {
        this.nbr_chaussure = nbr_chaussure;
    }

    public int getNbr_chaussuresMax() {
        return this.nbr_chaussuresMax;
    }

    public void setNbr_chaussuresMax(int nbr_chaussuresMax) {
        this.nbr_chaussuresMax = nbr_chaussuresMax;
    }

    public int getNbr_gros() {
        return this.nbr_gros;
    }

    public void setNbr_gros(int nbr_gros) {
        this.nbr_gros = nbr_gros;
    }

    public int getNbr_grosMax() {
        return this.nbr_grosMax;
    }

    public void setNbr_grosMax(int nbr_grosMax) {
        this.nbr_grosMax = nbr_grosMax;
    }

	public int getFuite() {
		return fuite;
	}

	public void setFuite(int fuite) {
		this.fuite = fuite;
	}
    
    public void Equiper(Arme arme){
        this.equipement.add(arme);
        this.hand.remove(arme);
    }

    public void Desequiper(Arme arme){
        this.equipement.add(arme);
        this.hand.remove(arme);
    }

    public void Vendre(Arme arme){
        Boolean isEquiped = this.getEquipement().contains(arme);
        Boolean isinHand = this.getHand().contains(arme);
        if (isEquiped){
            this.equipement.remove(arme);
        } 
        if (isinHand){
            this.hand.remove(arme)
        } 
        this.setArgent(this.getArgent()+arme.getValeurEnOr());  }
}