package Entidades;

import java.util.Scanner;

/**
 * Un profesor particular está dando cursos para grupos de cinco alumnos y
 * necesita un programa para organizar la información de cada curso. Para ello,
 * crearemos una clase entidad llamada Curso, cuyos atributos serán:
 * nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o
 * tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String
 * de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
 */
public class Curso {

    private final Scanner input = new Scanner(System.in);
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos;

    public Curso() {
        alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
    alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta 
    información en un arreglo e iterar con un bucle, solicitando en cada repetición 
    que se ingrese el nombre de cada alumno.
     */
    public void cargarAlumnos() {
        for (String alumno : alumnos) {
            System.out.print("Ingrese el nombre del alumno: ");
            alumno = input.next();
        }
    }

    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, 
    turno (mañana o tarde),  precioPorHora y alumnos.
     */
    public void crearCurso() {
        System.out.println("Ingrese el nombre del curso");
        setNombreCurso(input.nextLine());
        System.out.println("Ingrese cantidad de horas por dia");
        setCantidadHorasPorDia(input.nextInt());
        System.out.println("Ingrese cantidad de dias por semana");
        setCantidadDiasPorSemana(input.nextInt());
        System.out.println("Ingrese turno (mañana o tarde)");
        setTurno(input.next());
        System.out.println("Ingrese precio por hora");
        setPrecioPorHora(input.nextInt());
        cargarAlumnos();
        calcularGananciaSemanal();
    }

    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
    el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
    */
    
    public void calcularGananciaSemanal() {
        int totalHoras = cantidadDiasPorSemana * cantidadHorasPorDia;
        int totalPagar = totalHoras * precioPorHora;
        System.out.println("La ganancia semanal es: "+totalPagar);
    }
}
