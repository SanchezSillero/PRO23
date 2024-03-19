import java.util.Scanner;

public class Ejercicio1 {
    //Realiza un programa que pida 10 números por teclado y que los almacene en un array.
    // A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca 10 números");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= scanner.nextInt();
            System.out.println(i + ". " + numeros[i]);
        }

    }



}
