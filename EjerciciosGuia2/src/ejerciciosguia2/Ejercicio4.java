/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author facun
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados");
        int gradosIngresados = leer.nextInt();
        int fahrenheit = 32 + (9 * gradosIngresados / 5);
        
        System.out.println("Grados fahrenheit: "+fahrenheit);
        
        
    }
    
    
}
