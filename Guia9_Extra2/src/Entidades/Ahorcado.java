package Entidades;

import java.util.Arrays;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
 * contener como atributos, un vector con la palabra a buscar, la cantidad de
 * letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario.
 */
public class Ahorcado {
    private final String[] palabrasParaAdivinar = {"Computadora", "Helado", "Elefante", "Guitarra", 
        "Avion", "Ayer", "Canguro", "Hamburguesa", "Jirafa", "Chocolate", "Cielo", "Cerveza", "Musica", 
        "Cama", "Pinguino", "Pizza", "Perro", "Naranja", "Escalera", "Dinosaurio"};
    private char[] pSecreta;
    private int letrasEncontradas;
    private int jugadasMax;
    private int encontradas;
    private int faltantes;
    private char[] letras;

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(int pos,char encontrada) {
        this.letras[pos] = encontrada;
    }

    public String[] getPalabrasParaAdivinar() {
        return palabrasParaAdivinar;
    }

    public int getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
    

    public Ahorcado() {

    }

    public Ahorcado(char[] pSecreta, int letrasEncontradas, int JugadaMax) {
        this.pSecreta = pSecreta;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = JugadaMax;
        this.letras = new char[pSecreta.length];
        Arrays.fill(this.letras, ' ');
    }

    public char[] getpSecreta() {
        return pSecreta;
    }

    public void setpSecreta(char[] pSecreta) {
        this.pSecreta = pSecreta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadaMax() {
        return jugadasMax;
    }

    public void setJugadaMax(int JugadaMax) {
        this.jugadasMax = JugadaMax;
    }

}
