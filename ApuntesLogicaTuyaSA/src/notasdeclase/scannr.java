package notasdeclase;
import java.util.Scanner;
public class scannr {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String nombre =scanner.nextLine();

        System.out.println("Hola, "+ nombre+"!");
    }
}
