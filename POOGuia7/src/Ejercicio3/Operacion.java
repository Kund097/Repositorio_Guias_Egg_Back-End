package Ejercicio3;

import javax.swing.JOptionPane;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: 
 * 
 * Método constructor con todos los atributos pasados por parámetro. 
 * 
 * Método constructor sin los atributos pasados por parámetro. 
 * 
 * Métodos get y set. 
 * 
 * Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. 
 * 
 * Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. 
 * 
 * Método restar(): calcular la resta de los
 * números y devolver el resultado al main 
 * 
 * Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main 
 * 
 * Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 * @author facun
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion() {
        
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    public void crearOperacion() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
    }
    
    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }
    
    public int restar() {
       int resta = numero1 - numero2; 
       return resta;
    }
    
    public int multiplicar() {
        int multiplicacion;
        if (numero1 != 0 && numero2 != 0) {
            multiplicacion = numero1 * numero2;
        } else {
            JOptionPane.showMessageDialog(null, "Error, no se puede multiplicar por 0");
            return 0;
        }
        return multiplicacion;
    }
    
    public int dividir() {
        int division;
        if (numero1 != 0 && numero2 != 0) {
            division = numero1 / numero2;
        } else {
            JOptionPane.showMessageDialog(null, "Error, no se puede dividir por 0");
            return 0;
        }
        return division;
    }
}
