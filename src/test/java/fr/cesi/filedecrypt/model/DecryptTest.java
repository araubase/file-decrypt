package fr.cesi.filedecrypt.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void decrypt() {
        Decrypt decrypt = new Decrypt();
        String result = "test";
        String key = "clef";
        String s = decrypt.decrypt(result, key);
        assertEquals(result, decrypt.decrypt(s, key));
    }
}