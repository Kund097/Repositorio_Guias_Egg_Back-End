package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuentaBancaria() {
        System.out.println("Ingrese numero de cuenta: ");
        int nroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        long dni = leer.nextLong();
        System.out.println("Ingrese saldo actual: ");
        double saldo = leer.nextDouble();
        return new CuentaBancaria(nroCuenta,dni,saldo);
    }
    
    public void ingresarDinero(double dinero, CuentaBancaria cuenta) {
        cuenta.setSaldoActual(dinero+cuenta.getSaldoActual());
    }
    
    public void retirarDinero(double dinero, CuentaBancaria cuenta) {
        if (dinero > cuenta.getSaldoActual()) {
            System.out.println("Saldo insuficiente para retirar");
        }
        else {
            cuenta.setSaldoActual(cuenta.getSaldoActual()-dinero);
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta) {
        double permitido = 0.20;
        cuenta.setSaldoActual(cuenta.getSaldoActual()-(cuenta.getSaldoActual()*permitido));
    }
    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual es: "+cuenta.getSaldoActual());
    }
    
    public void imprimirInformacionCuenta(CuentaBancaria cuenta) {
        System.out.println("Numero de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI: "+cuenta.getDniCliente());
    }
}
