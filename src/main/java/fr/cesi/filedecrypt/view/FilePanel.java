package fr.cesi.filedecrypt.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilePanel extends JPanel{

    private static final long serialVersionUID = 1L;

    private JPanel jp = new JPanel();

    private JLabel fileText;
    private JButton chooseButton;
    private JButton submitButton;

    public FilePanel() {
        fileText = new JLabel("Aucun fichier.");
        chooseButton = new JButton(new OpenFileAction("Choisir un fichier"));
        submitButton = new JButton("Valider");
    }

    public JPanel buildContentPanel() {
        this.getJP().add(fileText);
        this.getJP().add(chooseButton);
        this.getJP().add(submitButton);

        return this.getJP();
    }

    public JPanel getJP() {
        return jp;
    }

    public void setJP(JPanel jp) {
        this.jp = jp;
    }
}