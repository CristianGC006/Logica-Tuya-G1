package ejercicios;
import java.util.Scanner;
public class Login2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String cel="3157420408";
        System.out.println("ingrese su numero: ");
        String celInput=sc.nextLine();
        String email="123@mail.com";
        System.out.println("ingrese su email: ");
        String emailInput= sc.nextLine();
        int key=1234;
        System.out.println("ingrese su clave: ");
        int keyInt=sc.nextInt();
        String name="Gustavo Petro";

        if (cel.equals(celInput)|| email.equals(emailInput)&& key==keyInt){
            System.out.println("Bienvenido," +name);
        }else{
            System.out.println("Revise sus credencciales");
        }



    }
}
