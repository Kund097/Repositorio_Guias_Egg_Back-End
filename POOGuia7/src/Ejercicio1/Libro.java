package Ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 */
public class Libro {
    private long isbn;
    private int numeroPaginas;
    private String titulo;
    private String autor;
     // Constructores
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
     // Métodos   
    public void cargarDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el codigo ISBN");
        isbn = leer.nextLong();
        System.out.println("Ingrese el titulo: ");
        titulo = leer.next();
        System.out.println("Ingrese autor: ");
        autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas: ");
        numeroPaginas = leer.nextInt();
    }
    
    public void imprimirDatos(){
        JOptionPane.showMessageDialog(null, "El ISBN es: "+isbn);
        JOptionPane.showMessageDialog(null, "El titulo es: "+titulo);
        JOptionPane.showMessageDialog(null, "El autor es: "+autor);
        JOptionPane.showMessageDialog(null, "El numero de paginas es: "+numeroPaginas);
    }

    public long getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", numeroPaginas=" + numeroPaginas + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
   
}
   