/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3_Estructuras_de_Control;

import java.util.Scanner;

/**Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
 * llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
 * el primer carácter tiene que ser X y el último tiene que ser una O.
   Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
*  especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
*  distinta de FDE, que no respete el formato se considera incorrecta.
   Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
*  correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
*  cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 *
 * @author facun
 */
public class ejercicio7 {
    
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       String word=" ";
       int c=0;
       int c1=0;
      do{
        System.out.println("Ingrese una cadena de 5 caracteres.  ");
      word= read.nextLine();
      if(!word.equals("&&&&&")){
      if(word.startsWith("X") && word.endsWith("O") && word.length()<=5){
          c++;
      }else{
          c1++;
      }
      }
    }while(!(word.equals("&&&&&")));
        System.out.println("La cantidad de correctas son "+c);
        
        System.out.println("La cantidad de incorrectas son "+c1);
      }
}
    

