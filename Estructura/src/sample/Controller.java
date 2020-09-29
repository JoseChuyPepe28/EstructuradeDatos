package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label lbltittle;

    public void evento(ActionEvent event){
        int dias= Integer.parseInt(txtedad.getText())*365;
        lbltittle.setText("Has vivido "+dias+" dias");
    }
}
