/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *
 * @author facun
 */
public class ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño del cuadrado");
        int lados = leer.nextInt();
        for (int i = 0; i < lados; i++) {

            for (int j = 0; j < lados; j++) {

                if (i == 0 || i == lados - 1 || j == 0 || j == lados - 1) {

                    System.out.print("* ");

                } else {

                    System.out.print("  ");

                }

            }

            System.out.println("");

        }

    }

}
