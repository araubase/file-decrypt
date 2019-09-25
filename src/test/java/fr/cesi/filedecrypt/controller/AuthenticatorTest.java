package fr.cesi.filedecrypt.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticatorTest {

    @Test
    public void login() {
        Authenticator auth = new Authenticator();
        assertEquals(true, auth.login("julien.griffoul@viacesi.fr", "admin"));
    }
}