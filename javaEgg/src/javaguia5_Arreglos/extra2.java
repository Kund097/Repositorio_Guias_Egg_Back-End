/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class extra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número para definir el tamaño de los Vectores: ");
        num = leer.nextInt();

        int[] vector = new int[num];
        int[] vector2 = new int[num];

        llenarmatriz(vector, num);
        llenarmatriz(vector2, num);
        control(vector, vector2, num);

    }

    public static void llenarmatriz(int[] vector, int num) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.print("Escribe el número para completar el Vector:");
            vector[i] = leer.nextInt();

        }
    }

    public static void control(int[] vector, int[] vector2, int num) {

        boolean bandera = false;

        for (int i = 0; i < num; i++) {
            bandera = (vector[i] != vector2[i]);
            if (bandera == true) {
                System.out.println("Los elementos de los vectores son Distintos");
                break;
            }
            
        }
        if (bandera == false) {
            System.out.println("Los elementos de los vectores son Iguales");
        }

    }

}
