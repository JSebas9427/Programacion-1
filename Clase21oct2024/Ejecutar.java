import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los datos de la persona, de la siguiente forma, nombre, altura, peso y edad");
        Persona p1= new Persona(leer.nextLine(), leer.nextDouble(), leer.nextDouble(), leer.nextInt());
        System.out.println("nombre: " +p1.nombre +"\naltura: "+ p1.altura +"\nPeso: "+ p1.peso +"\nEdad: "+ p1.edad);
        

        String imc = p1.IMC(p1.peso, p1.altura);
        System.out.println(imc);

        boolean mayor = p1.mayorEdad(p1.edad);Sebasti
        if ( mayor = true) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }

    }
}
