/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 * @author facun
 */
public class extra3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;

        System.out.print("Escriba un numero para dimensionar el vector: ");

        num = leer.nextInt();

        int[] vector = new int[num];

        rellenarMatriz(vector, num);

        imprimematriz(vector, num);
        System.out.println(" ");

    }

    public static void rellenarMatriz(int[] vector, int num) {

        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 1000);

        }

    }

    public static void imprimematriz(int[] vector, int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("[| " + vector[i] + " |]");

        }

    }

}
