/**
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
 * Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
 * Calcular y mostrar el promedio de notas de todo el curso
 * Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
 * Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
 * Nota: para crear un vector de objetos la definición es la siguiente:
 * Objeto nombreVector[] = new Objeto[];
 *
 */
package Entidades;

/**
 *
 * @author facun
 */
public class Estudiante {

    private String nombre;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + Math.round(Math.abs(nota)) + '}';
    }

    
}
