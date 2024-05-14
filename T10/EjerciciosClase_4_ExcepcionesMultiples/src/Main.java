import model.Persona;
import utils.EdadInvalidaException;
import utils.NombreInvalidoException;

public class Main {
    public static void main(String[] args) {
        try {
            Persona persona1 = new Persona("Nombre1", 20);

        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Persona persona2 = new Persona("Nombre2", -15);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Persona persona3 = new Persona(null,20);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }

       /* try {
            persona1.validarDatos();
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminada validacion");
        }

        try {
            persona2.validarDatos();
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminada validacion");
        }

        try {
            persona3.validarDatos();
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminada validacion");
        }

        */
    }
}
