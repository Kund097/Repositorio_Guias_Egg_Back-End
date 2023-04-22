/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
 *
 * @author facun
 */
public class extra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String sopaLetras[][] = new String[20][20];
        String palabras[] = new String[5];
        String palabra;
        for (int i = 0; i < 5; i++) {

            do {
                System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                palabra = leer.next();

            } while (!(palabra.length() >= 3 && palabra.length() <= 5));

            palabras[i] = palabra;

        }
        cargarMatriz(sopaLetras, palabras);
        llenarMatriz(sopaLetras);
        imprimirMatriz(sopaLetras);
    }

    public static void cargarMatriz(String matriz[][], String letras[]) {
        Random rdm = new Random();
        int fila;
        for (int i = 0; i < letras.length - 1; i++) {
            int cont = 0;
            fila = rdm.nextInt(19);
            for (int j = 0; j < matriz.length - 1; j++) {

                if (cont != letras[i].length()) {

                    matriz[fila][j] = letras[i].substring(cont, cont + 1);
                    cont++;

                } else {

                    break;

                }

            }

        }

    }
    
    public static void llenarMatriz(String matriz[][]){
        
        Random valorRandom = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (matriz[i][j] == null) {
                    
                    matriz[i][j] = Integer.toString(valorRandom.nextInt(10));
                    
                }
                
            }
            
        }
        
    }
    
    public static void imprimirMatriz(String matriz[][]) {

        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz1[j] + "]");
            }
            System.out.println("");
        }

    }
}
