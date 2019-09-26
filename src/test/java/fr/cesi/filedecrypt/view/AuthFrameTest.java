package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Authenticator;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthFrameTest {

    @Test
    public void getAuthPanel() {
        AuthFrame frame = new AuthFrame(new Authenticator());
        AuthPanel panel = new AuthPanel(frame);
        frame.setAuthPanel(panel);

        assertEquals(panel, frame.getAuthPanel());
    }

    @Test
    public void setAuthPanel() {
        AuthFrame frame = new AuthFrame(new Authenticator());
        AuthPanel panel = new AuthPanel(frame);
        frame.setAuthPanel(panel);

        assertEquals(panel, frame.getAuthPanel());
    }

    @Test
    public void getController() {
        Authenticator auth = new Authenticator();
        AuthFrame frame = new AuthFrame(auth);

        assertEquals(auth, frame.getController());
    }
}