import conversiones.Conversion;

public class Main {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        String res = conversion.binario(2);
        System.out.println(res);
        res=conversion.octal(16);
        System.out.println(res);
    }
}
