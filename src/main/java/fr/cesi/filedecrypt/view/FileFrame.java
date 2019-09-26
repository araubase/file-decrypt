package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Decryptor;
import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.interfaces.IView;
import fr.cesi.filedecrypt.model.Decrypt;

import java.awt.FlowLayout;
import java.util.*;

import javax.swing.JFrame;

/**
 * File submission frame class
 */
public class FileFrame extends JFrame implements IView {

    private static final long serialVersionUID = 1L;

    private FilePanel filePanel;
    private IController controller;

    /**
     * Constructor
     * @param controller
     */
    public FileFrame(IController controller) {
        super();
        this.controller = controller;
        filePanel = new FilePanel(this);
        this.buildFrame();
    }

    /**
     * Build the frame
     */
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

    /**
     * Getter method
     * @return panel instance
     */
    public FilePanel getFilePanel() {
        return filePanel;
    }

    /**
     * Setter method
     * @param filePanel
     */
    public void setFilePanel(FilePanel filePanel) {
        this.filePanel = filePanel;
    }

    /**
     * Getter method
     * @return controller instance
     */
    public Decryptor getController() {
        return (Decryptor) controller;
    }
}

