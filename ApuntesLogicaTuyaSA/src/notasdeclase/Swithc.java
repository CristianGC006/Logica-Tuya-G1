package notasdeclase;
import  java.util.Scanner;
public class Swithc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Un main es para validar algo en una lista de opciones, como un segun, siempre y cuando se tengan  claras
        // las opciones que se usen
        System.out.println("Seleccione 1. Crear un usuario"+
                            "2. Iniciar seccion"+
                            "3.calcular salario"+
                            "4.Validar categoria"+
                "Ver datos de usuario");
        int opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("crear usuario");
                break;
            case 2:
                System.out.println("Iniciar seccion");
                break;
            case 3:
                System.out.println("calcular salario");
                break;
            case 4:
                System.out.println("Validar categoria");
                break;
            case 5:
                System.out.println("ver datos de usuario");
                break;
            default:
                System.out.println("Selecciona una opcion valida");
        }
    }

}