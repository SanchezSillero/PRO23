import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Entrada {
    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno1 = new Alumno(1,2,3);
        Profesor profesor1 = new Profesor();

        profesor1.ponerNotas(alumno1);
        System.out.println("Agignatura 1: " + alumno1.getAsignatura1().getCalificacion());
        System.out.println("Agignatura 2: " + alumno1.getAsignatura2().getCalificacion());
        System.out.println("Agignatura 3: " + alumno1.getAsignatura3().getCalificacion());
        System.out.println("La media es: " + profesor1.calcularMedia(alumno1));



    }
}
