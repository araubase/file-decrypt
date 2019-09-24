package fr.cesi.filedecrypt.view;

import javax.swing.*;

public class FilePanel extends JPanel{

    private static final long serialVersionUID = 1L;

    private JPanel jp = new JPanel();

    private FileFrame frame;

    private JLabel fileText;
    private JButton chooseButton;
    private JButton destinationButton;
    private JButton submitButton;

    private String source;
    private String destination;

    public FilePanel(FileFrame frame) {
        this.frame = frame;
        fileText = new JLabel("Aucun fichier.");
        chooseButton = new JButton(new OpenFileAction("Choisir un fichier", JFileChooser.FILES_ONLY, this));
        destinationButton = new JButton(new OpenFileAction("Choisir une destination", JFileChooser.DIRECTORIES_ONLY, this));
        submitButton = new JButton("Décrypter");
        submitButton.addActionListener(new DecryptSubmitAction(this));
    }

    public JPanel buildContentPanel() {
        this.getJP().add(fileText);
        this.getJP().add(chooseButton);
        this.getJP().add(destinationButton);
        this.getJP().add(submitButton);

        return this.getJP();
    }

    public JPanel getJP() {
        return jp;
    }

    public void setJP(JPanel jp) {
        this.jp = jp;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public FileFrame getFrame() {
        return frame;
    }
}