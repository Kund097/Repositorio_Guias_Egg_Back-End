/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author facun
 */
public class Main {
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena = cs.crearCadena();
        cs.menu(cadena);
    }
}
