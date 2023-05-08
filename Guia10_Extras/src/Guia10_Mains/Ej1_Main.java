package Guia10_Mains;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Diseñar un programa que lea una serie de valores numéricos enteros desde
 * el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
 * números termina cuando se introduzca el valor -99. Este valor no se guarda en
 * el ArrayList. A continuación, el programa mostrará por pantalla el número de
 * valores que se han leído, su suma y su media (promedio).
 *
 * @author facun
 */

public class Ej1_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList();
        System.out.println("Ingrese numero");
        Integer num = input.nextInt();
        
        while (num != -99) {
            
            numeros.add(num);
            System.out.println("Ingrese otro numero (-99 para terminar el bucle)");
            num = input.nextInt();
            
        }
        System.out.println("Los numeros ingresados: ");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

}
