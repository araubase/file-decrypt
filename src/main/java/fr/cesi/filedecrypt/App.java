package fr.cesi.filedecrypt;

import fr.cesi.filedecrypt.interfaces.IView;
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
        IView frame = new AuthFrame();
        IController controller = new Controller(null, frame);
        controller.start();
    }

}
