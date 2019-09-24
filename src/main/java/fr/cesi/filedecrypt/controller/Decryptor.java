package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;

public class Decryptor implements IController {

    public Decryptor() {}

    public boolean decrypt(String source, String destination) {
        System.out.println(source + " ||||| " + destination);
        return false;
    }

}
