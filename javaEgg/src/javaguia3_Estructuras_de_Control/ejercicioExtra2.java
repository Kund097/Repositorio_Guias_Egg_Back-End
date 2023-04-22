/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;


/**
 *
 * @author facun
 */
public class ejercicioExtra2 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
       
       
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        
        
        System.out.println("la Variable A inicial es: " + A);
        System.out.println("la Variable B inicial es: " + B);
        System.out.println("la Variable C inicial es: " + C);
        System.out.println("la Variable D inicial es: " + D);
        
        aux = B;
        B = C;
        
        C = A;
        
        A = D;
        
        D = aux;
 
        System.out.println("la Variable A final es: " + A);
        System.out.println("la Variable B final es: " + B);
        System.out.println("la Variable C final es: " + C);
        System.out.println("la Variable D final es: " + D);
        
    }
    
}
