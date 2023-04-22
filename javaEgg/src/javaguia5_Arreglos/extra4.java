/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son:
 *
 * Primer trabajo práctico evaluativo 10% Segundo trabajo práctico evaluativo
 * 15% Primer Integrador 25% Segundo integrador 50%
 *
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 * Al final del programa los profesores necesitan obtener por pantalla la
 * cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban
 * los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 * @author facun
 */
public class extra4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double notas[] = new double[10];
        int tp1, tp2, i1, i2, ap = 0, des = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("ALUMNO: " + (i + 1));
            System.out.print("Ingrese nota del primer trabajo práctico: ");
            tp1 = leer.nextInt();
            System.out.print("Ingrese nota del segundo trabajo práctico: ");
            tp2 = leer.nextInt();
            System.out.print("Ingrese nota del primer integrador: ");
            i1 = leer.nextInt();
            System.out.print("Ingrese nota del segundo integrador: ");
            i2 = leer.nextInt();

            notas[i] = 0.1 * tp1 + 0.15 * tp2 + i1 * 0.25 + i2 * 0.5;

            if (notas[i] < 7) {
                des++;
            } else {
                ap++;
            }
        }

        System.out.print("| ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Alumno " + (i + 1) + " - " + notas[i] + " | ");
        }
        System.out.println("");

        System.out.println(" Cantidad de aprobados : " + ap);
        System.out.println(" Cantidad de desaprobados : " + des);
    }

}
