import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = scanner.next();
        System.out.println("Escriba su apellido");
        String apellido = scanner.next();
        System.out.println("Escriba su DNI");
        String dni = scanner.next();
        System.out.println("Escriba su edad");
        int edad = scanner.nextInt();
        System.out.println("Escriba su peso");
        double peso = scanner.nextDouble();
        System.out.println("Escriba su altura en centímetros");
        int altura = scanner.nextInt();

        Persona p1 = new Persona(nombre, apellido, dni, edad, peso, altura);
        Persona p2 = new Persona("Francisco", "Hernández");
        Persona p3 = new Persona();

        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();

        p1.setEdad(20);
        p2.setEdad(20);
        p3.setEdad(20);

    }
}
