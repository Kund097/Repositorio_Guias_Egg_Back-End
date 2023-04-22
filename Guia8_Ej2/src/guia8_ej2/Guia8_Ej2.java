package guia8_ej2;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;


public class Guia8_Ej2 {

  
    public static void main(String[] args) {
        
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = cs.crearCafetera();
        cs.menu(c1);

    }

}
