package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtArreglo1 , txtArreglo2;
    @FXML
    ListView lista1 , lista2;
    double [] arreglo1=new double[5];
    double [] [] arreglo2=new double[2][4];
    int cont=0;
    int cont2=0;
    int cont3=0;
    public void insertar1(ActionEvent event){
        if (cont<5){
            double dato = Double.parseDouble(txtArreglo1.getText());
            arreglo1[cont]= dato;
            cont++;
            txtArreglo1.setText("");
            imprimirArreglo(arreglo1);
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }
    }
    public void insertar2(ActionEvent event){
        if (cont2<2){
            double dato =  Double.parseDouble(txtArreglo2.getText());
            arreglo2[cont2][cont3]= dato;
            cont3++;
            if (cont3 == 4){
                cont3=0;
                cont2++;
            }
            txtArreglo2.setText("");
            imprimirArreglobidi(arreglo2);
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }
    }
    public void porecesar1 (ActionEvent event){}
    public void porecesar2 (ActionEvent event){}
    public void imprimirArreglo(double[] arr){
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+",");
        }
        System.out.println("");
    }
    public void imprimirArreglobidi(double[][] arr){
        for (int x=0;x<arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+",");
            }
            System.out.println("_______________");
        }
    }


}
