package EjercicioExtra3;

/**
 *
 * @author facun
 */
public class Main {

    public static void main(String[] args) {

        Juego play = new Juego();

        for (int i = 0; i < 3; i++) {
            play.ingresoDeDatos();
            play.iniciarjuego();
        }

        play.Puntaje();

    }
}
