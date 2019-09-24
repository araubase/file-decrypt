package fr.cesi.filedecrypt.view;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

public class ouverture_fichier extends AbstractAction {

    public ouverture_fichier(String text) {
        super(text);
    }

    public void actionPerformed(ActionEvent e) {
        /*
         * Research the file which must be decrypt.
         */

        System.out.println("openFolder");

        // Using this process to invoke the contructor,
        // JFileChooser points to user's default directory
        JFileChooser j = new JFileChooser();

        // Open the save dialog
        j.showSaveDialog(null);

    }

}