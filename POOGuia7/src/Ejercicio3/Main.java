/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author facun
 */
public class Main {
    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println("El numero 1 es: "+op1.getNumero1());
        System.out.println("El numero 2 es: "+op1.getNumero2());
        System.out.println(op1.sumar());
        System.out.println(op1.restar());
        System.out.println(op1.multiplicar());
        System.out.println(op1.dividir());
    }
}
