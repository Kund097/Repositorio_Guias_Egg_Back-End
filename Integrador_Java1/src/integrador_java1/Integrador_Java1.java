
package integrador_java1;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;


public class Integrador_Java1 {

    public static void main(String[] args) {
     
        Estudiante[] clase1 = new Estudiante[8];
        clase1[0] = EstudianteServicio.crearEstudiante("facundo", Math.random()*10+1);
        clase1[1] = EstudianteServicio.crearEstudiante("daniel", Math.random()*10+1);
        clase1[2] = EstudianteServicio.crearEstudiante("eduardo", Math.random()*10+1);
        clase1[3] = EstudianteServicio.crearEstudiante("hector", Math.random()*10+1);
        clase1[4] = EstudianteServicio.crearEstudiante("esteban", Math.random()*10+1);
        clase1[5] = EstudianteServicio.crearEstudiante("andrea", Math.random()*10+1);
        clase1[6] = EstudianteServicio.crearEstudiante("matias", Math.random()*10+1);
        clase1[7] = EstudianteServicio.crearEstudiante("valentin", Math.random()*10+1);
        
        EstudianteServicio.mostrarPromedios(clase1);
        
    }
    
}
