/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**Realizar un programa que pida dos números enteros positivos por teclado y 
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
 * y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
 * si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea 
 * salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
 * programa, caso contrario se vuelve a mostrar el menú.
 *Suma,restar,mult,dividir,salir
 * @author facun
 */
public class ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero1, numero2;
        boolean salir = true;
        String respuesta;
        int operacion;
        double division;
        do {

            do {

                System.out.println("Ingrese dos numeros positivos");
                numero1 = leer.nextInt();
                numero2 = leer.nextInt();

            } while (numero1 <= 0 && numero2 <= 0);

            System.out.println("MENU");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");

            operacion = leer.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (numero1 * numero2));
                    break;
                case 4:
                    division = Double.valueOf(numero1) / Double.valueOf(numero2);
                    System.out.println("La division es: " + (division));
                    break;
                case 5:
                    System.out.println("Estas seguro que deseas salir del programa? S/N");
                    respuesta = leer.next();

                    if (respuesta.equalsIgnoreCase("S")) {

                        salir = false;
                        break;

                    } else {

                        break;

                    }
            }

        } while (salir);

    }

}
