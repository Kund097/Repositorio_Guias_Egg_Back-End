/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia4_Subprogramas;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void).
 *
 * El cambio de divisas es: 
 * 0.86 libras es un 1 € 
 * 1.28611 $ es un 1 
 * € 129.852 yenes es un 1 €
 *
 * @author facun
 */
public class ejercicio3 {

  public static void main(String[] args) {
        System.out.println("ingrese la cantidad de euros que desea convertir: ");
        Scanner leer = new Scanner (System.in);
        int euro=leer.nextInt();
        System.out.println("MENU");
            System.out.println("Elija la moneda a convertir:");
            System.out.println("a.dolar");
            System.out.println("b.yenes");
            System.out.println("c.libras");
        String opcion = leer.next();
        convers (opcion, euro);
        
    }
    public static void convers(String opcion, int euro){
        switch(opcion){
            case "a":
                System.out.println("con "+ euro +" euros, obtendras "+ (euro*1.28611) + " dolares");
                break;
            case "b":
                System.out.println("con "+ euro +" euros, obtendras "+ (euro*129.852) + " yenes");
                break;
            case "c":
                System.out.println("con "+ euro +" euros, obtendras "+ (euro*0.86) + " libras");
                break;
                    
        }
                
        
    }
}

