package EjercicioExtra4;

import java.util.Scanner;


public class Cocina {
    private String[] ingredientes;

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Cocina() {
    }
    
    public void cargarIngredientes() {
        int cant;
        Scanner ingrediente = new Scanner(System.in);
        System.out.println("Ingrese cantidad ingredientes disponibles en la cocina");
        ingredientes = new String[ingrediente.nextInt()];
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("Ingrese el #"+i+1+" ingrediente disponible en la cocina");
            ingredientes[i] = ingrediente.next();
        }
    }

}
