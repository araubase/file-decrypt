package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Decryptor;
import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.interfaces.IView;
import fr.cesi.filedecrypt.model.Decrypt;

import java.awt.FlowLayout;
import java.util.*;

import javax.swing.JFrame;

public class FileFrame extends JFrame implements IView {

    private static final long serialVersionUID = 1L;

    private FilePanel filePanel;
    private IController controller;

    public FileFrame(IController controller) {
        super();
        this.controller = controller;
        filePanel = new FilePanel(this);
        this.buildFrame();
    }

    private void buildFrame() {
        FlowLayout fl = new FlowLayout();

        this.setTitle("App Title");
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(fl);
        this.setContentPane(this.getFilePanel().buildContentPanel());
        this.setVisible(true);
    }

    public FilePanel getFilePanel() {
        return filePanel;
    }

    public void setFilePanel(FilePanel filePanel) {
        this.filePanel = filePanel;
    }

    public Decryptor getController() {
        return (Decryptor) controller;
    }
}

