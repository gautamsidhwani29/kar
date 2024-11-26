import javax.swing.*;

public class Question_15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);
        JButton multiplyButton = new JButton("Multiply");
        JLabel resultLabel = new JLabel("Result: ");
        JLabel label1 = new JLabel("Enter Number 1:");
        JLabel label2 = new JLabel("Enter Number 2:");

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(label1);
        frame.add(num1);
        frame.add(label2);
        frame.add(num2);
        frame.add(multiplyButton);
        frame.add(resultLabel);

        multiplyButton.addActionListener(e -> {
            try {
                int product = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
                resultLabel.setText("Result: " + product);
            } catch (Exception ex) {
                resultLabel.setText("Invalid input");
            }
        });

        frame.setSize(250, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
