package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Rectangulo nuevoRectangulo = new Rectangulo(10,5);
        nuevoRectangulo.superficie();
        nuevoRectangulo.perimetro();
        System.out.println(nuevoRectangulo.area);
        System.out.println(nuevoRectangulo.perimetro);
        nuevoRectangulo.dibujarRectangulo();        
    }
}
