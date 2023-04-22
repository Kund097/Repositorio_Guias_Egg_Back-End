package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 * En NIFService se dispondrá de los siguientes métodos: Métodos getters y
 * setters para el número de DNI y la letra. Método crearNif(): le pide al
 * usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez
 * calculado, le asigna la letra que le corresponde según Método mostrar(): que
 * nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
 * por ejemplo: 00395469-F).
 *
 * La letra correspondiente al dígito verificador se calculará a traves de un
 * método que funciona de la siguiente manera: Para calcular la letra se toma el
 * resto de dividir el número de DNI por 23 (el resultado debe ser un número
 * entre 0 y 22). El método debe buscar en un array (vector) de caracteres la
 * posición que corresponda al resto de la división para obtener la letra
 * correspondiente. La tabla de caracteres es la siguiente: T R W A G M Y F P D
 * X B N J Z S Q V H L C K E
 *
 *
 */
public class ServicioNIF {

    Scanner entrada = new Scanner(System.in);
    private static final String[] letras = new String[23];

    public static void cargarLetras() {
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";
    }

    public void crearNif(NIF n) {
        cargarLetras();
        System.out.print("Ingrese su DNI: ");
        n.setDNI(entrada.nextLong());       
        String numeroAString = String.valueOf((int) n.getDNI() / 23);
        int pos = Integer.parseInt(numeroAString.substring(0,2));
        System.out.println("su pos es: "+pos);
        n.setLetra(letras[pos]);             
    }

    public void mostrarNif(NIF n) {
        
        System.out.println("El NIF es: "+n.getDNI()+"-"+n.getLetra());
        
    }
}
