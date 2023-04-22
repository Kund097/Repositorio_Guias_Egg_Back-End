/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ejercicio11Teoria {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una frase");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();

        System.out.println(reemplazo(frase));

    }

    public static String reemplazo(String frase) {

        int largo = frase.length();
        String aux = "";

        for (int x = 0; x < largo; x++) {
            
            switch (frase.substring(x, x + 1)) {

                case "a" :
                    aux += "@";
                    break;
                case "e":
                    aux += "#";
                    break;
                case "i":
                    aux += "$";
                    break;
                case "o":
                    aux += "&";
                    break;
                case "u":
                    aux += "*";
                    break;

                default:
                    aux += frase.substring(x, x + 1);

            }
        }

        return aux;
    }
}
