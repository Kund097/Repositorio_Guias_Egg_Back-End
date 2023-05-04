package Servicios;

import Entidades.Pelicula;
import static Utilidades.Comparadores.ordenarPeliculasDuracionMayorAMenor;
import static Utilidades.Comparadores.ordenarPeliculasDuracionMenorAMayor;
import static Utilidades.Comparadores.ordenarPorDirectorAlfabeticamente;
import static Utilidades.Comparadores.ordenarPorTituloAlfabeticamente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
 * usuario si quiere crear otra Pelicula o no. Después de ese bucle realizaremos
 * las siguientes acciones:
 */
public class PeliculaService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Pelicula> peliculas;

    public Pelicula crearPelicula() {

        System.out.print("Ingrese el titulo de la pelicula: ");
        String pelicula = input.next();
        System.out.print("Ingrese el director de la pelicula: ");
        String director = input.next();
        System.out.print("Ingrese la duracion en horas de la pelicula: ");
        int duracion = input.nextInt();
        return new Pelicula(pelicula, director, duracion);

    }

    public void cargarPeliculas() {
        peliculas = new ArrayList<>();
        String respuesta;
        do {
            peliculas.add(crearPelicula());
            System.out.print("Desea crear otra pelicula? (S/N)");
            respuesta = input.next();
        } while (respuesta.equalsIgnoreCase("S"));

        mostrarPeliculas();
        mostrarPeliculasMasDeUnaHora();
        ordenarPorDuracionMayorMenor();
        ordenarPorDuracionMenorAMayor();
        ordenarPorDirector();
        ordenarPorTitulo();
    }

    /**
     * • Mostrar en pantalla todas las películas. 
     * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.  
     * 
     *  
     * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public void mostrarPeliculas() {
        System.out.println("\n-------------Todas las peliculas-------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }      
    }
    
    public void mostrarPeliculasMasDeUnaHora() {      
        System.out.println("\n-------------Peliculas con una duración mayor a 1 hora-------------");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracionEnHoras() > 1) {
                System.out.println(pelicula);
            }
        }
    }
    
    /**
     * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
     */
    
    public void ordenarPorDuracionMayorMenor() {
        Collections.sort(peliculas, ordenarPeliculasDuracionMayorAMenor);
        System.out.println("\n-------------Peliculas ordenadas por duración de mayor a menor-------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    /**
     * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
     */
    
    public void ordenarPorDuracionMenorAMayor() {
        Collections.sort(peliculas, ordenarPeliculasDuracionMenorAMayor);
        System.out.println("\n-------------Peliculas ordenadas por duración de menor a mayor-------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    
    /**
     * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     */
    
    public void ordenarPorTitulo() {
        Collections.sort(peliculas, ordenarPorTituloAlfabeticamente);
        System.out.println("\n-------------Peliculas ordenadas por titulo alfabéticamente-------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
    }
    
    /**
     * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public void ordenarPorDirector() {
        Collections.sort(peliculas, ordenarPorDirectorAlfabeticamente);
        System.out.println("\n-------------Peliculas ordenadas por director alfabéticamente-------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getDirector());
        }
    }
}
