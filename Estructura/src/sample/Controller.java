package sample;

import conversiones.Conversion;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label lbltittle;

    public void evento(ActionEvent event){
        Conversion td= new Conversion();

        int numero= Integer.parseInt(txtedad.getText());
        String res= td.binario(numero);
        lbltittle.setText(res);
    }
}
