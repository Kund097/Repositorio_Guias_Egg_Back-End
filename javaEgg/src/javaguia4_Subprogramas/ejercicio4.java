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
public class ejercicio4 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        primos(num);
        System.out.println("el numero ingresado es " + primos(num));
    }

    public static boolean primos(int num) {
        int cont = 0;
        boolean ver = true;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                cont = cont + 1;
            }
            if (cont > 2) {
                i = num;
                ver = false;
            }
        }

        return ver;
    }

}
