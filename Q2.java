import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        Frame f1 = new Frame("Language and Gender Selector");
        f1.setLayout(new GridLayout(12, 1));
        Label l1 = new Label("Select Languages Known:");
        Label l2 = new Label("Select Your Gender:");
        Checkbox marathi = new Checkbox("Marathi");
        Checkbox hindi = new Checkbox("Hindi");
        Checkbox english = new Checkbox("English");
        Checkbox sanskrit = new Checkbox("Sanskrit");
        Checkbox gujarati = new Checkbox("Gujarati");
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        Button showResult = new Button("Show Result");
        Label resultLabel = new Label("");

        f1.add(l1);
        f1.add(marathi);
        f1.add(hindi);
        f1.add(english);
        f1.add(sanskrit);
        f1.add(gujarati);
        f1.add(l2);
        f1.add(male);
        f1.add(female);
        f1.add(showResult);
        f1.add(resultLabel);

        showResult.addActionListener(e -> {
            String result = "Languages Known: ";
            if (marathi.getState()) result += "Marathi ";
            if (hindi.getState()) result += "Hindi ";
            if (english.getState()) result += "English ";
            if (sanskrit.getState()) result += "Sanskrit ";
            if (gujarati.getState()) result += "Gujarati ";
            result += "\nGender: ";
            if (male.getState()) result += "Male";
            else if (female.getState()) result += "Female";
            
            resultLabel.setText(result);
        });

        f1.setSize(400, 400);
        f1.setVisible(true);
    }
}
