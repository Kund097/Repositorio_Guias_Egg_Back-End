package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ProductoService {

    private final HashMap<String, Double> productos = new HashMap<>();
    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void cargarProducto() {
        String nombre;
        Double precio;
        System.out.println("Ingrese nombre del producto");
        nombre = input.next();
        System.out.println("Ingrese el precio del producto");
        precio = input.nextDouble();
        productos.put(nombre, precio);

        System.out.println("Quiere cargar otro producto?(S/N)");
        String respuesta = input.next();
        if (respuesta.equalsIgnoreCase("s")) {
            cargarProducto();
        } else {
            System.out.println("saliendo de carga de productos...");
        }

    }

    /**
     * introducir un elemento, modificar su precio, eliminar un producto y
     * mostrar los productos que tenemos con su precio (Utilizar Hashmap). El
     * HashMap tendrá de llave el nombre del producto y de valor el precio.
     * Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    public void modificarPrecio() {
        String nombre;
        Double precio;
        System.out.println("Ingrese el producto que desea cambiar el precio");
        nombre = input.next();
        System.out.println("Ingrese el nuevo precio");
        precio = input.nextDouble();
        for (Map.Entry<String, Double> elemento : productos.entrySet()) {
            if (elemento.getKey().equalsIgnoreCase(nombre)) {
                elemento.setValue(precio);
            }
        }
    }

    public void mostrarProductos() {

        for (Map.Entry<String, Double> elemento : productos.entrySet()) {
            System.out.println("Producto: " + elemento.getKey() + ""
                    + "\nPrecio: " + elemento.getValue());
        }
    }

    public void menu() {
        int op;
        do {
            System.out.println("-----MENU-----"
                    + "\n1-Cargar Producto"
                    + "\n2-Modificar Precio"
                    + "\n3-Mostrar productos"
                    + "\n4-Salir");
            
            op = input.nextInt();
            
            switch (op) {
                
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    System.out.println("hasta la vista");
                    break;
                default:
                    System.out.println("Opción invalida");
            }

        } while (op != 4);

    }
}
