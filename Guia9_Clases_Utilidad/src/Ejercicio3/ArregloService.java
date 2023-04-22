package Ejercicio3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes
 * métodos: Método inicializarA recibe un arreglo por parámetro y lo inicializa
 * con números aleatorios. paquete servicio, con los siguientes métodos:
 *
 * Método inicializarA recibe un arreglo por parámetro y lo inicializa con
 * números aleatorios.
 *
 * Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 *
 * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 *
 * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo
 * B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 *
 * @author facun
 */
public class ArregloService {

    public static void inicializarA(Double[] arreglo) {
        DecimalFormat df = new DecimalFormat("#,#");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Double.parseDouble(df.format(Math.random()* 10));
        }
    }

    public static void mostrar(Double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

//    public static void ordenarMayorAMenor(Double[] arreglo) {
//        Arrays.sort(arreglo, Comparator.reverseOrder());
//    }

    public static void inicializarB(Double[] arregloB, Double[] arregloA) {
        Arrays.fill(arregloB, 0.5);
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
    }
    
    public static void ordenarMayorAMenor(Double[] vector) {
        Arrays.sort(vector);
        double aux;
        for (int i =0;i < vector.length/2; i++) {
            
            aux = vector[i];
            vector[i] = vector[vector.length-i-1];
            vector[vector.length-i-1] = aux;
        }
    }
}
