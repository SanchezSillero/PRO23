package model;

import utils.EdadInvalidaException;
import utils.NombreInvalidoException;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadInvalidaException, NombreInvalidoException {
        this.nombre = nombre;
        this.edad = edad;
        if (edad < 0) {
            throw new EdadInvalidaException("Edad no válida");
        } else if (nombre == null) {
            throw new NombreInvalidoException("Debe introducir un nombre");
        }
    }

    public void validarDatos() throws EdadInvalidaException, NombreInvalidoException {
        if (edad < 0) {
            throw new EdadInvalidaException("Edad no válida");
        } else if (nombre == null) {
            throw new NombreInvalidoException("Debe introducir un nombre");
        } else {
            System.out.println("Datos validados correctamente");
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
