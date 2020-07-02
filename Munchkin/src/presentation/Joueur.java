package presentation;
import java.util.LinkedList;

import cards.Classe;
import cards.Race;
import cards.Malediction;
import cards.Monstre;

public class Joueur {
    private int handsize;
    private Classe classe;
    private Race race;
    private int classemax;
    private int racemax;
    private int handsizeMax;
    private LinkedList<Object> equipement;
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

    public int getHandsize() {
        return this.handsize;
    }

    public void setHandsize(int handsize) {
        this.handsize = handsize;
    }

    public Classe getClasse() {
        return this.classe;
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

    public LinkedList<Object> getEquipement() {
        return this.equipement;
    }

    public void setEquipement(LinkedList<Object> equipement) {
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

}