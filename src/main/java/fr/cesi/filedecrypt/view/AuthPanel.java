package fr.cesi.filedecrypt.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class AuthPanel extends JPanel {

    private JPanel jp = new JPanel();

    private JTextField textField;
    private JPasswordField passwordField;
    private JButton button;
    private AuthFrame frame;

    public AuthPanel(final AuthFrame frame) {
        this.frame = frame;

        this.textField = new JTextField(20);
        this.passwordField = new JPasswordField(20);
        this.button = new JButton("Connexion");
        this.button.addActionListener(new MouseClickAction(this));
    }

    public JPanel buildContentPanel() {
        this.getJP().add(textField);
        this.getJP().add(passwordField);
        this.getJP().add(button);
        return this.getJP();
    }

    public JPanel getJP() {
        return jp;
    }

    public void setJP(JPanel jp) {
        this.jp = jp;
    }

    public AuthFrame getFrame() {
        return frame;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
