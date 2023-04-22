package Polimorfismo;

public class Triangulo extends Poligono {

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3, int numeroLados) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo:" + "\nlado1 =" + lado1 + "\nlado2 =" + lado2 + "\nlado3 =" + lado3 + ""
                + "\n Area:" + area();
    }

    @Override
    public double area() {

        if (lado2 == lado3) {
            return (lado1 * lado2) / 2;
        } 
        else {
            int s = (lado1 + lado2 + lado3) / 2;
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        }

    }

}
