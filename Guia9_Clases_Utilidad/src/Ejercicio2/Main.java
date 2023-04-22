package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        ParDeNumerosService pds = new ParDeNumerosService();
        ParDeNumeros nuevoPar = pds.crearParDeNumeros();
        pds.menu(nuevoPar);
    }

}
