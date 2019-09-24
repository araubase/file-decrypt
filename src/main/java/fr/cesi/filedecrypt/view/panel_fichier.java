package fr.cesi.filedecrypt.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel_fichier extends JPanel{

    private static final long serialVersionUID = 1L;

    JPanel Jp = new JPanel();

    JLabel fileText;
    JButton chooseButton;
    JButton submitButton;

    public panel_fichier() {
        fileText = new JLabel("Aucun fichier.");
        chooseButton = new JButton(new ouverture_fichier("Choisir un fichier"));
        submitButton = new JButton(new ouverture_fichier("Valider"));
    }

    public JPanel buildContentPanel() {
        Jp.add(fileText);
        Jp.add(chooseButton);
        Jp.add(submitButton);

        return Jp;
    }
}