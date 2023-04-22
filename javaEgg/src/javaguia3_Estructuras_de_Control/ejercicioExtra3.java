/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ejercicioExtra3 {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner ( System.in);
      String letra ;
        System.out.println("Ingrese la letra a determinar");
        letra = leer.next();
        letra = letra.toUpperCase();
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("La letra ingresada es una vocal");
        }else {
            System.out.println("La letra ingresada es una consonante o un numero");
        }
      
    }
    
}
