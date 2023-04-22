package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * 
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. 
 * 
 * Metodo crearPersona(): el método crear persona, le pide
 * los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(String nombre,int edad,char sexo, double peso, double altura) {
        
//        System.out.println("Ingrese nombre ");
//        String nombre = leer.next();
//        System.out.println("Ingrese edad ");
//        int edad = leer.nextInt();
//        System.out.println("Ingrese sexo ");
//        char sexo = leer.next().charAt(0);
//        System.out.println("Ingrese peso ");
//        double peso = leer.nextDouble();
//        System.out.println("Ingrese altura");
//        double altura = leer.nextDouble();      
        return new Persona(nombre, edad, sexo, peso, altura);
        
    }
    
    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad()>=18;
    }
    
    public int calcularIMC(Persona p) {
        
        double IMC = p.getPeso() / (p.getAltura()*p.getAltura());
        
        if (IMC < 20) {
            return -1;
        }
        else if (IMC > 20 && IMC <=25) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
