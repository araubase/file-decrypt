package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.model.CAD;
import fr.cesi.filedecrypt.model.Decrypt;
import fr.cesi.filedecrypt.model.Files;
import fr.cesi.filedecrypt.model.MapDictionnaire;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Controller class designed to handle decryption process
 */
public class Decryptor implements IController {

    /**
     * Constructor
     */
    public Decryptor() {}

    /**
     * Perform decryption action
     * @param source
     * @param destination
     * @return boolean
     */
    public boolean decrypt(String source, String destination) {
        // File reading using file manager component
        Files files = new Files();
        String encryptedData = "";
        try {
            encryptedData = files.lireFichier(source); // Get the encrypted data
        } catch (Exception ex) {
            System.out.println(ex);
        }

        Decrypt decrypt = new Decrypt();
        String alphabet[] = {"e", "g", "j", "t"}; // Reduced alphabet to speed up process
        CAD cad = new CAD();

        String knownKey = "awqpmndf"; // Known elements of the key

        String dynamicPart = "";
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                for (int k = 0; k < alphabet.length; k++) {
                    for (int l = 0; l < alphabet.length; l++) {
                        dynamicPart = alphabet[i] + alphabet[j] + alphabet[k] + alphabet[l];

                        // For each generated key
                        String fullKey = knownKey + dynamicPart;

                        // We get the decryption result
                        String result = decrypt.decrypt(encryptedData, fullKey);

                        System.out.println(fullKey + " - " + result);

                        if (result.split(" ").length > 2) { // If crypted sentence is longer than 2 words
                            MapDictionnaire map = new MapDictionnaire(result.split(" ")[0].replace(",", ""));
                            String rqt = map.selectWord();
                            ResultSet rs = cad.getRows(rqt);

                            boolean decrypted = false;
                            try {
                                while (rs.next()) { // We check if the first word is in the database
                                    MapDictionnaire map2 = new MapDictionnaire(result.split(" ")[1].replace(",", ""));
                                    String rqt2 = map2.selectWord();
                                    ResultSet rs2 = cad.getRows(rqt2);

                                    while (rs2.next()) { // Then the second word is in the database
                                        MapDictionnaire map3 = new MapDictionnaire(result.split(" ")[2].replace(",", ""));
                                        String rqt3 = map3.selectWord();
                                        ResultSet rs3 = cad.getRows(rqt3);

                                        while (rs3.next()) { // Finally the third one
                                            decrypted = true;
                                        }
                                    }
                                }
                            } catch (SQLException ex) {
                                System.out.println(ex.getMessage());
                            }

                            if (decrypted) { // If three word matches are found
                                try {
                                    // Decrypted file generation
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
