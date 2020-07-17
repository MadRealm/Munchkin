package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import cards.Carte;

public class FenetrePrincipale extends JFrame{
    
    private Joueur j1;
    private Joueur j2;
    private Joueur j3;
    private Joueur j4;
    private JList<Carte> def_tresor;
    private JList<Carte> def_donjon;
    private LinkedList<Carte> pioche_tresor;
    private LinkedList<Carte> pioche_donjon;

    public Joueur getJ1() {
        return this.j1;
    }

    public void setJ1(Joueur j1) {
        this.j1 = j1;
    }

    public Joueur getJ2() {
        return this.j2;
    }

    public void setJ2(Joueur j2) {
        this.j2 = j2;
    }

    public Joueur getJ3() {
        return this.j3;
    }

    public void setJ3(Joueur j3) {
        this.j3 = j3;
    }

    public Joueur getJ4() {
        return this.j4;
    }

    public void setJ4(Joueur j4) {
        this.j4 = j4;
    }

    public JList<Carte> getDef_tresor() {
        return this.def_tresor;
    }

    public void setDef_tresor(JList<Carte> def_tresor) {
        this.def_tresor = def_tresor;
    }

    public JList<Carte> getDef_donjon() {
        return this.def_donjon;
    }

    public void setDef_donjon(JList<Carte> def_donjon) {
        this.def_donjon = def_donjon;
    }
    
    public LinkedList<Carte> getPioche_tresor() {
        return this.pioche_tresor;
    }

    public void setPioche_tresor(LinkedList<Carte> pioche_tresor) {
        this.pioche_tresor = pioche_tresor;
    }

    public LinkedList<Carte> getPioche_donjon() {
        return this.pioche_donjon;
    }

    public void setPioche_donjon(LinkedList<Carte> pioche_donjon) {
        this.pioche_donjon = pioche_donjon;
    }

    public FenetrePrincipale(){
        this.setTitle("Munckin");
        BorderLayout plateau = new BorderLayout();
        this.setLayout(plateau);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.j1 = new Joueur("Joueur 1");
        this.j2 = new Joueur("Joueur 2");
        this.j3 = new Joueur("Joueur 3");
        this.j4 = new Joueur("Joueur 4");
        this.def_donjon = new JList<Carte>();
        this.def_tresor = new JList<Carte>();
        this.pioche_donjon = new LinkedList<Carte>();
        this.pioche_tresor = new LinkedList<Carte>();
        this.BuildPanelCenter();
        this.BuildPanelNorth(j1);
        this.BuildPanelEast(j2);
        this.BuildPanelSouth(j3);
        this.BuildPanelWest(j4);

    }
    public void BuildPanelCenter(){
        JPanel Panel = new JPanel();
        JPanel inside = new JPanel();
        Panel.add(inside);
        this.add(Panel, BorderLayout.CENTER);
        JPanel d1 = new JPanel();
        BoxLayout box1 = new BoxLayout(d1, BoxLayout.LINE_AXIS);
        d1.setLayout(box1);
        JPanel d2 = new JPanel();
        BoxLayout box2 = new BoxLayout(d2, BoxLayout.LINE_AXIS);
        d2.setLayout(box2);
        JPanel d3 = new JPanel();
        BoxLayout box3 = new BoxLayout(d3, BoxLayout.LINE_AXIS);
        d3.setLayout(box3);
        JPanel d4 = new JPanel();
        BoxLayout box4 = new BoxLayout(d4, BoxLayout.LINE_AXIS);
        d4.setLayout(box4);
        d1.add(new JLabel("Défausse Donjon"));
        d2.add(new JLabel("Pioche Donjon"));
        d3.add(new JLabel("Pioche Trésor"));
        d4.add(new JLabel("Défuasse Trésor"));
        inside.add(d1);
        inside.add(d2);
        inside.add(d3);
        inside.add(d4);
        d1.setBorder(BorderFactory.createLineBorder(Color.black));
        d2.setBorder(BorderFactory.createLineBorder(Color.black));
        d3.setBorder(BorderFactory.createLineBorder(Color.black));
        d4.setBorder(BorderFactory.createLineBorder(Color.black));

    
    }


