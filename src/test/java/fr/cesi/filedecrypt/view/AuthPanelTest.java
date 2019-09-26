package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Authenticator;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class AuthPanelTest {

    @Test
    public void buildContentPanel() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JPanel jp = new JPanel();
        panel.setJP(jp);

        assertEquals(jp, panel.buildContentPanel());
    }

    @Test
    public void getJP() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JPanel jp = new JPanel();
        panel.setJP(jp);

        assertEquals(jp, panel.getJP());
    }

    @Test
    public void setJP() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JPanel jp = new JPanel();
        panel.setJP(jp);

        assertEquals(jp, panel.getJP());
    }

    @Test
    public void getFrame() {
        AuthFrame frame = new AuthFrame(new Authenticator());
        AuthPanel panel = new AuthPanel(frame);

        assertEquals(frame, panel.getFrame());
    }

    @Test
    public void getTextField() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JTextField field = new JTextField();
        panel.setTextField(field);

        assertEquals(field, panel.getTextField());
    }

    @Test
    public void setTextField() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JTextField field = new JTextField();
        panel.setTextField(field);

        assertEquals(field, panel.getTextField());
    }

    @Test
    public void getPasswordField() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JPasswordField field = new JPasswordField();
        panel.setPasswordField(field);

        assertEquals(field, panel.getPasswordField());
    }

    @Test
    public void setPasswordField() {
        AuthPanel panel = new AuthPanel(new AuthFrame(new Authenticator()));
        JPasswordField field = new JPasswordField();
        panel.setPasswordField(field);

        assertEquals(field, panel.getPasswordField());
    }
}