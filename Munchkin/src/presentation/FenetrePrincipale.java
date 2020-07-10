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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class FenetrePrincipale extends JFrame{
    
    public FenetrePrincipale(){
        this.setTitle("Munckin");
        BorderLayout plateau = new BorderLayout();
        this.setLayout(plateau);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Joueur j1 = new Joueur("Joueur 1");
        Joueur j2 = new Joueur("Joueur 2");
        Joueur j3 = new Joueur("Joueur 3");
        Joueur j4 = new Joueur("Joueur 4");
        this.BuildPanelNorth(j1);
        this.BuildPanelEast(j2);
        this.BuildPanelSouth(j3);
        this.BuildPanelWest(j4);

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
    }
}