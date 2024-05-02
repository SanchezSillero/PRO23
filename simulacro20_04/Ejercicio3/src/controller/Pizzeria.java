package controller;

import model.Ingrediente;
import model.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzeria {
    public Pizzeria() {
    }

    public void menu() {
        System.out.println("Bienvenido al creador de pizzas");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la pizza");
        String nombre = scanner.nextLine();
        Pizza pizza = new Pizza(nombre);
        int opcion;
        do {
            System.out.println("¿Añadir ingrediente?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el nombre del ingrediente");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.println("Introduzca el precio del ingrediente");
                    double precioIngrediente = scanner.nextDouble();
                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
                    pizza.añadirIngrediente(ingrediente);
                    break;
                case 2:
                    pizza.calcularPrecio();
                    System.out.println("Tu pizza con nombre " + pizza.getNombre() + " tiene un precio de " + pizza.getPrecio() + " y sus ingredientes son ");
                    pizza.mostrarIngredientes();
                    break;
            }
        } while (opcion != 2);
    }
}
