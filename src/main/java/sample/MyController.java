package main.java.sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class MyController implements Initializable {

    @FXML
    private Button myButton;

    @FXML
    private TextField name;

    @FXML
    private TextField password;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    // When user click on myButton
    // this method will be called.
    public void showDateTime(ActionEvent event) {
        System.out.println("Button Clicked!");
        DateFormat df = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        Date now = new Date();
        String dateTimeString = df.format(now);
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                name.setText(dateTimeString);

            }
        });
        // Show in VIEW

    }
}
