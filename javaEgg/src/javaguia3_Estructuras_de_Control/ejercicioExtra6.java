/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ejercicioExtra6 {
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      int pers , c ;
      double alt , prom1 , prom2 , suma , suma2 ;
      
        System.out.println("Ingrese la cantidad de personas");
        pers = leer.nextInt();
        suma = 0;
        suma2 = 0;
        c=0 ;
       
        for (int i = 0; i < pers; i++) {
            System.out.println("Ingrese altura de la persona numero " + (i+1) );
        alt = leer.nextDouble();
        if (alt < 1.6) {
            suma +=  alt;
            c++;            
        }
        suma2 += alt;
        
        }
        if (c==0) {
            System.out.println("No se ingresaron alturas menores a 1,60 Mts");
        } else {
      prom1 = suma / c ;  
      System.out.println("El promedio de las personas menores a 1,60 Mts es igual a : " + prom1 );
        }
        prom2 = suma2 / pers;
        System.out.println("El promedio general de las alturas es igual a : " + prom2);
    }
}
