import Proyecto_Libreria.Pez;

public class Main {
    public static void main(String[] args) {
        Pez pescao=new Pez();
        String mes=pescao.Por_nacimiento(100);
        String ras=pescao.Por_Nombre("");
        System.out.println(mes);
        System.out.println(ras);
    }
}
