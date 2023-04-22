/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
 * solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

 *
 * @author facun
 */
public class ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int valor;

        do {

            System.out.println("Ingrese un valor limite positivo");
            valor = leer.nextInt();

        } while (valor <= 0);

        int numIngresado = 0;

        for (int i = 0; numIngresado < valor; i++) {

            System.out.println("Ingrese un numero a sumar");
            numIngresado += leer.nextInt();
            System.out.println("Total sumado: " + numIngresado);

        }

        System.out.println("Se superó el limite inicial: [" + valor + "]");

    }

}
