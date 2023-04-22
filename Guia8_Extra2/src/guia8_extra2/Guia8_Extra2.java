package guia8_extra2;

import Entidad.NIF;
import Servicio.ServicioNIF;


public class Guia8_Extra2 {

  
    public static void main(String[] args) {
        
        NIF nuevoNif = new NIF();
        ServicioNIF sN = new ServicioNIF();
        sN.crearNif(nuevoNif);
        sN.mostrarNif(nuevoNif);
        
    }
    
}
