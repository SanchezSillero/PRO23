import java.util.Scanner;

public class ParaPracticar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int a = scanner.nextInt();

        if (a<0){
            System.out.println("negativo");
        } else if (a<10) {
            System.out.println("un digito");
        } else if (a<100) {
            System.out.println("2 digitos");
        }
        else
            System.out.println("3digitos");
    }
}
