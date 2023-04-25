/*
 Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
 * Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
 * Nota: para crear un vector de objetos la definición es la siguiente:
 * Objeto nombreVector[] = new Objeto[];
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Arrays;

/**
 *
 * @author facun
 */
public class EstudianteServicio {

    public static Estudiante crearEstudiante(String nombre, double nota) {

        return new Estudiante(nombre, nota);
    }

    public static double calcularPromedioClase(Estudiante[] clase) {
        double totalNotas = 0;

        for (Estudiante notas : clase) {
            totalNotas += notas.getNota();
        }

        return totalNotas / clase.length;
    }

    public static Estudiante[] mayorPromedio(Estudiante[] clase, double promedio) {
        Estudiante[] promedioMayor = new Estudiante[clase.length];
        int pos = 0;

        for (int i = 0; i < clase.length; i++) {

            if (clase[i].getNota() > promedio) {

                promedioMayor[pos] = clase[i];
                pos++;

            }

        }
        return promedioMayor;
    }

    public static void mostrarPromedios(Estudiante[] clase) {
        double promedioClase = calcularPromedioClase(clase);
        System.out.print("El promedio de la clase es: " + Math.round(Math.abs(promedioClase))
                + "\nLos estudiantes con notas mayores al promedio son: "
                + "\n" + Arrays.toString(mayorPromedio(clase, Math.round(Math.abs(promedioClase)))));

    }

}
