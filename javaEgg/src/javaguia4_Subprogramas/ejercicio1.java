/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia4_Subprogramas;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 * @author facun
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Ingrese dos números para realizar operaciones");
        double num1 = read.nextDouble();
        double num2 = read.nextDouble();

        System.out.println("\nMENU");
        System.out.println("------");
        System.out.println("1_ suma");
        System.out.println("2_ resta");
        System.out.println("3_ multiplica");
        System.out.println("4_ divide");
        System.out.print("Ingrese la opción -> ");
        int opc = read.nextInt();

        switch (opc) {
            case 1:
                resultado = suma(num1, num2);
                break;
            case 2:
                resultado = resta(num1, num2);
                break;
            case 3:
                resultado = multiplica(num1, num2);
                break;
            case 4:
                resultado = divide(num1, num2);
                break;
        }

        System.out.println("El resultado de la operación elegida es:" + resultado);
    }

    public static double suma(double n1, double n2) {
        double resul = n1 + n2;
        return resul;

    }

    public static double resta(double n1, double n2) {
        double resul = n1 - n2;
        return resul;

    }

    public static double multiplica(double n1, double n2) {
        double resul = n1 * n2;
        return resul;

    }

    public static double divide(double n1, double n2) {
        double resul = 0;
        if (n2 == 0) {
            System.out.println("No se puede efectuar la operación");
        } else {
            resul = n1 / n2;

        }
        return resul;
    }

}
