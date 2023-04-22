/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 *
 * @author facun
 */
public class ejercicioExtra7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantidadNumeros;
        do {

            System.out.println("Ingrese la cantidad de numeros a ingresar");
            cantidadNumeros = leer.nextInt();

        } while (!(cantidadNumeros > 0));

        int contador = 0;
        int acumulador = 0;
        int maximo = 0;
        int minimo = 0;
        double promedio;
        boolean bandera = false;
/*
        do {
            contador++;
            System.out.println("Ingrese un numero");
            int valorIngresado = leer.nextInt();
            acumulador += valorIngresado;
            if (valorIngresado > maximo) {

                maximo = valorIngresado;

            }
            if (!bandera) {

                minimo = valorIngresado;
                bandera = true;

            }
            if (valorIngresado < minimo) {

                minimo = valorIngresado;

            }

        } while (contador != cantidadNumeros);
*/       

        while (contador != cantidadNumeros) {
            
            contador++;
            System.out.println("Ingrese un numero");
            int valorIngresado = leer.nextInt();
            acumulador += valorIngresado;
            
            if (valorIngresado > maximo) {
                
                maximo = valorIngresado;
                
            }
            if (!bandera) {
                
                minimo = valorIngresado;
                bandera = true;
                
            }
            if (valorIngresado < minimo) {
                
                minimo = valorIngresado;
                
            }
            
        }
        
        
        promedio = ((double) acumulador / (double) cantidadNumeros);
        System.out.println("El maximo es: "+maximo);
        System.out.println("El minimo es: "+minimo);
        System.out.println("El promedio es: "+promedio);

    }

}
