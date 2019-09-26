package fr.cesi.filedecrypt.view;

import javax.swing.*;

/**
 * File submission panel class
 */
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

    /**
     * Constructor
     * @param frame
     */
    public FilePanel(FileFrame frame) {
        this.frame = frame;
        fileText = new JLabel("Aucun fichier.");
        chooseButton = new JButton(new OpenFileAction("Choisir un fichier", JFileChooser.FILES_ONLY, this));
        destinationButton = new JButton(new OpenFileAction("Choisir une destination", JFileChooser.DIRECTORIES_ONLY, this));
        submitButton = new JButton("Décrypter");
        submitButton.addActionListener(new DecryptSubmitAction(this));
    }

    /**
     * Build the panel content
     * @return
     */
    public JPanel buildContentPanel() {
        this.getJP().add(fileText);
        this.getJP().add(chooseButton);
        this.getJP().add(destinationButton);
        this.getJP().add(submitButton);

        return this.getJP();
    }

    /**
     * Getter method
     * @return panel instance
     */
    public JPanel getJP() {
        return jp;
    }

    /**
     * Setter method
     * @param jp
     */
    public void setJP(JPanel jp) {
        this.jp = jp;
    }

    /**
     * Getter method
     * @return source path
     */
    public String getSource() {
        return source;
    }

    /**
     * Getter method
     * @return destination path
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Setter method
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Setter method
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Getter method
     * @return frame instance
     */
    public FileFrame getFrame() {
        return frame;
    }
}