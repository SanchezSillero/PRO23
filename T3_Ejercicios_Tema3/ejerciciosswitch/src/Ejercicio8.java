import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un operador matematico");
        char operador = scanner.next().charAt(0);
        System.out.println("Introduce un primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce un segundo numero");
        int numero2 = scanner.nextInt();

        switch (operador){
            case '+':
                int suma = numero1 + numero2;
                System.out.println(numero1 + "+" + numero2 + "=" + suma);
                break;

            case '-':
                int resta = numero1-numero2;
                System.out.println(numero1 + "-" + numero2 + "=" + resta);
                break;

            case '*':
                int producto = numero1*numero2;
                System.out.println(numero1 + "*" + numero2 + "=" + producto);
                break;

            case '/':
                int cociente = numero1/numero2;
                System.out.println(numero1 + "/" + numero2 + "=" + cociente);
                break;

            default:
                System.out.println("el operador introducido no es valido");
        }

    }
}
