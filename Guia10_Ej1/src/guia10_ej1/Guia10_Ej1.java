package guia10_ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de
 * tipo String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList. 2. Continuando el ejercicio anterior, después de
 * mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista
 * con un Iterator, se buscará el perro en la lista. Si el perro está en la
 * lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
 * y se mostrará la lista ordenada.
 *
 * @author facun
 */
public class Guia10_Ej1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> perros = new ArrayList<>();
        do {

            System.out.println("Ingrese la raza del perro");
            perros.add(input.next());
            System.out.println("Desea ingresar otra raza?(s/n)");

        } while (!input.next().equalsIgnoreCase("n"));

        System.out.println("Las razas actuales son: \n" + perros.toString());
        Collections.sort(perros);
        
        Iterator<String> it = perros.iterator();
        System.out.print("Ingrese una raza a buscar y eliminar de la lista: ");
        String perro = input.next();
        Boolean fueEliminado = false;
        while (it.hasNext()) {

            if (it.next().equalsIgnoreCase(perro)) {
                it.remove();
                fueEliminado = true;
            } 
        }

        if (fueEliminado) {
            System.out.println("La raza "+perro+" fue eliminado con exito");
            System.out.println("Los perros restantes \n"+perros.toString());
        }
        else {
            System.out.println("Los perros restantes \n"+perros.toString());
            System.out.println(perros.toString());
        }
        
    }
}
