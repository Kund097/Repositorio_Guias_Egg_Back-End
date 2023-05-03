package Entidades;

/*
 * 4. Un cine necesita implementar un sistema en el que se puedan cargar
 * peliculas. Para esto, tendremos una clase Pelicula con el título, director y
 * duración de la película (en horas). Implemente las clases y métodos
 * necesarios para esta situación, teniendo en cuenta lo que se pide a
 * continuación:
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Integer duracionEnHoras;

    public Pelicula(String titulo, String director, int duracionEnHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionEnHoras = duracionEnHoras;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(Integer duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    @Override
    public String toString() {
        return "Titulo: " +titulo + " director: " + director + " Duracion: " + duracionEnHoras;
    }
    
    
}
