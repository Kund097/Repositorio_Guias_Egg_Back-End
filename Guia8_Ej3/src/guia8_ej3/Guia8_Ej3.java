package guia8_ej3;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. 
 * 
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables(arrays), para después calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y
 * cuantos, por encima, y también calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores. Para esto, podemos crear unos métodos
 * adicionales.
 */
public class Guia8_Ej3 {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        Persona[] personas = new Persona[4];
        boolean[] edades = new boolean[4];
        int[] imc = new int[4];
        personas[0] = ps.crearPersona("facu",25,'H',60,1.90);
        personas[1] = ps.crearPersona("juan",17,'H',70,1.80);
        personas[2] = ps.crearPersona("maria",20,'M',60,1.65);
        personas[3] = ps.crearPersona("matias",36,'H',100,1.70);
        System.out.println(personas[0].toString());
        System.out.println(personas[1]);
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int debajoPesoIdeal = 0;
        int mayorEdad = 0;
        int menorEdad = 0;
        
        for (int i = 0; i < personas.length; i++) {
            edades[i] = ps.esMayorDeEdad(personas[i]);
            imc[i] = ps.calcularIMC(personas[i]);
            System.out.println(edades[i]);
            System.out.println(imc[i]);
        }
        
       for (int i = 0; i < personas.length; i++) {
            switch (imc[i]) {
               case -1:
                   debajoPesoIdeal++;
                   break;
               case 0:
                   pesoIdeal++;
                   break;
               default:
                   sobrepeso++;
                   break;
            }
            if (edades[i]) {
                mayorEdad++;
            }
          else {
               menorEdad++;
           }
        }
//        for (int i = 0; i < personas.length;i++) {
//            imc[i] =  ps.calcularIMC(personas[i]);
//
//            if (imc[i] >= 25) {
//                sobrepeso++;
//            } else if (imc[i] >= 18.5 && imc[i] < 25) {
//                pesoIdeal++;
//            } else {
//                debajoPesoIdeal++;
//            }
//        }


        System.out.println("Porcentaje sobrepeso: "+(sobrepeso * 100 / personas.length)+"%");
        System.out.println("Porcentaje debajo del peso ideal: "+(debajoPesoIdeal * 100 / personas.length)+"%");
        System.out.println("Porcentaje peso ideal: "+(pesoIdeal * 100 / personas.length)+"%");
        System.out.println("Porcentaje mayores de edad: "+(mayorEdad *100 / personas.length)+"%");
        System.out.println("Porcentaje menores de edad: "+(menorEdad *100 / personas.length)+"%");       
        
    }

}
