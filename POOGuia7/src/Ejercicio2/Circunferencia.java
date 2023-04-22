package Ejercicio2;

import javax.swing.JOptionPane;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro. Métodos get
 * y set para el atributo radio de la clase Circunferencia. Método para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. Método area(): para calcular el área de la circunferencia
 * (Area=〖π*radio〗^2). Método perimetro(): para calcular el perímetro
 * (Perimetro=2*π*radio).
 */
public class Circunferencia {

    private double radio;
    private double area;
    private double perimetro;

    //Métodos
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
    }

    public void area() {
        area = Math.PI * (radio * radio);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void perimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
