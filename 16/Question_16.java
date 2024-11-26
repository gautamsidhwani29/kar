import javax.swing.*;

public class Question_16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Authentication");
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel();

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(messageLabel);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (username.equals("admin") && password.equals("1234")) {
                messageLabel.setText("Login Successful");
            } else {
                messageLabel.setText("Invalid Username or Password");
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
