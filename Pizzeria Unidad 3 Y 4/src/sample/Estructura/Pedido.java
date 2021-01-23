package sample.Estructura;

import javafx.beans.property.SimpleStringProperty;

public class Pedido {
    SimpleStringProperty bebida;
    SimpleStringProperty cantbebida;
    SimpleStringProperty platillo;
    SimpleStringProperty cantplatillo;

    public Pedido(String bebida, String cantbebida, String platillo, String cantplatillo){
        this.bebida=new SimpleStringProperty(bebida);
        this.cantbebida=new SimpleStringProperty(cantbebida);
        this.platillo=new SimpleStringProperty(platillo);
        this.cantplatillo=new SimpleStringProperty(cantplatillo);
    }

    public String getBebida() {
        return bebida.get();
    }

    public SimpleStringProperty bebidaProperty() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida.set(bebida);
    }

    public String getCantbebida() {
        return cantbebida.get();
    }

    public SimpleStringProperty cantbebidaProperty() {
        return cantbebida;
    }

    public void setCantbebida(String cantbebida) {
        this.cantbebida.set(cantbebida);
    }

    public String getPlatillo() {
        return platillo.get();
    }

    public SimpleStringProperty platilloProperty() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo.set(platillo);
    }

    public String getCantplatillo() {
        return cantplatillo.get();
    }

    public SimpleStringProperty cantplatilloProperty() {
        return cantplatillo;
    }

    public void setCantplatillo(String cantplatillo) {
        this.cantplatillo.set(cantplatillo);
    }
}
