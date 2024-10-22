
public class Calculadora{
    private int a;
    private int b;
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }
     public int suma (int a, int b){
        return a + b;
     }
     public int mult (int a, int b){
        return a * b;
     }
     public double division (int a, int b){
        return a/b;
     }
     public int potencia (int a){
        return a * a;
     }
}