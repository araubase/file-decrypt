package fr.cesi.filedecrypt.view;

import java.awt.FlowLayout;
import java.util.*;

import javax.swing.JFrame;

public class FileFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private FilePanel filePanel;

    public FileFrame() {
        super();
        filePanel = new FilePanel();
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
}

