/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author facun Ejercicio 12 Crea un procedimiento EsMultiplo que reciba los
 * dos números pasados por el usuario, validando que el primer número múltiplo
 * del segundo e imprima si el primer número es múltiplo del segundo, sino
 * informe que no lo son
 */
public class ejercicio12Teoria {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        System.out.println(" Los numeros son multiplos " + EsMultiplo(num1, num2));
    }

    public static boolean EsMultiplo(int num1, int num2) {

        boolean es_multiplo;

        if (num1 % num2 == 0) {
            es_multiplo = true;
        } else {
            es_multiplo = false;
        }
        return es_multiplo;
    }

}