    public void BuildPanelNorth(Joueur j){
        JPanel Panel = new JPanel();
        this.add(Panel, BorderLayout.NORTH);
        JPanel inside = new JPanel();
        BorderLayout bord_north = new BorderLayout();
        inside.setLayout(bord_north);
        JButton stuff_button = new JButton("Show stuff");
        JButton end_turn_button = new JButton("end_turn_button");
        JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel_main.setAlignmentX(0.5f);
        inside.add(stuff_button, BorderLayout.NORTH);
        inside.add(end_turn_button, BorderLayout.EAST);
        inside.add(panel_main, BorderLayout.CENTER);
        for (int i = 0; i<j.getHand().size(); i++){
            String nom_carte = j.getHand().get(i).getNomCarte();
            panel_main.add(new JLabel(nom_carte));
        }
        Panel.add(inside);
        Panel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }     
    public void BuildPanelWest(Joueur j){
        JPanel Panel = new JPanel();
        this.add(Panel, BorderLayout.WEST);
        JPanel inside = new JPanel();
        BorderLayout bord_north = new BorderLayout();
        inside.setLayout(bord_north);
        JButton stuff_button = new JButton("Show stuff");
        JButton end_turn_button = new JButton("end_turn_button");
        JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel_main.setAlignmentX(0.5f);
        inside.add(stuff_button, BorderLayout.NORTH);
        inside.add(end_turn_button, BorderLayout.EAST);
        inside.add(panel_main, BorderLayout.CENTER);
        for (int i = 0; i<j.getHand().size(); i++){
            String nom_carte = j.getHand().get(i).getNomCarte();
            panel_main.add(new JLabel(nom_carte));
        }
        Panel.add(inside);
        Panel.setBorder(BorderFactory.createLineBorder(Color.GREEN));

    }

    public void BuildPanelSouth(Joueur j){
        JPanel Panel = new JPanel();
        this.add(Panel, BorderLayout.SOUTH);
        JPanel inside = new JPanel();
        BorderLayout bord_north = new BorderLayout();
        inside.setLayout(bord_north);
        JButton stuff_button = new JButton("Show stuff");
        JButton end_turn_button = new JButton("end_turn_button");
        JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel_main.setAlignmentX(0.5f);
        inside.add(stuff_button, BorderLayout.NORTH);
        inside.add(end_turn_button, BorderLayout.EAST);
        inside.add(panel_main, BorderLayout.CENTER);
        for (int i = 0; i<j.getHand().size(); i++){
            String nom_carte = j.getHand().get(i).getNomCarte();
            panel_main.add(new JLabel(nom_carte));
        }
        Panel.add(inside);
        Panel.setBorder(BorderFactory.createLineBorder(Color.RED));

    }

    public void BuildPanelEast(Joueur j){
        JPanel Panel = new JPanel();
        this.add(Panel, BorderLayout.EAST);
        JPanel inside = new JPanel();
        BorderLayout bord_north = new BorderLayout();
        inside.setLayout(bord_north);
        JButton stuff_button = new JButton("Show stuff");
        JButton end_turn_button = new JButton("end_turn_button");
        JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel_main.setAlignmentX(0.5f);
        inside.add(stuff_button, BorderLayout.NORTH);
        inside.add(end_turn_button, BorderLayout.EAST);
        inside.add(panel_main, BorderLayout.CENTER);
        for (int i = 0; i<j.getHand().size(); i++){
            String nom_carte = j.getHand().get(i).getNomCarte();
            panel_main.add(new JLabel(nom_carte));
        }
        Panel.add(inside);
        Panel.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

    }
}