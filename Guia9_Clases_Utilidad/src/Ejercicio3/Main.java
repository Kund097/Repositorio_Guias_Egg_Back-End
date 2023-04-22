package Ejercicio3;

/**
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo
 * B de 20 números reales.
 *
 * @author facun 
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A,
 * inicializar B, mostrar A y B.
 */
public class Main {

    public static void main(String[] args) {
        Double[] arregloA = new Double[50];
        Double[] arregloB = new Double[20];

        System.out.println("Arreglo A");
        ArregloService.inicializarA(arregloA);
        ArregloService.mostrar(arregloA);
        ArregloService.ordenarMayorAMenor(arregloA);
        ArregloService.inicializarB(arregloB, arregloA);
        System.out.println("Arreglo A ordenado Mayor a Menor");
        ArregloService.mostrar(arregloA);
        System.out.println("ArregloB");
        ArregloService.mostrar(arregloB);
    }
}
