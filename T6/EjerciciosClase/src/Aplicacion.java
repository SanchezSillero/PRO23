import controller.Garaje;
import model.Coche;
import model.Motor;

public class Aplicacion {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche coche1 = new Coche(new Motor(150), "Marca1","Modelo1");
        Coche coche2 = new Coche(new Motor(150), "Marca2","Modelo2");

        garaje.aceptarCoche(coche1, "aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche1, "motor");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2, "aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2, "aceite");

        coche1.mostrarDatos();
        coche2.mostrarDatos();
    }
}
