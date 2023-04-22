/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
 * Nota: investigar la función equals() en Java.
 * @author facun
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Es correcto");
        }
        else {
            System.out.println("Es incorrecto");
        }
        
    }
    
}
