import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter");
        char caracter = scanner.next().charAt(0);

        switch (caracter){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("vocal");
                break;

            default:
                System.out.println("consonante");


        }
    }
}
