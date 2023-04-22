/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author facun
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona nuevaPersona = new Persona();
        Persona nuevaPersona2 = new Persona("Facundo");
        
        System.out.println("Persona 1 "+nuevaPersona);
        System.out.println("Persona 2 "+nuevaPersona2.nombre);
    }
    
}
