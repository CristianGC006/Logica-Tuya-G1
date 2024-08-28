package ejercicios;
import java.util.Scanner;

public class Login {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        String userName="pp@gmail.com";
        int key=1234;
        String nameUser="Gustavo Petro";

       //Interfaz
        System.out.println("ingrese su usuario:");
        String userInput= scanner.nextLine();
        System.out.println("ingrese su contraseña:");
        int keyInput= scanner.nextInt();

        if (userName.equals(userInput)&& key==keyInput){
            System.out.println("bienvenido, " +nameUser);
        }else{
            System.out.println("revise sus credenciales");
        }
    }
}
