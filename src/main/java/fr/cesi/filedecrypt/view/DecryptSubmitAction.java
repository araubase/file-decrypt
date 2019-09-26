package fr.cesi.filedecrypt.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Action called when user submit files to decryption
 */
public class DecryptSubmitAction implements ActionListener {

    private FilePanel filePanel;

    /**
     * Constructor
     * @param panel
     */
    public DecryptSubmitAction(FilePanel panel) {
        this.filePanel = panel;
    }

    /**
     * Overrided method called when the action is performed
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        filePanel.getFrame().getController().decrypt(filePanel.getSource(), filePanel.getDestination());
    }

    /**
     * Getter method
     * @return panel instance
     */
    public FilePanel getFilePanel() {
        return filePanel;
    }
}
