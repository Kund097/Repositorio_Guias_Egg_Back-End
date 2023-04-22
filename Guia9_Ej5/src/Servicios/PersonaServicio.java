
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
* Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:

* Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
* Retornar el objeto Persona creado.

* Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
* fecha de nacimiento y la fecha actual.

* Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
* la persona es menor que la edad consultada o false en caso contrario.

* Método mostrarPersona que muestra la información de la persona deseada.
 */
public class PersonaServicio {
    Scanner input = new Scanner(System.in);
    public Persona crearPersona() {
        System.out.print("Ingrese nombre: ");
        String nombre = input.next();
        System.out.print("Ingrese dia de nacimiento: ");
        int dia = input.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        int mes = input.nextInt();
        System.out.print("Ingrese año de nacimiento: ");
        int anio = input.nextInt();
        return new Persona(nombre,new Date(anio,mes,dia));
    }
    
    public void calcularEdad() {
        
    }
}
