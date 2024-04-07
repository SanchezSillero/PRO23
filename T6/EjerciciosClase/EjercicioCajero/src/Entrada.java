import model.Cuenta;
import model.EntidadBancaria;

import java.util.ArrayList;
import java.util.Scanner;
import controller.Cajero;

public class Entrada {
    public static void main(String[] args) {
        EntidadBancaria bbva = new EntidadBancaria("BBVA", "A12345678");
        EntidadBancaria santander = new EntidadBancaria("Santander", "A87654321");
        Cajero cajero = new Cajero();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Introduce el banco con que el quieres operar\n\t1.BBVA\n\t2.Santander");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1: {
                cajero.operarBanco(bbva);
                break;
            }
            case 2: {
                cajero.operarBanco(santander);
                break;
            }
            default:
                System.out.println("Opción no válida");
        }
    }
}
