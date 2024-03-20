import java.util.Scanner;

/*Realiza un programa que pida 8 números enteros, los guarde en un array y que luego
  muestre esos números junto con la palabra “par” o “impar” según proceda.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número");
            numeros[i] = scanner.nextInt();
        }
        for (int item : numeros) {
            if (item% 2 == 0) {
                System.out.println(item + " par");
            } else {
                System.out.println(item + " impar");
            }
        }

    }
}

