package EjercicioExtra5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner dinero = new Scanner(System.in);
        Cuenta c1 = new Cuenta(10000,"Facu");
        System.out.println("Bienvenido "+c1.getTitular());
        System.out.println("Ingrese cantidad de dinero a retirar");
        c1.retirarDinero(dinero.nextInt());
    }
}
