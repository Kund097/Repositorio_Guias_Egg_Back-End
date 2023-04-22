/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia5_Arreglos;


import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author facun
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int[10];
        int contUnDigito=0;
        int contDosDigito =0;
        int contTresDigito =0;
        int contCuatroDigito =0;
        int contCincoDigito =0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese un numero");
            vector[i] = leer.nextInt();
            //System.out.print("["+vector[i]+"]");
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            if (vector[i] <= 9) {
                
                contUnDigito++;
                
            } else if (vector[i] <= 99) {
                
                contDosDigito++;
                
            } else if (vector[i] <= 999) {
                
                contTresDigito++;
                
            } else if (vector[i] <= 9999) {
                
                contCuatroDigito++;
            
            } else{
                
                contCincoDigito++;
                
            }
            
        }
        
        System.out.println("numeros de 1 digito"+contUnDigito);
        System.out.println("numeros de 2 digito"+contDosDigito);
        System.out.println("numeros de 3 digito"+contTresDigito);
        System.out.println("numeros de 4 digito"+contCuatroDigito);
        System.out.println("numeros de 5 digito"+contCincoDigito);
        
    }
    
}
