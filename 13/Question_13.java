import javax.swing.*;
import java.awt.*;

class Question_13 extends JFrame {
    Question_13() {
        String[] columnNames = {"Student Name", "Percentage", "Grade"};
        Object[][] data = {
            {"John", 85, "A"},
            {"Sara", 90, "A+"},
            {"Tom", 78, "B+"},
            {"Emma", 92, "A+"},
            {"David", 80, "B"},
            {"Sophia", 88, "A"},
            {"James", 76, "B"},
            {"Isabella", 95, "A+"},
            {"Liam", 82, "B+"},
            {"Mia", 87, "A"}
        };
        
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        
        add(scrollPane, BorderLayout.CENTER);
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_13();
    }
}
