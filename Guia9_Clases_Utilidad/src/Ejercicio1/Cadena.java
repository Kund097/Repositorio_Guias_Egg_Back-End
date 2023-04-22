package Ejercicio1;

/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo 
frase solamente. Agregar getters y setters. El constructor con frase como atributo 
debe setear la longitud de la frase de manera automática.
*/
public class Cadena {

    private String frase;
    private int longitudFrase;

    public Cadena(String frase) {
        this.frase = frase;
        longitudFrase = frase.length();
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        longitudFrase = frase.length();
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
    
    
    
    
}
