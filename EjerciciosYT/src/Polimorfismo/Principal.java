
package Polimorfismo;
/*
Rectángulos:

Base: 6 unidades, Altura: 4 unidades
Base: 10 unidades, Altura: 8 unidades
Base: 3 metros, Altura: 5 metros
Base: 12 pulgadas, Altura: 9 pulgadas
Base: 7 pies, Altura: 2 pies
Triángulos:

Base: 5 unidades, Altura: 3 unidades
Base: 12 unidades, Altura: 8 unidades
Lado 1: 4 metros, Lado 2: 7 metros, Lado 3: 8 metros
Lado 1: 10 centímetros, Lado 2: 6 centímetros, Lado 3: 8 centímetros
Lado 1: 15 pies, Lado 2: 9 pies, Lado 3: 12 pies

*/

public class Principal {
    public static void main(String[] args) {
        Poligono[] poligonos = new Poligono[11];
        poligonos[0] = new Triangulo(7,8,9,3);
        poligonos[1] = new Triangulo(5,3,3,3);
        poligonos[2] = new Triangulo(12,8,8,3);
        poligonos[3] = new Triangulo(4,7,8,3);
        poligonos[4] = new Triangulo(10,6,8,3);
        poligonos[5] = new Triangulo(15,9,12,3);
        poligonos[6] = new Rectangulo(6,4,2);
        poligonos[7] = new Rectangulo(10,8,2);
        poligonos[8] = new Rectangulo(3,5,2);
        poligonos[9] = new Rectangulo(12,9,2);
        poligonos[10] = new Rectangulo(7,2,2);
        
        for (Poligono poligono: poligonos) {
            System.out.println(poligono.toString());
        }
                
        
    }
}
