package fr.cesi.filedecrypt.view;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

public class OpenFileAction extends AbstractAction {

    public OpenFileAction(String text) {
        super(text);
    }

    public void actionPerformed(ActionEvent e) {
        /*
         * Research the file which must be decrypt.
         */

        // Using this process to invoke the contructor,
        // JFileChooser points to user's default directory
        JFileChooser j = new JFileChooser();

        // Open the save dialog
        j.showSaveDialog(null);
        File f = j.getSelectedFile();
    }

}