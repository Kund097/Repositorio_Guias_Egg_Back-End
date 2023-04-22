/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 * @author facun
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            vector[i] = (int)(Math.random() * 10 + 1);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("Ingrese un numero a buscar");
        int numIngresado = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            
            if (numIngresado == vector[i]) {
                
                System.out.println("Se encontró en la posicion: "+i);
                contador++;
                
            }
            
        }
        
         if (contador >1) {
            
             System.out.println("El numero está repetido");
             
        }
        
    }

}
