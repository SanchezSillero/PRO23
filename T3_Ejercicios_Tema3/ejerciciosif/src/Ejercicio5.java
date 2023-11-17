import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de 4 digitos");
        int numero = scanner.nextInt();

        String numeroPalabra = String.valueOf(numero);

        if (numero>999 && numero<10000){
            if (numeroPalabra.charAt(0)==numeroPalabra.charAt(3) && numeroPalabra.charAt(1)==numeroPalabra.charAt(2)){
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        }else {
            System.out.println("el numero no tiene cuatro digitos");
        }

    }
}
