package Clase7oct2024;

public class Condicional {
    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;
    
        if(!a || (b && c) ){
            System.out.println("Sentencia if ejecutada");
        }else{
            System.out.println("Sentencia else ejecutada");
        }

        //Marks 

        int marks = 80;
        if(marks > 75)
            System.out.println("distintion");
        if(marks > 30)
            System.out.println("pass");
        else{
            System.out.println("Fail");
            System.out.println("Better luck next time");
        }


        //Indian
        int indian, araba;
        indian = 300;
        araba = 290;
        if(indian > araba){
            System.out.println("Indian wins");
        }else{
            System.out.println("Araba wins");
        }

        System.out.println( indian > araba ? "Indian wins" : "Araba wins");

        if( true && false && true || false){
            System.out.println("true");
        }else
            System.out.println("false");

        int a = 7*3+6/2-5;
        int b = 21-8+a%3*11;
        System.out.println(a + " " + b);    

        if (a<b){
            System.out.println("A is less than B");
        }
        if(a==b){
            System.out.println("A is equal to B");
        }
        if (a>b){
            System.out.println("A is greater than B");
        }



    }
}
