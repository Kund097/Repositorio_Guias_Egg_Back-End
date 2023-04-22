package EjercicioExtra3;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author facun
 */
public class Juego {

    private int numero1;
    private int numero2;
    private int aciertos;
    private int acJugador1;
    private int acJugador2;

    public Juego() {
        acJugador1 = 0;
        acJugador2 = 0;
    }

    public Juego(int numero, int aciertos, int posibilidades) {
        this.numero1 = numero;
        this.aciertos = aciertos;
        acJugador1 = 0;
        acJugador2 = 0;
    }

    public int getNumero() {
        return numero1;
    }

    public void setNumero1(int numero) {
        this.numero1 = numero;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void ingresoDeDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Jugador-A  --Elige un Numero a Adivinar");
        numero1 = input.nextInt();
        System.out.println("Ingrese la Cantidad de Intentos permitidos");
        aciertos = input.nextInt();
    }

    public void iniciarjuego() {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        for (int i = 0; i < aciertos; i++) {
            System.out.println("Jugador-B  --Adivine el numero");
            numero2 = input.nextInt();
            if (numero2 == numero1) {
                System.out.println("Felicidades Has GANADO!!!");
                acJugador2++;
                return;
            } else if (numero2 > numero1) {
                System.out.println("El Numero que ingresaste Es Mayor");

            } else {
                System.out.println("El Numero que Ingreaste Es Menor");
            }
        }
        System.out.println(" ");
        acJugador1++;
        System.out.println("[" + "GAME OVER" + "]" + " ¡¡¡son of the Bitch!!!");

    }

    public void Puntaje() {
        System.out.println("Puntaje Jugador A: " + acJugador1);
        System.out.println("Puntaje Jugador B:" + acJugador2);
    }
}
