
package Polimorfismo;



public class Rectangulo extends Poligono{
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2, int numeroLados) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {        
        return lado1*lado2;       
    }

    @Override
    public String toString() {
        return "Rectangulo:" + "\nlado1 =" + lado1 + "\nlado2 =" + lado2+""
                + "\n area ="+area();
    }   
    
}
