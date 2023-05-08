package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * en otro bucle, crear un menú que le de la opción al usuario de agregar un
 * cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista
 * con todos los cambios.
 *
 * @author facun
 */
public class CantanteFamosoService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public void menu(ArrayList<CantanteFamoso> cantantes) {
        int op;
        do {
            
            System.out.println("MENU "
                    + "\n1 - AGREGAR CANTANTE"
                    + "\n2 - MOSTRAR CANTANTES"
                    + "\n3 - ELIMINAR CANTANTE"
                    + "\n4 - SALIR");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                        agregarCantante(cantantes);
                    break;
                case 2:
                        mostrarCantantes(cantantes);
                    break;
                case 3:
                        eliminarCantante(cantantes);
                    break;
                case 4:
                        System.out.println("hasta la vista");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
            
        } while (op!=4);
        
        
    }
    public void agregarCantante(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("Ingrese nombre del cantante");
        String nombre = input.next();
        System.out.println("Ingrese disco mas vendido");
        String disco = input.next();
        System.out.println("Ingrese año del disco");
        int anio = input.nextInt();
        cantantes.add(new CantanteFamoso(nombre, disco, anio));
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantes) {
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);
        }
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("Ingrese nombre del cantante a eliminar");
        String cantanteEliminar = input.next();
        Iterator<CantanteFamoso> it = cantantes.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(cantanteEliminar)) {
                it.remove();
                System.out.println("Se eliminó el cantante de la lista");
                return;
            }
        }
        System.out.println("No se encontró el cantante");
    }
    /*
    // FORMA DE ELIMINAR DE LA LISTA NO EFICIENTE SEGUN CHATGPT
    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("Ingrese el nombre del cantante a eliminar");       
        String cantanteEliminar = input.next();
        int posEliminar = -1;
        for (CantanteFamoso cantante : cantantes) {
            if (cantante.getNombre().equalsIgnoreCase(cantanteEliminar)) {
                posEliminar = cantantes.indexOf(cantante);
            }
        }
        if (posEliminar >= 0) {
            cantantes.remove(posEliminar);
        }
        else {
            System.out.println("No se encontro el cantante");
        }
    }
    */
    
}
