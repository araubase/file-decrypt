package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.model.DAO;
import fr.cesi.filedecrypt.model.Decrypt;
import fr.cesi.filedecrypt.model.Files;
import fr.cesi.filedecrypt.model.MapDictionnaire;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

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
        DAO dao = new DAO();

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

                        MapDictionnaire map = new MapDictionnaire(result.split(" ")[0]);
                        String rqt = map.selectWord();
                        ResultSet rs = dao.getRows(rqt);

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

        return false;
    }

}
