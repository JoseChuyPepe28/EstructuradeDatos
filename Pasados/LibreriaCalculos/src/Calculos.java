public class Calculos {
    double [] a;
    double [][] b;

    public Calculos(double[] a, double[][] b) {
        this.a = a;
        this.b = b;
    }
    public double[] procecarCoseno(){
            double [] retorno=a;
            for (int x=0;x<retorno.length;x++){
                retorno[x]=Math.cos(a[x]);
            }
            return retorno;
    }
    public double[][] procesarSeno(){
        double[][] retorno=b;
        for (int x=0;x<retorno.length;x++){
            for (int y=0;y<retorno[x].length;y++){
                retorno[x][y] = Math.sin(b[x][y]);
            }
        }
        return retorno;
    }
    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[][] getB() {
        return b;
    }

    public void setB(double[][] b) {
        this.b = b;
    }
}
