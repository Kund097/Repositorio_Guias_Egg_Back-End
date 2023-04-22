package EjercicioExtra4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        Cocina c1 = new Cocina();
        c1.cargarIngredientes();
        
        Receta[] recetas = new Receta[3];
        Receta r1 = new Receta();
        r1.setNombre("Asado");
        r1.setIngredientes();
        
        Receta r2 = new Receta();
        r2.setNombre("Ensalada");
        r2.setIngredientes();
        
        Receta r3 = new Receta();
        r3.setNombre("Pan");
        r3.setIngredientes();
        
        recetas[0] = r1;
        recetas[1] = r2;
        recetas[2] = r3;
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
