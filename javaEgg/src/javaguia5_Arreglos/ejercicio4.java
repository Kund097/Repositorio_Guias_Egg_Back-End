/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Random;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author facun
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Random random = new Random();
        int matriz[][] = new int[4][4];
        System.out.println("Matriz Original----");
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = random.nextInt(9);
                
                System.out.print("["+matriz[i][j]+"]");
                
            }
            
            System.out.println("");
        }
        
        //mostrar matriz traspuesta
        System.out.println("Matriz traspuesta----");
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print("["+matriz[j][i]+"]");
                
            }
            System.out.println("");
        }
    }

}
