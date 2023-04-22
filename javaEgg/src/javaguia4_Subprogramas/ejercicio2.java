/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia4_Subprogramas;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 *
 * @author facun
 */
public class ejercicio2 {

    public static void main(String[] args) {

        String continuar;
        Scanner leer = new Scanner(System.in);

        do {
            Personas();
            System.out.println("Quiere seguir leyendo personas?");
            continuar = leer.nextLine();
        } while (!continuar.equalsIgnoreCase("NO"));

    }

    public static void Personas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre y edad de cada persona");
        String nombre = leer.nextLine();
        int edad = leer.nextInt();
        System.out.println("El nombre es: " + nombre + " y su edad es: " + edad);
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");

        }

    }

}
