import java.awt.*;
import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Frame f = new Frame("Form");
        TextArea ta = new TextArea();
        ta.setText("VESP");
        TextField t1 = new TextField("Enter Name : ");
        TextField t2 = new TextField("Enter Branch : ");
        Label l1 = new Label("Yes or No? : ");
        Button b1 = new Button("Yes");
        Button b2 = new Button("No");
        f.add(ta);f.add(t1);f.add(t2);f.add(l1);f.add(b1);f.add(b2);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
        b1.addActionListener(e->{
            ta.setText("Yes");
        });
        b2.addActionListener(e->{
            ta.setText("No");
        });
    }
}