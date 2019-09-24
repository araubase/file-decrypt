package fr.cesi.filedecrypt;

import fr.cesi.filedecrypt.view.*;
import fr.cesi.filedecrypt.controller.Controller;
import fr.cesi.filedecrypt.interfaces.IController;

/**
 * Hello world!
 *
 */
public class App {

    /**
     *
     * @param args
     */
    public static void main( String[] args ) {
        IController controller = new Controller(null, null);
        controller.start();
      
        frm_fichier fenetre = new frm_fichier();
    }

}
