/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author facun
 */
public class EjerciciosGuia2 {
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma.

Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
    
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después 
toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 
 */
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Ej1 
        int numero1,numero2,suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
       //Ej2 reutilizando el "leer" del Scanner
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Hola! " + nombre);
       //Ej3
        
        
    }
    
}
