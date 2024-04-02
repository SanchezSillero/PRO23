package model;

public class Persona {

    // atributos:
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    // métodos:
    public void mostrarDatos() {
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("DNI " + dni);
        System.out.println("Edad " + edad);
        System.out.println("Peso " + peso);
        System.out.println("Altura " + altura);
    }

    //constructores:

    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "11111111X";
    }

    public Persona() {
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "11111111X";
    }

    //getters y setters asociados

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
