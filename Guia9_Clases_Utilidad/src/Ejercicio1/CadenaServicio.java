package Ejercicio1;

import java.util.Scanner;

/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
cuántas veces se repite el carácter en la frase, por ejemplo: 

Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.

Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.

Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class CadenaServicio {

    private final Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.print("Ingrese frase: ");
        return new Cadena(entrada.nextLine());
    }

    public int contarVocales(Cadena frase) {

        int contador = 0;

        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            String vocal = frase.getFrase().substring(i, i + 1).toLowerCase();
            if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
                contador++;
            }

        }
        return contador;
    }

    public void invertirFrase(Cadena frase) {
        StringBuilder fraseInvertida = new StringBuilder(frase.getFrase()).reverse();
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar
    cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(String letra, Cadena frase) {
        int contador = 0;
        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase 
    que compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(String frase, Cadena fraseActual) {
        int resultado = Integer.compare(frase.length(), fraseActual.getLongitudFrase());

        if (resultado == 0) {
            System.out.println("Son iguales");
        } else if (resultado > 0) {
            System.out.println("La nueva frase es mayor");
        } else {
            System.out.println("La nueva frase es menor");
        }

    }

    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase 
    Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases(String fraseNueva, Cadena frase) {

        System.out.println("Las frases unidas: " + frase.getFrase() + " " + fraseNueva);

    }

    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
     */
    public void reemplazar(String letra, Cadena frase) {
        String nuevaFrase = frase.getFrase().replace('a',letra.charAt(0));
        /*
        String newStr = str.replace('o', 'x');
        System.out.println(newStr);  // "Hxla mundx!"
         */
        System.out.println("La nueva frase es: "+nuevaFrase);
    }

    /*
        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            //nuevaFrase = frase.getFrase().substring(i, i+1);
            if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                nuevaFrase += letra;
            } else {
                nuevaFrase += frase.getFrase().substring(i, i + 1);
            }
        }
        System.out.println("La nueva frase es: " + nuevaFrase);
    */


 /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra 
    que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(Cadena frase) {
        System.out.println("ingrese el caracter a buscar en la Frase ");
        String caracter = entrada.next();
        return frase.getFrase().contains(caracter);
    }

    public void menu(Cadena frase) {
        int op;
        do {

            System.out.println("MENU");
            System.out.println("1. Contar vocales");
            System.out.println("2. Invertir frase");
            System.out.println("3. Contar veces que se repite una letra");
            System.out.println("4. Comparar longitud con otra frase");
            System.out.println("5. Unir frases");
            System.out.println("6. Reemplazar letras");
            System.out.println("7. Comprobar si contiene una letra");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("la cantidad de vocales: " + contarVocales(frase));
                    break;
                case 2:
                    invertirFrase(frase);
                    break;
                case 3:
                    System.out.print("Ingrese letra a buscar: ");
                    vecesRepetido(entrada.next(), frase);
                    break;
                case 4:
                    System.out.print("Ingrese frase: ");
                    compararLongitud(entrada.next(), frase);
                    break;
                case 5:
                    System.out.print("Ingrese frase a unir: ");
                    unirFrases(entrada.next(), frase);
                    break;
                case 6:
                    System.out.print("Ingrese letra a reemplazar: ");
                    reemplazar(entrada.next(), frase);
                    break;
                case 7:
                    if (contiene(frase)) {
                        System.out.println("Si contiene el caracter");
                    } else {
                        System.out.println("No contiene el caracter");
                    }
                    break;
                case 0:
                    System.out.print("Hasta pronto...");
                    break;
                default:
                    System.out.print("Opcion invalida");
            }

        } while (op != 0);

    }

}
