import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año");
        int año = scanner.nextInt();


        if (año%4==0){
            System.out.println("Es año bisiesto");
        }else {
            System.out.println("No es año bisiesto");
        }
    }
}
