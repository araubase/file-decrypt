package fr.cesi.filedecrypt;

import fr.cesi.filedecrypt.controller.Authenticator;
import fr.cesi.filedecrypt.interfaces.IView;
import fr.cesi.filedecrypt.view.*;
import fr.cesi.filedecrypt.interfaces.IController;

/**
 * Entry class
 */
public class App {

    /**
     * Main method of the application
     * @param args
     */
    public static void main( String[] args ) {
        IController authenticator = new Authenticator(); // Instantiate new Authenticator
        IView frame = new AuthFrame(authenticator); // Launch login form with the authenticator
    }

}
