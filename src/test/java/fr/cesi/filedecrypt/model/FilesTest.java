package fr.cesi.filedecrypt.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilesTest {

    @Test
    public void lireFichier() {
        Files files = new Files();
        String result = "";
        try {
            result = files.lireFichier("C:\\Users\\julie\\Documents\\EXIA\\Workshop\\FileDecrypt\\README.md");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        assertEquals("# file-decrypt\n", result);
    }

    @Test
    public void ecrireFichier() {
        Files files = new Files();

        try {
            files.ecrireFichier("C:\\Users\\julie\\Documents\\EXIA\\Workshop\\FileDecrypt\\README.md", "# file-decrypt\n");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        String result = "";
        try {
            result = files.lireFichier("C:\\Users\\julie\\Documents\\EXIA\\Workshop\\FileDecrypt\\README.md");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        assertEquals("# file-decrypt\n", result);
    }
}