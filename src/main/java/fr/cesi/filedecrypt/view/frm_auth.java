package fr.cesi.filedecrypt.view;

import javax.swing.JFrame;
import java.awt.*;


public class frm_auth extends JFrame {
    public static void fenetreG() {
        JFrame frame = new JFrame("Hacker Grutier");
        //frame.getContentPanel().add(emptyLabel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(800,500);
    }

    public frm_auth() {
        super();
        fenetreG();
    }
}
