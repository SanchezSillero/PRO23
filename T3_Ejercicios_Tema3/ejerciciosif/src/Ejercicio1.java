
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("introduce numero2");
        int numero2 = scanner.nextInt();


        if (numero2<numero1){
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }

    }
    }

