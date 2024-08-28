package notasdeclase;

public class Operadores {
    public  static void main(String[]args){
    //Operadores arimeticos (+-*/%)

        int data = (100/4)* 25 + (4*2);

        //Operadores de comparacion

        int clave=1234;
        int claveUser=1234;
        if (claveUser == clave) {
            System.out.printf("Se permite el ingreso ");
        }
        float estatura=1.76f;
        float estIngresada=1.77f;

        if ( estatura >  estIngresada){
            System.out.println("Cobrar 5000 pesos");

        }
        else System.out.println("no paga ");
    }
}
