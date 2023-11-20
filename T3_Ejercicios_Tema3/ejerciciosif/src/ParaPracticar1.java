import java.util.Scanner;

public class ParaPracticar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = scanner.nextInt();
        if (numero%2==0) {
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }

    }
}