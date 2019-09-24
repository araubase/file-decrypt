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

    public AuthPanel() {
        textField = new JTextField(20);
        passwordField = new JPasswordField(20);
        button = new JButton("Connexion");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Vérification des informations de connexion
            }
        });
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

}
