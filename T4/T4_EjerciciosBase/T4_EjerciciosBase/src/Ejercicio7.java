import java.util.Scanner;

/* Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
   Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    - Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras*/

public class Ejercicio7 {
    static int numeroAzar;
    static int numeroLetras = 0;
    static double mediaLetras;
    static String eleccionMenu;
    static String[] palabras = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        rellenarArray();

        do {
            // Requerir opcion de menu y dar solucion
            mostrarMenu();
            System.out.println("¿Qué opción desea (introduzca el nº correspondiente 1-7)?");
            eleccionMenu = scanner.next();
            switch (eleccionMenu) {

                case "1": //mostrar array
                    mostrarArray();
                    break;

                case "2"://mostrar una posicion al azar del array
                    palabraAzar();
                    break;

                case "3": //sumar todas las letras
                    sumarLetras();
                    break;

                case "4": //media de letras por palabra
                    mediaLetras();
                    break;

                case "5"://palabra con mas letras
                    palabraLarga();
                    break;

                case "6"://palabra con menos letras
                    palabraCorta();
                    break;

                case "7":
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida, ingrese un número de 1 a 7");
            }
            System.out.println();

        } while (!eleccionMenu.equals("7"));
    }

    //Métodos para cada case
    public static void rellenarArray() {
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            palabras[i] = scanner.next();
        }
    }

    public static void mostrarMenu() {
        System.out.println("Tienes las siguientes opciones;\n " +
                "1. Mostrar palabras introducidas\t\t\t " +
                "2. Mostrar una palabra al azar de las introducidas\n " +
                "3. Obtener la suma de todas las letras\t\t " +
                "4. Ver la media de letras por palabra\n " +
                "5. Ver la palabra con más letras\t\t\t " +
                "6. Ver la palabra con menos letras\n " +
                "7. Salir\t\t");
    }

    public static void mostrarArray() {
        for (String item : palabras) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void palabraAzar() {
        numeroAzar = (int) (Math.random() * 10);
        System.out.println(palabras[numeroAzar]);
        System.out.println();
    }

    public static void sumarLetras() {
        numeroLetras = 0;
        for (String item : palabras) {
            numeroLetras += item.length();
        }
        System.out.println("El número de letras es: " + numeroLetras);
        System.out.println();
    }

    public static void mediaLetras() {
        numeroLetras = 0;
        for (String item : palabras) {
            numeroLetras += item.length();
        }
        mediaLetras = (double) numeroLetras / palabras.length;
        System.out.println("La media de letras por palabra es: " + mediaLetras);
        System.out.println();
    }

    public static void palabraLarga() {
        String palabraLarga = palabras[0];
        for (String item : palabras) {
            if (item.length() > palabraLarga.length()) {
                palabraLarga = item;
            }
        }
        System.out.println("La palabra con más letras es: " + palabraLarga);
        System.out.println();
    }

    public static void palabraCorta() {
        String palabraCorta = palabras[0];
        for (String item : palabras) {
            if (item.length() < palabraCorta.length()) {
                palabraCorta = item;
            }
        }
        System.out.println("La palabra con menos letras es: " + palabraCorta);
        System.out.println();
    }


}