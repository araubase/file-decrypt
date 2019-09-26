package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.model.CAD;
import fr.cesi.filedecrypt.model.MapPersonne;
import fr.cesi.filedecrypt.view.FileFrame;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Controller class designed to handle authentication process
 */
public class Authenticator implements IController {

    /**
     * Constructor
     */
    public Authenticator() {}

    /**
     * Perform login action
     * Return true if action is successful
     * @param username
     * @param password
     * @return success status
     */
    public boolean login(String username, String password) {
        MapPersonne map = new MapPersonne(username, password);
        String rqt = map.selectIDByLoginAndPassword(); // Construction of the SQL request

        CAD cad = new CAD();
        ResultSet result = cad.getRows(rqt); // Get the results

        boolean authenticated = false; // Success of the process

        try {
            while (result.next()) { // If login and password match with an user
                authenticated = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // If process is successful, launch decryption frame
        if (authenticated) {
            FileFrame view = new FileFrame(new Decryptor());
        }

        return authenticated;
    }

}
