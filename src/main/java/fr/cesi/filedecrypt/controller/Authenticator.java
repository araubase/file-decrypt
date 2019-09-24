package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.view.FileFrame;

public class Authenticator implements IController {

    public Authenticator() {}

    public boolean login(String username, String password) {
        FileFrame view = new FileFrame(new Decryptor());

        return true;
    }

}
