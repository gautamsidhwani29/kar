import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question_11 extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int seconds = 0;

    public Question_11() {
        timeLabel = new JLabel("0");
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        add(timeLabel);
        add(startButton);
        add(stopButton);
        add(resetButton);
        setLayout(new FlowLayout());

        timer = new Timer(1000, e -> timeLabel.setText(String.valueOf(++seconds)));

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            seconds = 0;
            timeLabel.setText("0");
        });

        setSize(200, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Question_11();
    }
}
