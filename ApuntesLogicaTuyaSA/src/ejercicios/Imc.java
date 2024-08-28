package ejercicios;
import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
    float   peso;
    float altura;
    Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese su peso");
        peso= sc.nextFloat();
        System.out.println("ingrese su altura");
        altura=sc.nextFloat();
        System.out.println("Un momento por favor :)");

        float imc;

        imc=peso/(altura*altura);
        System.out.println("Su imc es de: \n"+imc);







    }
}
