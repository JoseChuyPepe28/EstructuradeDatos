package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class ControllerMenu {

    public void regresar2(){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("PantallaCobro.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(true);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
