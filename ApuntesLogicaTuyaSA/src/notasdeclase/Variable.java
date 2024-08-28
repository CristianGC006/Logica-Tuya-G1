package notasdeclase;

public class Variable {
    public static void main (String [] args){

        int idCliente; //Esto es declarar una variable

        idCliente= 12345678; //Esto es inicializar una variable

        String nombreCliente= "Gustavo Petro"; // Declaracion e inicializacion

        int num1, num2;
        num1=5;
        num2=10;

        byte edad=127;
        short laMesada=32767;
        short ahorroMesada=laMesada;
        //Casteo de variables

        int ahorro= (int) ahorroMesada;
        ahorro =ahorroMesada+laMesada;
        System.out.println(ahorro);

        //Parseo de variables
        //Ejercicio, sacar el promedio de las edades
        int edad1=19;
        String edad2="22";
        //Aca se hizo el parseo de las variables
         int edadConvertida = Integer.parseInt(edad2);
        System.out.println(edadConvertida);
        //Se usa float debido a que este tipo de variable tiene decimales
        float promedio=(edad1+edadConvertida)/2;
        System.out.println("el promedio de la edad es: "+ promedio);

        //Parseo de numero a String

        String prodioConv = promedio + "";
        System.out.println(prodioConv);

        //Tipo de datos

        //A los floats se les debe colocar la letra "f" al final
        float nota =4.5f;
        //A los longuers se debe colocar una "l" al final de los numeros
        long bigNumber=654131654989l;








    }
}
