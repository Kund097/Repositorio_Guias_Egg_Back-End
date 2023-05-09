package Servicios;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class LibroService {

    private static final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public static void agregarLibro(ArrayList<Libro> libros) {
        String respuesta;
        do {
            System.out.println("Ingrese titulo del libro");
            String titulo = input.next();
            System.out.println("Ingrese autor del libro");
            String autor = input.next();
            System.out.println("Ingrese cantidad de ejemplares");
            int cantEjemplares = input.nextInt();
            libros.add(new Libro(titulo, autor, cantEjemplares, 0));
            System.out.println("Desea agregar otro libro?(S/N)");
            respuesta = input.next();
        } while (respuesta.equalsIgnoreCase("S"));

    }

}
