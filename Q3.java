import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        Frame f1 = new Frame("Newspaper Selection");
        f1.setLayout(new GridLayout(0, 1));
        List newspaperList = new List();
        for (String paper : new String[] { "Times of India", "Hindustan Times", "Mid-Day", "The Economic Times" })
            newspaperList.add(paper);
        newspaperList.setMultipleMode(true);
        Button show = new Button("Show Selected");
        Label resultLabel = new Label("No newspaper selected");
        show.addActionListener(e -> {
            String result = String.join(", ", newspaperList.getSelectedItems());
            resultLabel.setText(result.isEmpty() ? "No newspaper selected" : result);
        });
        f1.add(new Label("Choose your Favourite Newspaper:"));
        f1.add(newspaperList);
        f1.add(show);
        f1.add(resultLabel);
        f1.setSize(400, 300);
        f1.setVisible(true);
    }
}
