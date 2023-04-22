/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 * @author facun
 */
public class ejercicioExtra8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        int contador = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        do {
            contador++;
            System.out.println("Ingrese un numero");
            numeroIngresado = leer.nextInt();

            if (numeroIngresado % 2 == 0) {

                cantidadPares++;

            } else {

                cantidadImpares++;

            }
            if (numeroIngresado % 5 == 0) {

                break;

            }

        } while (numeroIngresado % 5 == 0);

        System.out.println("La cantidad de numeros ingresados: "+contador);
        System.out.println("La cantidad de numeros pares: "+cantidadPares);
        System.out.println("La cantidad de numeros impares: "+cantidadImpares);
        
    }

}
