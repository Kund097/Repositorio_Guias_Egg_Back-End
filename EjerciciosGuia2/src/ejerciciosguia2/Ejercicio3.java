/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 * psvm para autocompletar
 * @author facun
 */

public class Ejercicio3 {
   
    public static void main(String[] args) {
        
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después 
toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
    }
    
}
