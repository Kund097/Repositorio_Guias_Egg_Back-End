package Ejercicio1;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese filas y columnas del tablero");
        Movimiento mover = new Movimiento();
        int filas = leer.nextInt();
        int columnas = leer.nextInt();
        boolean continuar = true;
        String[][] tablero = Tablero.getTablero(filas,columnas);
        
        do {
            System.out.println("Ingrese una acción");
            System.out.println("1-ARRIBA");
            System.out.println("2-DERECHA");
            System.out.println("3-ABAJO");
            System.out.println("4-IZQUIERDA");
            System.out.println("5-SALIR");
   
            switch (leer.nextInt()) {
                case 1:
                    mover.arriba(tablero);
                    ImprimirMatriz.imprimir(tablero);
                    break;
                case 2:
                    mover.derecha(tablero);
                    ImprimirMatriz.imprimir(tablero);
                    break;
                case 3:
                    mover.abajo(tablero);
                    ImprimirMatriz.imprimir(tablero);
                    break;
                case 4:
                    mover.izquierda(tablero);
                    ImprimirMatriz.imprimir(tablero);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Acción incorrecta");
            }
            
        } while (continuar);
        
        
    }
}
