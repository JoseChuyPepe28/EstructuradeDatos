package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


import java.io.IOException;

public class Controller {
    @FXML TextField txtUsuario;
    @FXML PasswordField txtContraseña;

    public void login (ActionEvent event) {
        ingresar();
    }
    public void enter(KeyEvent event){
        if(event.getCode() == KeyCode.ENTER){
            ingresar();
        }
    }

    public void ingresar(){
        String u = txtUsuario.getText();
        String p = txtContraseña.getText();
        if (u.equals("si") && p.equals("si")) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("PantallaCobro.fxml"));
                Scene scene=new Scene(root);
                Main.stage.setScene(scene);
                Main.stage.setMaximized(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Pizzeria");
            alert.setContentText("El usuario o la contraseña son incorrectos");
            alert.show();
        }
    }


}
