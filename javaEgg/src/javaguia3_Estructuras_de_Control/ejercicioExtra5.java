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
 * Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
* real que represente el costo del tratamiento (previo al descuento) y determine el 
* importe en efectivo a pagar por dicho socio.

 */
public class ejercicioExtra5 {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner ( System.in);  
        System.out.println("Indique valor tratamiento");
        int valTrat = leer.nextInt();
        System.out.println("Ingrese tipo de Socio");
        String socio = leer.next();
        socio = socio.toUpperCase();
        
        switch(socio){
            case "A" : 
                    
                    System.out.println("El valor a pagar del tratamiento con monto inicial " +
                             valTrat + " del Socio A es: " + (valTrat*0.5));
            break;
            case "B" : 
                    
                    System.out.println("El valor a pagar del tratamiento con monto inicial " +
                             valTrat + " del Socio B es: " + (valTrat*0.65));
            break;
            case "C" : 
                    System.out.println("El valor a pagar del tratamiento con monto inicial " +
                             valTrat + " del Socio C es: " + valTrat);
            break;
            
            default : System.out.println("La opción ingresado no es válida ");
            break;
        
        
        }
    }
}
