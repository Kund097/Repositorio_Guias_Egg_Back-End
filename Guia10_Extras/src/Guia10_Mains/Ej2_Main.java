package Guia10_Mains;

import Entidades.CantanteFamoso;
import Servicios.CantanteFamosoService;
import java.util.ArrayList;

/**
 * en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de
 * tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
 * cantante y su disco con más ventas por pantalla.
 *
 * @author facun
 */
public class Ej2_Main {

    public static void main(String[] args) {
    
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        cantantes.add(new CantanteFamoso("Michael Jackson","Thriller",1982));
        cantantes.add(new CantanteFamoso("Madonna","The Immaculate Collection",1990));
        cantantes.add(new CantanteFamoso("Elvis Presley","Elvis' Christmas Album",1957));
        cantantes.add(new CantanteFamoso("Whitney Houston","The Bodyguard soundtrack",1992));
        cantantes.add(new CantanteFamoso("Adele","21",2011));
        
        CantanteFamosoService servicio = new CantanteFamosoService();
        servicio.menu(cantantes);
        
    }
    
}
