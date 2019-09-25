package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Decryptor;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileFrameTest {

    @Test
    public void getFilePanel() {
        FileFrame frame = new FileFrame(new Decryptor());
        FilePanel panel = new FilePanel(frame);
        frame.setFilePanel(panel);

        assertEquals(panel, frame.getFilePanel());
    }

    @Test
    public void setFilePanel() {
        FileFrame frame = new FileFrame(new Decryptor());
        FilePanel panel = new FilePanel(frame);
        frame.setFilePanel(panel);

        assertEquals(panel, frame.getFilePanel());
    }

    @Test
    public void getController() {
        Decryptor decryptor = new Decryptor();
        FileFrame frame = new FileFrame(decryptor);

        assertEquals(decryptor, frame.getController());
    }
}