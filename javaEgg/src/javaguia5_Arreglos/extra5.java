/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 * @author facun
 */
public class extra5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas y columnas");
        int fila = leer.nextInt();
        int columna = leer.nextInt();
        int matriz[][] = new int[fila][columna];
        int resultado;
        cargarMatriz(matriz);
        System.out.println("Matriz");
        imprimirMatriz(matriz);
        resultado = calcularElementos(matriz);
        System.out.println("La suma total de los elementos es: "+resultado);

    }

    public static void cargarMatriz(int matriz[][]) {
        Random rdm = new Random();
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = rdm.nextInt(9);

            }

        }

    }

    public static void imprimirMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static int calcularElementos(int matriz[][]){
        
        int suma = 0;
        for (int i = 0; i <matriz.length ;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
