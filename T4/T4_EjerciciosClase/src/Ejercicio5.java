import java.util.Scanner;

/*(OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática).
  Se mostrarán los datos separados por una coma y un espacio.
  Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.
  hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones*/
public class Ejercicio5 {
    static int[] numeros = new int[10];
    static int opcionMenu;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Generando 10 numeros aleatorios...");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }

        mostrarNumeros();

        do {
            mostrarMenu();
            switch (opcionMenu) {
                case 1:
                    incrementarPares();
                    break;

                case 2:
                    duplicarPositivos();
                    break;

                case 3:
                    sumarYrestar();
                    break;

                case 4:
                    moverDerecha();
                    break;

                case 5:
                    intercambios();
                    break;

                case 6:
                    invertir();
                    break;

                case 7:
                    primerParUltimoImpar();
                    break;

                case 8:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número entre 1 y 8");
            }

        } while (opcionMenu != 8);


    }


    //Metodos para el menu
    public static void mostrarNumeros() {
        for (int item : numeros) {
            System.out.print(item + ", ");
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n¿Qué desea hacer? Seleccione una de las siguientes opciones:\n" +
                "1. Incrementar en 1 los valores pares y en -1 los impares.\n" +
                "2. Duplicar los valores positivos menores que 5.\n" +
                "3. Sumar a cada valor un valor entero aleatorio entre -5 y 5.\n" +
                "4. Mover los datos una posición hacia la derecha.\n" +
                "5. Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.\n" +
                "6. Invertir el array.\n" +
                "7. Mostrar la posición del primer par y del último impar.\n" +
                "8. Salir.");
        opcionMenu = scanner.nextInt();
    }

    public static void incrementarPares() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] + 1;
            } else numeros[i] = numeros[i] - 1;
        }
        mostrarNumeros();
    }

    public static void duplicarPositivos() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0 && numeros[i] < 5) {
                numeros[i] = numeros[i] * 2;
            }
        }
        mostrarNumeros();
    }

    public static void sumarYrestar() {
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 11) - 5;
            numeros[i] += aleatorio;
        }
        mostrarNumeros();
    }

    public static void moverDerecha() {
        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = aux;
        mostrarNumeros();
    }

    public static void intercambios() {
        for (int i = 0; i < numeros.length - 1; i += 2) {
            int aux = numeros[i];
            numeros[i] = numeros[i + 1];
            numeros[i + 1] = aux;
        }
        mostrarNumeros();
    }

    public static void invertir() {
        System.out.println();
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }

    public static void primerParUltimoImpar() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print("el primer par es " + numeros[i]);
                break;
            }
        }
        System.out.println();
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (numeros[i] % 2 != 0) {
                System.out.print("el último impar es " + numeros[i]);
                break;
            }
        }

    }

}


