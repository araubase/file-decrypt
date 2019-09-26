package fr.cesi.filedecrypt.view;

import javax.swing.*;

/**
 * Authentication panel class
 */
public class AuthPanel extends JPanel {

    private JPanel jp;

    private JTextField textField;
    private JPasswordField passwordField;
    private JButton button;
    private AuthFrame frame;

    /**
     * Constructor
     * @param frame
     */
    public AuthPanel(final AuthFrame frame) {
        this.frame = frame;
        this.jp = new JPanel();

        this.textField = new JTextField(20);
        this.passwordField = new JPasswordField(20);
        this.button = new JButton("Connexion");
        this.button.addActionListener(new MouseClickAction(this));
    }

    /**
     * Build the panel content
     * @return built panel
     */
    public JPanel buildContentPanel() {
        this.getJP().add(textField);
        this.getJP().add(passwordField);
        this.getJP().add(button);
        return this.getJP();
    }

    /**
     * Getter method
     * @return panel instance
     */
    public JPanel getJP() {
        return jp;
    }

    /**
     * Setter method
     * @param jp
     */
    public void setJP(JPanel jp) {
        this.jp = jp;
    }

    /**
     * Getter method
     * @return frame instance
     */
    public AuthFrame getFrame() {
        return frame;
    }

    /**
     * Getter method
     * @return text field instance
     */
    public JTextField getTextField() {
        return textField;
    }

    /**
     * Getter method
     * @return password field instance
     */
    public JPasswordField getPasswordField() {
        return passwordField;
    }

    /**
     * Setter method
     * @param textField
     */
    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    /**
     * Setter method
     * @param passwordField
     */
    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }
}
