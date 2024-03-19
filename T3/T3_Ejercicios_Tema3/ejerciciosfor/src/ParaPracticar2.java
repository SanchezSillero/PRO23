import java.util.Scanner;

public class ParaPracticar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 10 números");
        int sumatorio= 0;

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            sumatorio +=numero;
        }
        System.out.println("La suma total de los números es "+ sumatorio);
    }
}