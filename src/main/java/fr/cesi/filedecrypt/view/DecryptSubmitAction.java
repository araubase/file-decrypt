package fr.cesi.filedecrypt.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecryptSubmitAction implements ActionListener {

    private FilePanel filePanel;

    public DecryptSubmitAction(FilePanel panel) {
        this.filePanel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        filePanel.getFrame().getController().decrypt(filePanel.getSource(), filePanel.getDestination());
    }

    public FilePanel getFilePanel() {
        return filePanel;
    }
}
