package fr.cesi.filedecrypt.view;

import java.awt.FlowLayout;
import java.util.*;

import javax.swing.JFrame;

public class frm_fichier extends JFrame {

    private static final long serialVersionUID = 1L;

    panel_fichier panel_fichier;

    public frm_fichier() {
        super();
        panel_fichier = new panel_fichier();
        buildFrame();
    }

    public void buildFrame() {
        setTitle("Michel le Hacker Grutier");
        setSize(800,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        setContentPane(this.panel_fichier.buildContentPanel());
        setVisible(true);
    }
}

