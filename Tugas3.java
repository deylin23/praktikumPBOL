import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm();
        });
    }
}

class LoginForm extends JFrame {
    private JPanel panel;
    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginForm() {
        super("Login Form");
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        
        JButton loginButton = new JButton("Submit Login");
        JButton registerButton = new JButton("Register");

        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(this, "Login Attempted with\nEmail: " + email + "\nPassword: " + password);
        });

        registerButton.addActionListener(e -> {
            this.dispose();  // Close login form
            new RegisterForm();  // Open register form
        });

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}

class RegisterForm extends JFrame {
    private JPanel panel;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;

    public RegisterForm() {
        super("Register Form");

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Nama:");
        nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        
        JButton registerButton = new JButton("Submit Register");
        JButton loginButton = new JButton("Login");

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(this, "Registration Attempted with\nName: " + name + "\nEmail: " + email + "\nPassword: " + password);
        });

        loginButton.addActionListener(e -> {
            this.dispose();  // Close register form
            new LoginForm();  // Open login form
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerButton);
        panel.add(loginButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
