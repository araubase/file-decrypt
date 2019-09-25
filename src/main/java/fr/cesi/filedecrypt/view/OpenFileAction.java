package fr.cesi.filedecrypt.view;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

public class OpenFileAction extends AbstractAction {

    private int mode;
    private FilePanel panel;

    public OpenFileAction(String text, int mode, FilePanel panel) {
        super(text);
        this.panel = panel;
        this.mode = mode;
    }

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

    public FilePanel getPanel() {
        return panel;
    }
}