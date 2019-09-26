package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Authenticator;
import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.interfaces.IView;

import javax.swing.*;
import java.awt.*;

/**
 * Authentication frame class
 */
public class AuthFrame extends JFrame implements IView {

    private AuthPanel authPanel;
    private IController controller;

    /**
     * Constructor
     * @param controller
     */
    public AuthFrame(IController controller) {
        super();
        this.controller = controller;
        authPanel = new AuthPanel(this);
        this.buildFrame();
    }

    /**
     * Build the frame
     */
    private void buildFrame() {
        FlowLayout fl = new FlowLayout();

        this.setTitle("Authentification");
        this.setSize(800,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(fl);
        this.setContentPane(this.getAuthPanel().buildContentPanel());
        this.setVisible(true);
    }

    /**
     * Getter method
     * @return panel instance
     */
    public AuthPanel getAuthPanel() { return authPanel; }

    /**
     * Setter method
     * @param authPanel
     */
    public void setAuthPanel(AuthPanel authPanel) {
        this.authPanel = authPanel;
    }

    /**
     * Getter method
     * @return controller instance
     */
    public Authenticator getController() {
        return (Authenticator) controller;
    }
}
