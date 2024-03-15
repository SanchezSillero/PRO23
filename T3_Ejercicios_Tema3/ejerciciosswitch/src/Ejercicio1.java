import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("es el lunes");
                break;
            case 2:
                System.out.println("es el martes");
                break;
            case 3:
                System.out.println("es el miercoles");
                break;
            case 4:
                System.out.println("es el jueves");
                break;
            case 5:
                System.out.println("es el viernes");
                break;
            case 6:
                System.out.println("es el sabado");
                break;
            case 7:
                System.out.println("es el domingo");
                break;
            default:
                System.out.println("día no contemplado");

        }
    }
}
