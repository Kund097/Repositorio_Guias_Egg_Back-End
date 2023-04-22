package guia8_extra1;

import Entidad.Raiz;
import Servicio.ServicioRaiz;


public class Guia8_Extra1 {
    
    public static void main(String[] args) {
        ServicioRaiz sr = new ServicioRaiz();
        Raiz r = sr.crearRaiz(4, 4, 1);
        sr.calcular(r);
    }
    
}
