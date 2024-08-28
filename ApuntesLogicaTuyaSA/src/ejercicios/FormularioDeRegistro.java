package ejercicios;
import java.util.Scanner;
public class FormularioDeRegistro {
    public static void  main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("hola");
        System.out.println("ingres su nombre: ");
        String nombre=scanner.nextLine();
        System.out.println("ingrese su apellido: ");
        String apellido=scanner.nextLine();
        System.out.println("ingrese su genero: ");
        String genero=scanner.nextLine();
        System.out.println("ingrese su edad: ");
        int edad= scanner.nextInt();
        System.out.println("ingrese su telefono: ");
        String telefono= scanner.nextLine();
        System.out.println("ingrese su estatura: ");
        String  estatura = scanner.nextLine();
        System.out.println("ingrese su email: ");
        String coreo=scanner.nextLine();
        System.out.println("ingrese su contraseña: ");
        String contraseña= scanner.nextLine();
        System.out.println("ingrese su estado");
        String estado=scanner.nextLine();




        if (edad>=18){
            System.out.println("Ingresas");
        } else {
            System.out.println("No puedes ingresar");
        }

        // Preguntar si desea ver la información ingresada
        System.out.println("¿Desea ver la información ingresada? (true/false): ");
        boolean verInfo = scanner.nextBoolean();

        // Mostrar información si el usuario desea verla
        if (verInfo) {
            System.out.println("\nInformación ingresada:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Género: " + genero);
            System.out.println("Edad: " + edad);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Estatura: " + estatura);
            System.out.println("Email: " + coreo);
            System.out.println("Estado: " + estado);
        } else {
            System.out.println("No se mostrará la información.");
        }


    }
}
