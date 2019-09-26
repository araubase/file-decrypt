package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Decryptor;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class OpenFileActionTest {

    @Test
    public void getPanel() {
        FilePanel panel = new FilePanel(new FileFrame(new Decryptor()));
        OpenFileAction action = new OpenFileAction("", JFileChooser.DIRECTORIES_ONLY, panel);

        assertEquals(panel, action.getPanel());
    }
}