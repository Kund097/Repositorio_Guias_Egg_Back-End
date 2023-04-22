package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima.
 *
 * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe
 * el tamaño de la taza y simula la acción de servir la taza con la capacidad
 * indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se
 * sirve lo que quede. El método le informará al usuario si se llenó o no la
 * taza, y de no haberse llenado en cuanto quedó la taza.
 *
 * Método vaciarCafetera(): pone la cantidad de café actual en cero.
 *
 * Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(int tamTaza, Cafetera c) {
        if (tamTaza > c.getCantidadActual()) {
            tamTaza = c.getCantidadActual();
            System.out.println("No se llenó la taza, la taza quedó: " + tamTaza);
            c.setCantidadActual(0);
        } else {
            c.setCantidadActual(c.getCantidadActual() - tamTaza);
            System.out.println("Se llenó la taza");
        }
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
    }

    public void agregarCafe(int cantCafe, Cafetera c) {
        if (cantCafe > c.getCapacidadMaxima()) {
            System.out.println("Se superó la capacidad maxima, sobró: " + (c.getCapacidadMaxima() - cantCafe));
            c.setCantidadActual(c.getCapacidadMaxima());
        } else {
            c.setCantidadActual(cantCafe);
        }
    }

    public Cafetera crearCafetera() {

        System.out.println("Ingrese capacidad maxima de la cafetera: ");
        int capacidadCafetera = leer.nextInt();
        System.out.println("Ingrese cantidad actual de la cafetera: ");
        int cantidadActual = leer.nextInt();
        return new Cafetera(capacidadCafetera, cantidadActual);

    }
    
    public void mostrarDatos(Cafetera c) {
        System.out.println(c);
    }

    public void menu(Cafetera c) {
        int op;
        do {
            System.out.println("1 - Servir taza");
            System.out.println("2 - Vaciar cafetera");
            System.out.println("3 - Agregar cafe");
            System.out.println("4 - Llenar cafetera");
            System.out.println("5 - Ver datos cafetera");
            System.out.println("6 - Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese tamaño de la taza");
                    servirTaza(leer.nextInt(), c);
                    break;
                case 2:
                    vaciarCafetera(c);
                    break;
                case 3:
                    System.out.println("Ingrese cantidad de café");
                    agregarCafe(leer.nextInt(), c);
                    break;
                case 4:
                    llenarCafetera(c);
                    break;
                case 5:
                    mostrarDatos(c);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (op != 6);

    }

}
