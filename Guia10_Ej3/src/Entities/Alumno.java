package Entities;

import java.util.ArrayList;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas.
 *
 * @author facun
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        this.notas = new ArrayList();
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }   
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas.toString() + '}';
    }
    
    
    
}
