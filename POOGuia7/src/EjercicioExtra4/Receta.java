package EjercicioExtra4;

import java.util.Scanner;

/**
 * Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por
 * nombre y para obtener la lista de recetas que se pueden preparar con los
 * ingredientes disponibles en la cocina.
 */
public class Receta {

    private String nombre;
    private String[] ingredientes;
    private String instrucciones;

    public Receta() {
    }

    public Receta(String nombre, String instrucciones) {
        this.nombre = nombre;
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes() {
        Scanner ingrediente = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de ingredientes de la receta: "+nombre);
        int cant = ingrediente.nextInt();
        ingredientes = new String[cant];
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("Ingrese el ingrediente de la receta: " + this.nombre);
            this.ingredientes[i] = ingrediente.next();
        }
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void ingresarIngredientes() {

    }

    public void buscarReceta(String nombre, String[] receta) {

    }

    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", ingredientes=" + ingredientes + ", instrucciones=" + instrucciones + '}';
    }

}
