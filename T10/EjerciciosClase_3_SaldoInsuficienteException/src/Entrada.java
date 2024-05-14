import model.Cuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta("1234A", 1000);
        System.out.println("Que cantidada quiere sacar?");
        try {
            double cantidad = sc.nextDouble();
            cuenta.realizarTransaccion(cantidad);
        } catch (InputMismatchException e) {
            System.out.println("Error en el proceso");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
