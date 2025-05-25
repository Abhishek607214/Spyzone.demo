import javax.swing.*;
import java.awt.*;

public class RegisterForm extends JFrame {
    JTextField nameField, emailField;
    JPasswordField passwordField;

    public RegisterForm() {
        setTitle("📝 Voter Registration");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        panel.setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(nameLabel);
        nameField = new JTextField();
        panel.add(nameField);

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

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBackground(new Color(23, 162, 184));
        submitBtn.setForeground(Color.WHITE);
        panel.add(new JLabel()); // Empty cell
        panel.add(submitBtn);

        submitBtn.addActionListener(e -> {
            Voter voter = new Voter(
                nameField.getText(),
                emailField.getText(),
                new String(passwordField.getPassword())
            );
            boolean success = new VoterDAO().registerVoter(voter);
            JOptionPane.showMessageDialog(this,
                    success ? "✅ Registered Successfully!" : "❌ Registration Failed!",
                    "Registration Status",
                    success ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE
            );
        });

        add(panel);
    }
}
