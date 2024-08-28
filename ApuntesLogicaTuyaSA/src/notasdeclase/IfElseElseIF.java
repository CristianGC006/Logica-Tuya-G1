package notasdeclase;

import java.util.Scanner;

public class IfElseElseIF {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        double balance=170000;sc.nextDouble();
        System.out.println("ingrese el valor de la compra");
        double purchase=sc.nextDouble();

        System.out.println("numero de cuotas");
        double cuotas=sc.nextDouble();
        double valCuotas;
        valCuotas=(purchase/cuotas);
        balance-=purchase;
        if (purchase>0&&purchase<=balance){
            System.out.println("compra realizada. \n su saldo es: "+balance +"\n sus cuotas totales son: "+valCuotas);
        } else if (purchase<=0) {
            System.out.println("El valor debe ser mayor a 0");

        }
        else {
            System.out.println("Saldo insuficiente");
        }


    }
}
