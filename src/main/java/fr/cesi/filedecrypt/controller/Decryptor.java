package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.model.Decrypt;
import fr.cesi.filedecrypt.model.Files;

public class Decryptor implements IController {

    public Decryptor() {}

    public boolean decrypt(String source, String destination) {
        // File reading using file manager component
        Files files = new Files();
        String encryptedData = "";
        try {
            encryptedData = files.lireFichier(source);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        Decrypt decrypt = new Decrypt();
        String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z"};

        String knownKey = "aaaaaaaa";
        String dynamicPart = "";
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                for (int k = 0; k < alphabet.length; k++) {
                    for (int l = 0; l < alphabet.length; l++) {
                        dynamicPart = alphabet[i] + alphabet[j] + alphabet[k] + alphabet[l];

                        String fullKey = knownKey + dynamicPart;
                        String result = decrypt.decrypt(encryptedData, fullKey);
                        System.out.println(encryptedData + " - " + fullKey + " - " + result + " - " + decrypt.decrypt(result, fullKey));

                        // TODO: Vérifier que le mot est dans le dictionnaire
                    }
                }
            }
        }

        return false;
    }

}
