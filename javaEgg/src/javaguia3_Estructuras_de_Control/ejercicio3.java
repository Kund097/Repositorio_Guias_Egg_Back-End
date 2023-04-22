/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 *
 * @author facun
 */
public class ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.nextLine();
        if (frase.length() == 8) {

            System.out.println("Es correcto :D");

        } else {

            System.out.println("Es incorrecto D:");
        }

    }

}
