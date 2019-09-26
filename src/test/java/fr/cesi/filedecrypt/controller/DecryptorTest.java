package fr.cesi.filedecrypt.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptorTest {

    @Test
    public void decrypt() {
        Decryptor decryptor = new Decryptor();

        assertEquals(false, decryptor.decrypt("", ""));
    }
}