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
public class ejercicioExtra1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.*/
    
    Scanner read = new Scanner (System.in);
    int minutos;
    int dia;
    int hora;
    
        System.out.println("Ingrese minutos a convertir");
        minutos= read.nextInt();
        
    dia = minutos / 1440;
    hora = (minutos % 1440) / 60;
    
        System.out.println("los minutos convertidos serían: " + dia + " días" + hora + " horas" );
       
    
    
    }
    
}
