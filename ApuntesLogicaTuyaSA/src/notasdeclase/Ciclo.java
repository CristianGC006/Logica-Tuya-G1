package notasdeclase;

import java.util.Scanner;

public class Ciclo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Presione 1 para inicializar");
        int init = sc.nextInt();
        while (init != 0) {
            System.out.println("");
            // Un main es para validar algo en una lista de opciones, como un segun, siempre y cuando se tengan  claras
            // las opciones que se usen
            System.out.println("1. Crear un usuario \n" +
                    "2. Iniciar seccion\n" +
                    "3. calcular salario\n" +
                    "4. Validar categoria\n" +
                    "5. Ver datos de usuario\n"+
                    "6. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
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
                case 6:
                    System.out.println("salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
            }
            //Para parar un ciclo


        }
    }
    }
