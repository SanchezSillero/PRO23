package model;

public class Persona {

    // atributos:
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    // métodos:
    //constructores:

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;

    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni="11111111X";
    }

    public Persona(){
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "11111111X";
    }


    public void mostrarDatos() {
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("DNI " + dni);
        System.out.println("Edad " + edad);
        System.out.println("Peso " + peso);
        System.out.println("Altura " + altura);
    }


}
