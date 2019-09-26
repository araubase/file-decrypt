package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Authenticator;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseClickActionTest {

    @Test
    public void getAuthPanel() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        MouseClickAction action = new MouseClickAction(panel);

        assertEquals(panel, action.getAuthPanel());
    }
}