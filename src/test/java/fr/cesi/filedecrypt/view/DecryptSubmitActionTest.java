package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Decryptor;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class DecryptSubmitActionTest {

    @Test
    public void getFilePanel() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        DecryptSubmitAction action = new DecryptSubmitAction(panel);

        assertEquals(panel, action.getFilePanel());
    }
}