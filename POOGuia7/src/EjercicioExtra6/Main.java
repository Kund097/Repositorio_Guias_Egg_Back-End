package EjercicioExtra6;


public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Facu",25,15000);
        Empleado e2 = new Empleado("David",43,17000);
        Empleado e3 = new Empleado("Daniel",33,15000);
        
        e1.calcularAumento();
        e2.calcularAumento();
        e3.calcularAumento();
        System.out.println("Aumento de "+e1.getNombre()+" es: "+e1.getSalario());
        System.out.println("Aumento de "+e2.getNombre()+" es: "+e2.getSalario());
        System.out.println("Aumento de "+e3.getNombre()+" es: "+e3.getSalario());
    }
}
