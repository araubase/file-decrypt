package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Decryptor;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class FilePanelTest {

    @Test
    public void buildContentPanel() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        JPanel jp = new JPanel();
        panel.setJP(jp);

        assertEquals(jp, panel.buildContentPanel());
    }

    @Test
    public void getJP() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        JPanel jp = new JPanel();
        panel.setJP(jp);

        assertEquals(jp, panel.getJP());
    }

    @Test
    public void setJP() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        JPanel jp = new JPanel();
        panel.setJP(jp);

        assertEquals(jp, panel.getJP());
    }

    @Test
    public void getSource() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        String source = "";
        panel.setSource(source);

        assertEquals(source, panel.getSource());
    }

    @Test
    public void getDestination() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        String destination = "";
        panel.setDestination(destination);

        assertEquals(destination, panel.getDestination());
    }

    @Test
    public void setSource() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        String source = "";
        panel.setSource(source);

        assertEquals(source, panel.getSource());
    }

    @Test
    public void setDestination() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        String destination = "";
        panel.setDestination(destination);

        assertEquals(destination, panel.getDestination());
    }

    @Test
    public void getFrame() {
        FileFrame frame = new FileFrame(new Decryptor());
        FilePanel panel = new FilePanel(frame);

        assertEquals(frame, panel.getFrame());
    }
}