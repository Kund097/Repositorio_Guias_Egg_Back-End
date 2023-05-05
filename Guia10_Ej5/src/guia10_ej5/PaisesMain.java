package guia10_ej5;

import Servicios.PaisService;

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
public class PaisesMain {

    public static void main(String[] args) {

        PaisService ps = new PaisService();
        ps.menu();
        
    }

}
