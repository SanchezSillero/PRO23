import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = scanner.nextInt();
        if (numero % 20 == 0) {
            if (numero <= 100 && numero >= -100) {
                System.out.println("Es múltiplo de 20 y está entre -100 y 100");
            } else {
                System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
            }

        }
     else {
            if (numero<=100 && numero>=-100)
            {
                System.out.println("no es múltiplo de 20 y está entre -100 y 100");
            } else{
                    System.out.println("no es múltiplo de 20 y no está entre -100 y 100");
                }
            }
        }
    }

