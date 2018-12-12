package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label helloWorld;
    public Label pointsDisplay;
    public int points;

    public void sayHelloWorld(ActionEvent actionEvent){
        helloWorld.setText("Hello World!");
    }

    public void plus(ActionEvent actionEvent){
        points++;
        pointsDisplay.setText(""+points);
    }
}
