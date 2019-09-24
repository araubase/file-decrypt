package fr.cesi.filedecrypt.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseClickAction implements ActionListener {

    private AuthPanel authPanel;

    public MouseClickAction(AuthPanel panel) {
        this.authPanel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder password = new StringBuilder();
        JPasswordField field = this.getAuthPanel().getPasswordField();
        JTextField textField = this.getAuthPanel().getTextField();

        for (int i = 0; i < field.getPassword().length; i++) {
            password.append(field.getPassword()[i]);
        }

        this.authPanel.getFrame().getController().login(textField.getText(), password.toString());
    }

    public AuthPanel getAuthPanel() {
        return authPanel;
    }
}
