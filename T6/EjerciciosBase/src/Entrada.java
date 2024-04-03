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
        System.out.println("Escriba su género M/F");
        char genero = scanner.next().charAt(0);

        Persona p1 = new Persona(nombre, apellido, dni, edad, peso, altura, genero);
        Persona p2 = new Persona("Francisco", "Hernández");
        Persona p3 = new Persona();

        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();

        p1.setEdad(20);
        p2.setEdad(20);
        p3.setEdad(20);

        double imc = p1.calcularIMC();
        System.out.println(p1.getNombre()+" su IMC es "+ imc );
        if (p1.getGenero()=='M') {
            if (imc < 20) {
                System.out.println("Peso inferior al normal");
            } else if (imc >= 20 && imc < 27) {
                System.out.println("Peso normal");
            } else if (imc >= 27 && imc < 30) {
                System.out.println("Peso superior al normal");
            } else System.out.println("Obesidad");
        } else if (p1.getGenero()=='F') {
            if (imc < 20) {
                System.out.println("Peso inferior al normal");
            } else if (imc >= 20 && imc < 25) {
                System.out.println("Peso normal");
            } else if (imc >= 25.0 && imc < 30) {
                System.out.println("Peso superior al normal");
            } else System.out.println("Obesidad");
        }
    }
}
