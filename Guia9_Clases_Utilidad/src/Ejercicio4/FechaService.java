package Ejercicio4;

import java.util.Date;
import java.util.Scanner;

/**
 * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
 * FechaService, en paquete Servicios, que tenga los siguientes métodos: 
 * 
 * Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
 * Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar
 * el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
 * 
 * Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el
 * constructor vacío de la clase Date. Ejemplo: Date fechaActual = new Date(); El método debe retornar 
 * el objeto Date. 
 * 
 * Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
 * de años entre una y otra (edad del usuario).
 *
 * @author facun
 */
public class FechaService {

    private final Scanner input = new Scanner(System.in);
    
    public Date fechaNacimiento() {
        System.out.print("Ingrese dia de nacimiento: ");
        int dia = input.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        int mes = input.nextInt();
        System.out.print("Ingrese año de nacimiento: ");
        int año = input.nextInt();
        return new Date(año-1900,mes-1,dia);
    }
    
    public Date fechaActual() {
        return new Date();
    }
    
    public long diferencia(Date fechaNac,Date fechaActual) {
        return fechaActual.getYear() - fechaNac.getYear();
    }
    public static boolean verdadero() {
        return false;
    }
}
