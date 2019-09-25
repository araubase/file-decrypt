package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.model.CAD;
import fr.cesi.filedecrypt.model.Decrypt;
import fr.cesi.filedecrypt.model.Files;
import fr.cesi.filedecrypt.model.MapDictionnaire;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        CAD cad = new CAD();

        String knownKey = "aaaabbbb";
        String dynamicPart = "";
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                for (int k = 0; k < alphabet.length; k++) {
                    for (int l = 0; l < alphabet.length; l++) {
                        dynamicPart = alphabet[i] + alphabet[j] + alphabet[k] + alphabet[l];

                        String fullKey = knownKey + dynamicPart;
                        String result = decrypt.decrypt(encryptedData, fullKey);

                        System.out.println(encryptedData + " - " + fullKey + " - " + result);

                        if (result.split(" ").length > 2) {
                            MapDictionnaire map = new MapDictionnaire(result.split(" ")[2]);
                            String rqt = map.selectWord();
                            ResultSet rs = cad.getRows(rqt);

                            boolean decrypted = false;
                            try {
                                while (rs.next()) {
                                    decrypted = true;
                                }
                            } catch (SQLException ex) {
                                System.out.println(ex.getMessage());
                            }

                            if (decrypted) {
                                try {
                                    files.ecrireFichier(destination + "\\decrypted.txt", result);
                                } catch (IOException ex) {
                                    System.out.println(ex.getMessage());
                                }
                                System.exit(1);
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

}
