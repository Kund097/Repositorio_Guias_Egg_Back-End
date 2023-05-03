package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author facun
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPeliculasDuracionMayorAMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracionEnHoras().compareTo(t.getDuracionEnHoras());
        }
    };
    public static Comparator<Pelicula> ordenarPeliculasDuracionMenorAMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracionEnHoras().compareTo(t1.getDuracionEnHoras());
        }
    };

    public static Comparator<Pelicula> ordenarPorTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
