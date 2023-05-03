package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 *
 *
 * @author facun
 */
public class ServicioAlumno {

    private ArrayList<Alumno> alumnos;

    private final Scanner input = new Scanner(System.in);

    public void crearAlumno() {
        alumnos = new ArrayList();
        Alumno a1 = new Alumno();
        System.out.print("Ingrese nombre del alumno: ");
        a1.setNombre(input.next());
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota #" + (i + 1) + " del alumno");
            notas.add(input.nextInt());
        }
        a1.setNotas(notas);
        alumnos.add(a1);
    }

    public void fabricaDeAlumnos() {
        System.out.println("Bienvenido a la fabrica de alumnos");
        do {
            crearAlumno();
            System.out.println("Desea agregar otro alumno? (S/N)");

        } while (input.next().equalsIgnoreCase("s"));

        buscarAlumno();
    }

    /**
     * * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main.
     */
    public void buscarAlumno() {
        System.out.print("Ingrese el nombre del alumno a buscar:");
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(input.next())) {
                notaFinal(alumno);
            } else {
                System.out.println("No se encontro el alumno");
            }
        }
    }

    public void notaFinal(Alumno a1) {
        Integer totalNotas = 0;
        double promedio;
        for (int i = 0; i < a1.getNotas().size(); i++) {
            totalNotas += a1.getNotas().get(i);
        }
        promedio = (Math.round(totalNotas / a1.getNotas().size()));
        System.out.println("La nota final de " + a1.getNombre() + " es: " + promedio);
    }
}
