package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.model.DAO;
import fr.cesi.filedecrypt.model.MapPersonne;
import fr.cesi.filedecrypt.view.FileFrame;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Authenticator implements IController {

    public Authenticator() {}

    public boolean login(String username, String password) {
        MapPersonne map = new MapPersonne(username, password);
        String rqt = map.selectIDByLoginAndPassword();

        DAO dao = new DAO();
        ResultSet result = dao.getRows(rqt);

        boolean authenticated = false;
        try {
            while (result.next()) {
                authenticated = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        if (authenticated) {
            FileFrame view = new FileFrame(new Decryptor());
        }

        return authenticated;
    }

}
