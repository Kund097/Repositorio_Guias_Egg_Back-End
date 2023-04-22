package Ejercicio2;

import java.util.Scanner;


/**
 * Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá
 * además implementar los siguientes métodos: 
 * 
 * Método mostrarValores que muestra cuáles son los dos números guardados. 
 * 
 * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor. 
 * 
 * Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
 * Previamente se deben redondear ambos valores. 
 * 
 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la
 * raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ParDeNumerosService {
  
    private final Scanner input = new Scanner(System.in);
    
    public ParDeNumeros crearParDeNumeros() {       
        return new ParDeNumeros();       
    }
    
    public String mostrarValores(ParDeNumeros numeros) {
       return "ParDeNumeros: " + "num1=" + numeros.getNum1() + ", num2=" + numeros.getNum2(); 
    }
    
    public double devolverMayor(ParDeNumeros numeros) {
        return Math.max(numeros.getNum1(), numeros.getNum2());
    }
    
    public double devolverMenor(ParDeNumeros numeros) {
        return Math.min(numeros.getNum1(), numeros.getNum2());
    }
    
    public String calcularPotencia(ParDeNumeros numeros){
        return "La potencia es: "+Math.pow(devolverMayor(numeros),devolverMenor(numeros));
    }
    
    public String calcularRaiz(ParDeNumeros numeros) {
        return "La raiz de "+devolverMenor(numeros)+" menor de los dos valores es: "+Math.sqrt(Math.abs(devolverMenor(numeros)));
    }
    
    public void menu(ParDeNumeros par) {
        int op;
        do {
            System.out.println("MENU");
            System.out.println("1. Mostrar numeros");
            System.out.println("2. Calcular potencia");
            System.out.println("3. Calcular raiz");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println(mostrarValores(par));
                    break;
                case 2:
                    System.out.println(calcularPotencia(par));
                    break;
                case 3:
                    System.out.println(calcularRaiz(par));
                    break;
                case 0:
                    System.out.println("Hasta la vista... baby");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            
        } while (op != 0);
        
    }
}
