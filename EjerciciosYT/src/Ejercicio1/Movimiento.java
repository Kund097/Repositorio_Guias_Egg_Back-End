package Ejercicio1;

/**
 * Ejercicio 2: Construir un programa que permita dirigir el movimiento de un
 * objeto dentro de un tablero y actualice su posición dentro del mismo. Los
 * movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada
 * movimiento el programa mostrará la nueva dirección elegida y las coordenadas
 * de situación del objeto dentro del tablero.
 */
public class Movimiento {

    private int f = 0;
    private int c = 0;

    public Movimiento() {

    }

    public void puntoDeInicio(String[][] matriz) {

        matriz[f][c] = "*";
    }

    public void arriba(String[][] matriz) {
        matriz[f][c] = " ";

        if ((f < matriz.length) && (f > 0)) {
            f--;
        }
        matriz[f][c] = "*";

    }

    public void abajo(String[][] matriz) {
        matriz[f][c] = " ";

        if ((f < matriz.length - 1) && (f >= 0)) {
            f++;
        }
        matriz[f][c] = "*";

    }

    public void derecha(String[][] matriz) {
        matriz[f][c] = " ";
        
        if ((c < matriz[f].length -1) && (c >= 0)) {
            c++;
        }
        matriz[f][c] = "*";
    }
    
    public void izquierda(String[][] matriz) {
        matriz[f][c] = " ";
        
        if ((c < matriz[f].length) &&(c >0)) {
            c--;
        }
        matriz[f][c] = "*";
    }
}
