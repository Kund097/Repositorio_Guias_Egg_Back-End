/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ejercicio1 {

    /**
     * Crear un programa que dado un número determine si es par o impar.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroIngresado;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numeroIngresado = leer.nextInt();
        if (numeroIngresado % 2 == 0) {

            System.out.println("Es par");

        } else {
            System.out.println("Es impar");
        }

    }

}
