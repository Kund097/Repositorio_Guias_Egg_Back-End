package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circunferencia nuevoCalculo = new Circunferencia(123);
        
        nuevoCalculo.area();
        nuevoCalculo.perimetro();
        System.out.println(nuevoCalculo);
        
        nuevoCalculo.crearCircunferencia();
        nuevoCalculo.area();
        nuevoCalculo.perimetro();
        System.out.println(nuevoCalculo);
    }
}
