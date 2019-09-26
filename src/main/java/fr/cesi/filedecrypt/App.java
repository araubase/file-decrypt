package fr.cesi.filedecrypt;

import fr.cesi.filedecrypt.controller.Authenticator;
import fr.cesi.filedecrypt.interfaces.IView;
import fr.cesi.filedecrypt.model.Decrypt;
import fr.cesi.filedecrypt.model.Files;
import fr.cesi.filedecrypt.view.*;
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
        IController authenticator = new Authenticator();
        IView frame = new AuthFrame(authenticator);
    }

}
