package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Estructura.ItemPedidos;
import sample.Estructura.Pedido;



import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ControllerCobro {
    @FXML ComboBox cmbPlatillos, cmbBebidas, cmbOpc;
    @FXML TableView tabla;
    @FXML TextField  txtNombre;
    @FXML Label nombrePedido;
    @FXML Spinner<Integer> cantP, cantB;
    final int initialvalue=1;
    SpinnerValueFactory<Integer> num=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,initialvalue);
    final int initialvalue2=1;
    SpinnerValueFactory<Integer> num2=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99,initialvalue2);
    Stack<ItemPedidos> pila=new Stack<>();

    LinkedList<String> listaBebidas=new LinkedList<>();
    LinkedList<String> listaPlatillos=new LinkedList<>();
    LinkedList<String> listaOpciones=new LinkedList<>();
    TableColumn columnaBebida=new TableColumn("Bebida");
    TableColumn columnaCantBebida=new TableColumn("Cantidad");
    TableColumn columnaPlatillos=new TableColumn("Pizza");
    TableColumn columnaCantPlatillos=new TableColumn("Cantidad");
    ObservableList<Pedido> listaPedidos= FXCollections.observableArrayList();
    Queue<ItemPedidos> cola=new LinkedList<>();



    @FXML protected void initialize(){
        columnaBebida.setCellValueFactory(new PropertyValueFactory<Pedido, String>("bebida"));
        columnaCantBebida.setCellValueFactory(new PropertyValueFactory<Pedido, String>("cantbebida"));
        columnaPlatillos.setCellValueFactory(new PropertyValueFactory<Pedido, String>("platillo"));
        columnaCantPlatillos.setCellValueFactory(new PropertyValueFactory<Pedido, String>("cantplatillo"));
        tabla.getColumns().addAll(columnaBebida, columnaCantBebida,columnaPlatillos,columnaCantPlatillos);
        tabla.setItems(listaPedidos);
        listaBebidas.add("Coca Cola 2Lts");
        listaBebidas.add("Peñafiel 2Lts");
        listaBebidas.add("Fanta 2Lts");
        listaBebidas.add("Sprite 2Lts");
        listaBebidas.add("Coca Cola 1Lts");
        listaPlatillos.add("Peperoni");
        listaPlatillos.add("Chicago");
        listaPlatillos.add("Hawuallana");
        listaPlatillos.add("Queso");
        listaPlatillos.add("Orilla Queso");

        listaOpciones.add("Luis Peña");
        listaOpciones.add("Mesero 2");
        listaOpciones.add("Mesero 3");
        for(int x=0;x<listaPlatillos.size();x++) cmbPlatillos.getItems().add(listaPlatillos.get(x));
        for(int x=0;x<listaBebidas.size();x++) cmbBebidas.getItems().add(listaBebidas.get(x));
        for(int x=0;x<listaOpciones.size();x++) cmbOpc.getItems().add(listaOpciones.get(x));
        cantP.setValueFactory(num);
        cantB.setValueFactory(num2);

    }

    public void insertarPedido(){
        String p=cmbPlatillos.getSelectionModel().getSelectedItem().toString();
        String b=cmbBebidas.getSelectionModel().getSelectedItem().toString();
        String cp=cantP.getValue().toString();
        String cb=cantB.getValue().toString();
        listaPedidos.add(new Pedido(b, cb, p, cp));
    }
    public void guardarPedido(){

        String[][] items=new String[listaPedidos.size()][4];
        for(int x=0;x<items.length;x++){
            items[x][0]=listaPedidos.get(x).getBebida();
            items[x][1]=listaPedidos.get(x).getCantbebida();
            items[x][2]=listaPedidos.get(x).getPlatillo();
            items[x][3]=listaPedidos.get(x).getCantplatillo();
        }
        ItemPedidos pedido=new ItemPedidos(items, txtNombre.getText());
        cola.add(pedido);
        pila.add(pedido);
        listaPedidos.clear();
        txtNombre.setText("");


    }
    public void finalizar(){
        ItemPedidos pedido=cola.poll();
        nombrePedido.setText(pedido.getNombre());
        String [][] datos=pedido.getDatos();
        for(int x=0;x<datos.length;x++){
            System.out.print(datos[x][0]+" ");
            System.out.print(datos[x][1]+ ",");
            System.out.print(datos[x][2]+ " ");
            System.out.print(datos[x][3]+ " ");
            System.out.println();
        }
    }
    public void Status(){
        ItemPedidos pedido=pila.pop();
        nombrePedido.setText(pedido.getNombre());
        String [][] datos=pedido.getDatos();
        for(int x=0;x<datos.length;x++){
            System.out.print(datos[x][0]+" ");
            System.out.print(datos[x][1]+ ",");
            System.out.print(datos[x][2]+ " ");
            System.out.print(datos[x][3]+ " ");
            System.out.println();
        };

    }

    public void menu(){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("PantallaMenu.fxml"));
            Scene scene=new Scene(root);
            Main.stage.setScene(scene);
            Main.stage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





}

