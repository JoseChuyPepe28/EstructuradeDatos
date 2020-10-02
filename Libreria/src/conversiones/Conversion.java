package conversiones;

public class Conversion {
    public String binario(int numero){
        int exp=0,digito;
        double binario=0;
        while(numero!=0){
            digito = numero % 2;
            binario = binario + digito + Math.pow(10, exp);
            exp ++;
            numero = numero / 2;
        }
        return String.format("%.0f %n",binario);
    }
    public String num(int numero){
       return Integer.toHexString(numero);
    }
    public String octal(int numero){
        return Integer.toOctalString(numero);
    }
    public String conv(int numero, int base){
        String dig = "ABCDEF";
        String res="";
        while (numero>0){
            int digito = numero % base;
            res = dig.charAt(digito) + res;
            numero = numero / base;
        }
        return res;
    }
}
