import java.util.Scanner;

public class Ejercicio5_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aprobados= 0;
        int reprobados= 0;

        System.out.print("Cantidad de estudiantes: ");
        int cant = leer.nextInt();
        
        System.out.print("Ingrese las notas: ");
        for (int i = 1; i <=cant ; i++) {
            double notas = leer.nextDouble();
            if (notas >= 5) {
                aprobados++;
            }else{
                reprobados++;
            }
        }
        System.out.println("Total estudiantes: " + cant + "\nTotal aprobados: " + aprobados + "\nTotal reprobados: " + reprobados);
    }
}
