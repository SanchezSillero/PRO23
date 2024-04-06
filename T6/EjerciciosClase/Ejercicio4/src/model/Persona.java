package model;

public class Persona {
    private String nombre;
    private int telefono;
    private String dni;

    public Persona() {
    }

    public Persona(String nombre, int telefono, String dni) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Teléfono: "+telefono);
        System.out.println("DNI: "+dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
