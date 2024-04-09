import controller.Coleccion;
import model.Libro;
import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---BIENVENIDO AL GESTOR MULTIMEDIA---");
        System.out.println("\n\tPulse Enter para entrar");
        scanner.nextLine();

        System.out.println("\n---MENÚ DEL GESTOR MULTIMEDIA---\n");
        System.out.println("\t1. Añadir a la colección\n\t2. Eliminar de la colección\n\t3. Listar elementos\n\t4. Salir\n");
        System.out.println("¿Qué desea hacer?");
        int menuOpcion= scanner.nextInt();

        switch (menuOpcion){
            case 1:{
                System.out.println("¿Qué tipo de elemento quiere añadir?\n\t1. Libro\t2. Video\t3. Audio");
                int opcion1 = scanner.nextInt();
                switch (opcion1){
                    case 1:{
                        System.out.println("Introduzca un identificador");
                        int identificador = scanner.nextInt();
                        System.out.println("Introduzca el título del libro");
                        String titulo = scanner.next();
                        System.out.println("Introduzca el nombre del autor");
                        String nombre = scanner.next();
                        Persona autor = new Persona(nombre);
                        System.out.println("Introduzca el tamaño del archivo");
                        double tamaño = scanner.nextDouble();
                        System.out.println("Introduzca el formato del archivo");
                        String formato = scanner.next();
                        System.out.println("Introduzca el ISBN del libro");
                        int isbn = scanner.nextInt();
                        System.out.println("Introduzca el número de páginas que tiene el libro");
                        int numeroPaginas = scanner.nextInt();
                        Libro libro = new Libro(identificador ,titulo, autor, tamaño, formato, isbn, numeroPaginas);
                        coleccion.anadirElemento(libro);
                    }
                }
            }
            case 2:{}
            case 3:{}
            case 4:{}
            default:{}
        }

    }
}
