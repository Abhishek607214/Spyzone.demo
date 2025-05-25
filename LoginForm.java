import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;

    public LoginForm() {
        setTitle("🗳️ Voter Login");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        panel.setBackground(Color.WHITE);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(emailLabel);
        emailField = new JTextField();
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(passwordLabel);
        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginBtn = new JButton("Login");
        JButton registerBtn = new JButton("Register");
        loginBtn.setBackground(new Color(0, 123, 255));
        loginBtn.setForeground(Color.WHITE);
        registerBtn.setBackground(new Color(40, 167, 69));
        registerBtn.setForeground(Color.WHITE);

        panel.add(loginBtn);
        panel.add(registerBtn);

        add(panel);
        registerBtn.addActionListener(e -> new RegisterForm().setVisible(true));
    }
}

