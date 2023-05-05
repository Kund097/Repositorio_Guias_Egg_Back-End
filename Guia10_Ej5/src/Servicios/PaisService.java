package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente)
 *
 * @author facun
 */
public class PaisService {

    private final TreeSet<Pais> paisesSet = new TreeSet();
    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Pais nuevoPais() {

        System.out.println("Ingrese el nombre del Pais: ");
        String nombre = input.next();
        return new Pais(nombre);
    }

    public void cargarPais() {
        paisesSet.add(nuevoPais());

        if (preguntar()) {
            cargarPais();
        } else {
            mostrarPaises();
        }

    }

    public boolean preguntar() {
        String respuesta;
        boolean bandera = false;
        System.out.println("Desea cargar un nuevo Pais? (S/N)");
        respuesta = input.next();
        if (respuesta.equalsIgnoreCase("s")) {
            bandera = true;
        } else if (respuesta.equalsIgnoreCase("n")) {
            System.out.println("chau loko");
        } else {
            System.out.println("Error ingrese de nuevo");
            preguntar();
        }
        return bandera;
    }

    public void mostrarPaises() {
        System.out.println("-----Paises Cargados-----");
        for (Pais pais : paisesSet) {
            System.out.println(pais);
        }
    }

    /**
     * Por último, al usuario se le pedirá un país y se recorrerá el conjunto
     * con un Iterator, se buscará el país en el conjunto y si está en el
     * conjunto se eliminará el país que ingresó el usuario y se mostrará el
     * conjunto. Si el país no se encuentra en el conjunto se le informará al
     * usuario.
     */
    
    public void eliminarPais() {
        System.out.println("Ingrese el pais a eliminar");
        String paisEliminar = input.next();
        
        Iterator<Pais> it = paisesSet.iterator();
        
        while (it.hasNext()) {
            String elementoActual = it.next().getNombre();
            if (elementoActual.equalsIgnoreCase(paisEliminar)) {
                it.remove();
            }
        }       
        
    }
    
    public void menu() {
        int op; 
        
        do {     
        System.out.println("\n"
                + "\n-----MENU-----"
                + "\n1-AGREGAR PAIS"
                + "\n2-VER PAISES"
                + "\n3-ELIMINAR"
                + "\n4-SALIR");        
        op = input.nextInt();
        switch (op) {
            case 1:
                cargarPais();
                break;
            case 2:
                mostrarPaises();
                break;
            case 3:
                eliminarPais();
                break;
            case 4:
                System.out.println("chau loko");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        } while (op != 4);       
        
    }
    
}
