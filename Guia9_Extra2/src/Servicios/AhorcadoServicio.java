package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner input = new Scanner(System.in);

    /**
     * 
     *  Asigno una palabra de una posicion random
     * @param j1
     */
    public void asignarPalabra(Ahorcado j1) {
        int pos = (int) (Math.random()*20);
        j1.setpSecreta(j1.getPalabrasParaAdivinar()[pos].toCharArray());   
        //System.out.println("la palabra secreta es: "+Arrays.toString(j1.getpSecreta()));
    }
    
    public void mostrarLetrasEncontradas(Ahorcado j1,char encontrada,String pos) {
        int posicion;
        for (int i = 0; i < pos.length(); i++) {           
            posicion =(int)(pos.charAt(i) - (int) '0');
            j1.getLetras()[posicion] = encontrada;
        }
        System.out.println(" "+Arrays.toString(j1.getLetras()));
    }
    
    public void letrasIngresadas(Ahorcado j1, String letra) {
        j1.setIngresadas(j1.getIngresadas()+letra);
        System.out.println("Letras ingresadas hasta ahora: "+Arrays.toString(j1.getIngresadas().toCharArray()));
    }
    
    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
    en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que 
    ingresó el usuario
     */
    public void crearJuego(Ahorcado j1) {
        System.out.println("Ingrese la cantidad de intentos para perder");
        j1.setJugadaMax(input.nextInt());
        j1.setFaltantes(j1.getpSecreta().length);
        j1.setLetras(j1.getpSecreta().length);
        Arrays.fill(j1.getLetras(), ' ');
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.
    */
    public void longitud(Ahorcado j1) {
        System.out.println("Longitud de la palabra: " + j1.getpSecreta().length);
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y 
    busca si la letra ingresada es parte de la palabra o no. También informará 
    si la letra estaba o no.
     */
    public void buscar(Ahorcado j1, String letra) {
        if (Arrays.toString(j1.getpSecreta()).toLowerCase().contains(letra.toLowerCase())) {
            System.out.println("La letra está en la palabra");
        } else {
            System.out.println("La letra no está en la palabra");
        }
    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
    muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
    además deberá devolver true si la letra estaba y false si la letra no estaba, 
    ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas(Ahorcado j1, String letra) {
        boolean bandera = false;
        char encontrada = ' ';
        String posEncontrada = "";
        for (int i = 0; i < j1.getpSecreta().length; i++) {
            if (Character.toLowerCase(j1.getpSecreta()[i]) == Character.toLowerCase(letra.charAt(0))) {
                j1.setEncontradas(j1.getEncontradas()+1);
                j1.setFaltantes((j1.getpSecreta().length - j1.getEncontradas()));
                encontrada = letra.charAt(0);
                posEncontrada += String.valueOf(i);
                bandera = true;
            }
        }
        System.out.print("Cantidad de letras; "
                + "\nEncontradas: " + j1.getEncontradas()
                + "\nFaltantes: " + j1.getFaltantes());
        mostrarLetrasEncontradas(j1,encontrada,posEncontrada);
        return bandera;
    }

    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
     */
    public void intentos(Ahorcado j1, boolean resultado) {
        if (!resultado) {
            j1.setJugadaMax(j1.getJugadaMax() - 1);
        }
        System.out.println("Los intentos restantes: " + j1.getJugadaMax());
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos 
    previamente mencionados e informará cuando el usuario descubra toda la 
    palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void juego() {
        String letra;
        boolean resultado;
        Ahorcado j1 = new Ahorcado();
        asignarPalabra(j1);
        crearJuego(j1);
        do {
            System.out.println("\nIngrese letra a buscar");
            letra = input.next();
            longitud(j1);
            buscar(j1, letra);
            resultado = encontradas(j1, letra);
            letrasIngresadas(j1, letra);
            intentos(j1, resultado);
        } while (j1.getJugadaMax() != 0 && j1.getFaltantes() != 0);

        if (j1.getJugadaMax() == 0) {
            System.out.println("Perdiste pa");
        }
        else {
            System.out.println("Ganaste");
        }
        System.out.println("La palabra secreta era: "
                + "\n"+Arrays.toString(j1.getpSecreta()));
        
    }

}
