package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    TextArea mathias;

    @FXML
    Button readButton;

    @FXML
    Button writeButton;


    public void readFile() {
        Readme x = new Readme();
        mathias.setText(x.readFile());

    }
}
