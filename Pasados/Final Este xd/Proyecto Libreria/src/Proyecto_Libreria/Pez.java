package Proyecto_Libreria;

public class Pez {
    public String Por_Nombre;
    public String Por_nacimiento;

    public Pez(String por_Nombre, String por_nacimiento) {
        Por_Nombre = por_Nombre;
        Por_nacimiento = por_nacimiento;
    }
    public Pez(){

    }
    public String Por_nacimiento(double numer){
        double cant=.90;
        numer=numer*cant;
        return  numer+"";
    }
    public  String Por_Nombre(String name){
        return name;
    }
}
