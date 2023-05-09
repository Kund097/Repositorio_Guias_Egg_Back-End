package Entidades;

/**
 * Implemente un programa para una Librería haciendo uso de un HashSet para
 * evitar datos repetidos. Para ello, se debe crear una clase llamada Libro que
 * guarde la información de cada uno de los libros de una Biblioteca. La clase
 * Libro debe guardar el título del libro, autor, número de ejemplares y número
 * de ejemplares prestados.
 *
 * @author facun
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo: " + titulo + ", Autor: " + autor + ", Cantidad de ejemplares: "
                + "" + numeroEjemplares + ", Ejemplares prestados: " + ejemplaresPrestados + '}';
    }

}
