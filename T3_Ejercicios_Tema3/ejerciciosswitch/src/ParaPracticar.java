import java.util.Scanner;

public class ParaPracticar {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 3");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("El número es 1");
                break;
            case 2:
                System.out.println("El número es 2");
                break;
            case 3:
                System.out.println("El número es 3");
                break;
            default:
                System.out.println("número desconocido");
        }
    }
}
