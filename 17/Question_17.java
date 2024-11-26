import java.awt.*;
import java.awt.event.*;

public class Question_17 {
    public static void main(String[] args) {
        Frame frame = new Frame("Click Counter");
        Label label = new Label("0");
        Button button = new Button("Click Me");

        button.addActionListener(e -> label.setText(String.valueOf(Integer.parseInt(label.getText()) + 1)));

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
