
package Ejercicio1;

public class ImprimirMatriz {
    
    public ImprimirMatriz(String[][]matriz) {
        
    }
    public static void imprimir(String[][]matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println("");
        }
    }
}
