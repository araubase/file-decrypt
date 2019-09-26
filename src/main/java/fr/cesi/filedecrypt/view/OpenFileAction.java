package fr.cesi.filedecrypt.view;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

/**
 * Action called when file chooser is submitted
 */
public class OpenFileAction extends AbstractAction {

    private int mode;
    private FilePanel panel;

    /**
     * Constructor
     * @param text
     * @param mode
     * @param panel
     */
    public OpenFileAction(String text, int mode, FilePanel panel) {
        super(text);
        this.panel = panel;
        this.mode = mode;
    }

    /**
     * Overrided method called when the action is performed
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(this.mode);

        j.showSaveDialog(null);
        File f = j.getSelectedFile();

        if (mode == JFileChooser.FILES_ONLY) {
            panel.setSource(f.getAbsolutePath());
        } else if (mode == JFileChooser.DIRECTORIES_ONLY) {
            panel.setDestination(f.getAbsolutePath());
        }
    }

    /**
     * Getter method
     * @return panel instance
     */
    public FilePanel getPanel() {
        return panel;
    }
}