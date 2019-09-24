package fr.cesi.filedecrypt.view;

import fr.cesi.filedecrypt.controller.Authenticator;
import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.interfaces.IView;

import javax.swing.*;
import java.awt.*;

public class AuthFrame extends JFrame implements IView {

    private AuthPanel authPanel;
    private IController controller;

    public AuthFrame(IController controller) {
        super();
        this.controller = controller;
        authPanel = new AuthPanel(this);
        this.buildFrame();
    }

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

    public AuthPanel getAuthPanel() { return authPanel; }

    public void setAuthPanel(AuthPanel authPanel) {
        this.authPanel = authPanel;
    }

    public Authenticator getController() {
        return (Authenticator) controller;
    }
}
