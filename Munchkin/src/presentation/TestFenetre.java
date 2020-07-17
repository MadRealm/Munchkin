package presentation;

import java.awt.Dimension;

public class TestFenetre {
    public static void main(String[] args) {
        FenetrePrincipale f = new FenetrePrincipale();
        //f.setLocation(80, 50);
        //f.pack();
        f.setPreferredSize(new Dimension(400, 300));

        f.setVisible(true);
    }
}



