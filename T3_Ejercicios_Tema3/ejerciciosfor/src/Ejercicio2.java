import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 10");
        int numero = scanner.nextInt();

        for (int i=0; i<10; i++){
            System.out.println(numero+ "x" + i + "=" + i*numero);
        }
    }
}
