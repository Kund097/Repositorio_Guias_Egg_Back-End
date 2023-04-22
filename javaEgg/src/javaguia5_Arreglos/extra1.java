/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 * @author facun
 */
public class extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, resultadoSuma;

        System.out.println("Escribe un número para determinar el tamaño del Vector");
        num = leer.nextInt();

        int[] vector = new int[num];

        llenarMatriz(vector, num);
        resultadoSuma = suma(vector, num);
        System.out.println("La Suma de los Números del Vector es: " + resultadoSuma);

    }

    public static void llenarMatriz(int[] vector, int num) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el Número para el Espacio en el Vector");

            vector[i] = leer.nextInt();

        }
    }

    public static int suma(int[] vector, int num) {
        int sumaVector = 0;

        for (int i = 0; i < num; i++) {
            sumaVector += vector[i];
        }
        return sumaVector;
    }
    
}
