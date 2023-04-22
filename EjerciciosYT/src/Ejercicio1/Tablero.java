package Ejercicio1;



public class Tablero {
    
    public static String[][] getTablero(int filas,int columnas) {
        String[][] tablero = new String[filas][columnas];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ";
            }
        }
        return tablero;
    }    
    
}
