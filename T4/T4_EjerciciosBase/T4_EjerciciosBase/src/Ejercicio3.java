import java.util.Scanner;

/* Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
  - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
  - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        //introducir numeros por teclado y guardarlos en el array
        System.out.println("Introduce 10 números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        //mostrarlos en orden inverso
        System.out.println();
        System.out.print("\nNúmeros en orden inverso: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        //mostrarlos en orden normal
        System.out.print("\nNúmeros en orden normal: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
