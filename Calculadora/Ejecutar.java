import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        
        Calculadora nums = new Calculadora(0,0);
        System.out.println("Ingrese la operacion: \n1) Suma \n2) Multipliacion \n3) Division \n4) Potencia");
        int operacion = leer.nextInt();
        System.out.println("Ingrese dos numeros: ");
        switch (operacion) {

            case 1:
                int suma = nums.suma(leer.nextInt(), leer.nextInt());
                System.out.println("la suma es: " + suma);
                break;
            case 2:
                int multiplicacion = nums.mult(leer.nextInt(), leer.nextInt());
                System.out.println("la multiplicación es: " + multiplicacion);
                break;
            case 3:
                double divi = nums.division(leer.nextInt(), leer.nextInt());
                System.out.println("La division es: " + divi);
                break;
            case 4:
                int poten = nums.potencia(leer.nextInt());
                System.out.println("la potencia es: " + poten);
                break;
            default:
                break;
        }
    }
}
