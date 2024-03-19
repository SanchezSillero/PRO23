import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = scanner.nextInt();


        switch (numero%2){
            case 0:
                System.out.println("Numero par");
                break;
            default:
                System.out.println("Numero impar");
        }

    }
}
