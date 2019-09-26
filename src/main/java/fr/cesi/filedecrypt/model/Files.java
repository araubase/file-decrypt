package fr.cesi.filedecrypt.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Model class that will perform file writing and reading
 */
public class Files {

    /**
     * Constructor
     */
	public Files() {}

    /**
     * Read a file
     * @param path
     * @return data
     * @throws Exception
     */
	public String lireFichier(String path) throws Exception {
        InputStream stream;
        stream = new FileInputStream(path);
        StringBuilder reponse;
        
        reponse = new StringBuilder();
        
        for (int a = stream.read(); a != -1; a = stream.read()) {
            reponse.append((char)a);
        }
        
        stream.close();
        return reponse.toString();
        
    }

    /**
     * Write a file
     * @param path
     * @param texte
     * @throws IOException
     */
    public void ecrireFichier(String path, String texte) throws IOException {
        OutputStream stream;
        
        stream = new FileOutputStream(path);
        byte[] buffer = texte.getBytes();
        stream.write(buffer);
        stream.close();
    }
}
