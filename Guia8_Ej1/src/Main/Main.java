package Main;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;


public class Main {

    public static void main(String[] args) {

        CuentaBancariaServicio Cb1 = new CuentaBancariaServicio();
        CuentaBancaria Cb = Cb1.crearCuentaBancaria();
        Cb1.ingresarDinero(12000, Cb);       
        Cb1.extraccionRapida(Cb);
        Cb1.retirarDinero(300, Cb);
        Cb1.consultarSaldo(Cb);
        Cb1.imprimirInformacionCuenta(Cb);

    }

}
