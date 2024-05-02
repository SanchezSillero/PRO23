import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //a. Pida al usuario 5 numeros entre el 1 y el 10
        int n1, n2, n3, n4, n5;

       /* System.out.println("A continuación de be introducir 5 números entre el 1 y el 10");
        try {
            do {
                System.out.println("Introduzca el primer número");
                n1 = scanner.nextInt();
            } while (n1 < 1 || n1 > 10);
            do {
                System.out.println("Introduzca el segundo número");
                n2 = scanner.nextInt();
            } while (n2 < 1 || n2 > 10);
            do {
                System.out.println("Introduzca el tercer número");
                n3 = scanner.nextInt();
            } while (n3 < 1 || n3 > 10);
            do {
                System.out.println("Introduzca el cuarto número");
                n4 = scanner.nextInt();
            } while (n4 < 1 || n4 > 10);
            do {
                System.out.println("Introduzca el quinto número");
                n5 = scanner.nextInt();
            } while (n5 < 1 || n5 > 10);
        } catch (InputMismatchException e) {
            System.out.println("El dato introducido no es válido");
        }*/


        //b. b.	Cree un array de 5 números aleatorios entre el 1 y el 10 que no sean repetidos
        int [] numeros = new int[5];
        boolean repetido;
        do {
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int)(Math.random()*10+1);
            }
        }while (repetido=true);


    }
}
