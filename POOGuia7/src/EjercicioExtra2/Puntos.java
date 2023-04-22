package EjercicioExtra2;

import java.util.Scanner;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos.
 */
public class Puntos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void solicitarDatos() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor");
        x1 = input.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        y1 = input.nextInt();
        
        System.out.println("Ingrese el terser valor");
        x2 = input.nextInt();

        System.out.println("Ingrese el cuarto valor");
        y2 = input.nextInt();
        

    }
     public double calculoDistancia(){
         double res = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
         return res;
     }
}
