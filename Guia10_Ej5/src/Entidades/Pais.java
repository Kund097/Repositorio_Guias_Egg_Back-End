package Entidades;

/**
 *
 * @author facun
 */
public class Pais implements Comparable<Pais>{
    
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais: " + nombre;
    }

    @Override
    public int compareTo(Pais t) {
        return nombre.compareTo(t.getNombre());
    }
    
    
    
}
