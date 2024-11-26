import java.awt.*;
import java.applet.Applet;
// <applet code="Q4.class" width="400" height="300">    </applet>

public class Q4 extends Applet {
    public void init() {
        setLayout(new GridLayout(8, 1));
        List cityList = new List();
        cityList.add("Mumbai");
        cityList.add("Delhi");
        cityList.add("Pune");
        cityList.add("Patna");
        cityList.add("Kolkata");
        cityList.add("Chennai");
        cityList.add("Bengaluru");
        cityList.add("Amritsar");
        cityList.add("Mirzapur");
        cityList.add("Nagpur");
        
        Button showResult = new Button("Show Selected");
        Label resultLabel = new Label("No city selected");

        showResult.addActionListener(e -> {
            String selectedCity = cityList.getSelectedItem();
            resultLabel.setText(selectedCity == null ? "No city selected" : "Selected City: " + selectedCity);
        });

        add(new Label("Choose your City: "));
        add(cityList);
        add(showResult);
        add(resultLabel);
    }
}


