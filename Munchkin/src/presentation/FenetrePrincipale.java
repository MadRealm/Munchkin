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
    
    public void FenetrePrincipale(){
        this.setTitle("Munckin");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Joueur j1 = new Joueur("Joueur 1");
        Joueur j2 = new Joueur("Joueur 2");
        Joueur j3 = new Joueur("Joueur 3");
        Joueur j4 = new Joueur("Joueur 4");

    }

    public void BuildPannelNorth(){
        JFrame pannel = new JFrame();
        this.add(pannel, BorderLayout.NORTH);
        JFrame inside = new JFrame();
        BoxLayout box = new BoxLayout(inside, BoxLayout.LINE_AXIS);
        inside.setLayout(box);
        pannel.add(inside);
        

    }

}
