public class Persona{
    String nombre;
    double altura;
    double peso;
    int edad;

public Persona(String nombre, double altura, double peso, int edad){
    this.nombre = nombre;
    this.altura = altura;
    this.peso = peso;
    this.edad = edad;
}
public void caminar(){
    System.out.println("Caminando");
}
public String IMC (double peso, double altura){
    double indice = peso/ Math.pow(altura, 2);
    String msg ="";
    if (indice <= 18.5) {
        msg = "Bajo de peso " + indice;
    }if (indice >= 18.5 && indice <=24.9) {
        msg = "Peso saludable " + indice;

    }if (indice >= 25 && indice <= 29.9) {
        msg = "Sobrepeso " + indice;

    }if (indice >= 30) {
        msg = "Obesidad " + indice;

    }
    return msg;
}
public boolean mayorEdad (int edad){
    boolean mayoria = false;
    if(edad >= 18){
        mayoria = true;
    }
    return mayoria;
}

}