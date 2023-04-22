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
public class ejercicio6 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int fila, col, diag;

        llenarMatriz(matriz, 3, 3);
        mostrar(matriz, 3, 3);

        col = contarColumna(matriz, 3, 3);
        fila = contarFila(matriz, 3, 3);
        diag = contarDiag(matriz, 3, 3);
        if (col == diag && fila == diag) {
            System.out.println("La matriz es mágica.");
            System.out.println("La suma es: " + diag);
        } else {
            System.out.println("La matriz no es mágica.");
        }

    }

    public static void llenarMatriz(int[][] matriz, int m, int n) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese la componente [" + i + "," + j + "]=");
                matriz[i][j] = leer.nextInt();
            }

        }
    }

    public static void mostrar(int[][] matriz, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int contarFila(int[][] matriz, int m, int n) {
        int fila, fila1;
        boolean cond;
        cond = true;
        fila1 = 0;
        fila = 0;
        for (int j = 0; j < n; j++) {
            fila1 = fila1 + matriz[0][j];
        }

        for (int i = 1; i < m; i++) {
            fila = 0;
            for (int j = 0; j < n; j++) {
                fila = fila + matriz[i][j];
            }
            if (cond == true) {
                cond = fila == fila1;
            }
        }
        if (cond == false) {
            fila = 0;
        }

        return fila;
    }

    public static int contarColumna(int[][] matriz, int m, int n) {
        int col, col1;
        boolean cond;
        cond = true;
        col1 = 0;
        col = 0;
        for (int j = 0; j < n; j++) {
            col1 = col1 + matriz[j][0];
        }

        for (int i = 1; i < m; i++) {
            col = 0;
            for (int j = 0; j < n; j++) {
                col = col + matriz[j][i];
            }
            if (cond == true) {
                cond = col == col1;
            }
        }
        if (cond == false) {
            col = 0;
        }

        return col;
    }

    public static int contarDiag(int[][] matriz, int m, int n) {
        int diag;
        diag = 0;

        for (int i = 0; i < m; i++) {
            diag = diag + matriz[i][i];
        }

        return diag;
    }

}
