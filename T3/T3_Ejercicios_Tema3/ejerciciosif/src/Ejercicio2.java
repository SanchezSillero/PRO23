import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tres numeros enteros positivos");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        if ((numero1 == numero2 + numero3) || (numero2 == numero1 + numero3) || (numero3 == numero1 +numero2) ) {
            System.out.println("uno de los numero es la suma de los otros dos");
        }else {
            System.out.println("ninguno es suma de los otros dos");
        }
    }
}
