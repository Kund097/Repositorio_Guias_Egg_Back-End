
import Entidades.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList(); // ARRAYLIST los elementos se ordenan por inserción
        int x = 20;
        int x1 = 10;
        int x2 = 30;
        int x3 = 20;
        int x4 = 70;
        numbers.add(x); // agregamos el valor x en la posicion 0
        numbers.add(x1);
        numbers.add(x2);
        numbers.add(x3);
        numbers.add(x4);

        TreeSet<String> list = new TreeSet(); // los elementos del conjunto se ordenan de menor a mayor
        String y = "Hola Mundo";
        String y1 = "Hola Mundo Cruel";
        String y2 = "Hola Mundo 3";
        String y3 = "Hola Mundo 4";
        String y4 = "Hola Mundo 6";
        list.add(y); // agregamos el valor y en la posicion 0
        list.add(y1);
        list.add(y2);
        list.add(y3);
        list.add(y4);

        HashMap<Integer, String> persons = new HashMap();
        int DNI = 40450295;
        String nombre = "Facundo";
        int DNI1 = 13028473;
        String nombre1 = "Carlos";
        persons.put(DNI, nombre); // agregamos la llave y el valor
        persons.put(DNI1, nombre1);
        //numbers.remove(Integer.valueOf(20)); // eliminamos el primer elemento que coincida con el objeto de la list 
        //persons.remove(40450295); // Eliminamos el elemento ingresando su llave
        numbers.forEach((number) -> {
            System.out.println(number);
        });

        list.forEach((frase) -> {
            System.out.println(frase);
        });

        for (Map.Entry<Integer, String> elementos : persons.entrySet()) {
            System.out.println("DNI es: " + elementos.getKey() + ""
                    + "\nEl nombre es: " + elementos.getValue());
        }
        Collections.sort(numbers);
        System.out.println(numbers.toString()); // ordena de forma ascendete la colección

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Hola Mundo 4") || element.equals("Hola Mundo")) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
        
        
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        
        ArrayList<Libro> libros = new ArrayList<>();
        
        libros.add(new Libro("Dross","Luna de plutón"));
        libros.add(new Libro("Dross","El libro negro"));
        libros.add(new Libro("Dross","Escape"));
        libros.add(new Libro("Dross","Valle de la calma"));
        
        System.out.println("La cantidad de libros: "+libros.size());
//        for (Libro elemento : libros) {
//            
//            System.out.println(elemento.getTitulo());
//            
//        }
        System.out.println(libros);
      
    }
}
