import controller.Agenda;
import model.Persona;

public class Entrada {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarPersona(new Persona("Julio Verne", 654784256, "25145478F"));
        agenda.agregarPersona(new Persona("Sandra", 654784521, "24875474T"));
        agenda.agregarPersona(new Persona("Federico", 654789123, "12345678A"));

        agenda.listarPersonas();

        agenda.editarPersona("12345678a");

        agenda.listarPersonas();

        agenda.borrarPersona("12345678a");

        agenda.listarPersonas();

        agenda.buscarPersona("25145478f");
    }
}
