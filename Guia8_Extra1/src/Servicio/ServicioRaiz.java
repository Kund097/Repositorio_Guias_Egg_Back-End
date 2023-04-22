package Servicio;

import Entidad.Raiz;

/**
 * RaicesServicio las operaciones que se podrán realizar son las siguientes:
 *
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente fórmula: (b^2)-4*a*c
 *
 * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
 * para que esto ocurra, el discriminante debe ser mayor o igual que 0.
 *
 * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
 * solución, para que esto ocurra, el discriminante debe ser igual que 0.
 *
 * Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime
 * las 2 posibles soluciones.
 *
 * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una
 * única raíz. Es en el caso en que se tenga una única solución posible.
 *
 * Método calcular(): este método llamara tieneRaices() y a tieneRaiz(), y
 * mostrara por pantalla las posibles soluciones que tiene nuestra ecuación con
 * los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrara un mensaje.
 */
public class ServicioRaiz {

    public Raiz crearRaiz(int a, int b, int c) {

        return new Raiz(a, b, c);

    }

    public double getDiscriminante(Raiz r) {
        return (r.getB() * r.getB()) - 4 * r.getA() * r.getC();
    }

    public boolean tieneRaices(Raiz r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raiz r) {
        return getDiscriminante(r) == 0;
    }
    
    public void obtenerRaices(Raiz r) {
        if (tieneRaices(r)) {
            System.out.println("x1 = "+(-r.getB() + Math.sqrt(getDiscriminante(r))) / (2*r.getA()));
            System.out.println("x2 = "+(-r.getB() - Math.sqrt(getDiscriminante(r))) / (2*r.getA()));
        }
    }
    
    public void obtenerRaiz(Raiz r) {
        if (tieneRaiz(r)) {
            System.out.println("x = "+(-r.getB() + Math.sqrt(getDiscriminante(r))) / (2*r.getA()));
        }
    }
    
    public void calcular(Raiz r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        }
        else if (tieneRaiz(r)) {            
            obtenerRaiz(r);
        }
    }
}
