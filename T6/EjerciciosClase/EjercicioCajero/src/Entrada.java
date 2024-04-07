import model.Cuenta;
import model.EntidadBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        EntidadBancaria bbva = new EntidadBancaria("BBVA", "A12345678");
        EntidadBancaria santander = new EntidadBancaria("Santander", "A87654321");
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Introduce el banco con que el quieres operar\n\t1.BBVA\n\t2.Santander");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("\t--Seleccionado BBVA--\n\t1. Crear una cuenta\n\t2. Ingresar dinero\n\t3. Sacar dinero\n\t" +
                        "4. Ver cuentas de un cliente\n\t5. Ver todas las cuentas\n\t6. Salir\n\t¿Qué desea hacer?");
                int opcionSub1 = scanner.nextInt();
                switch (opcionSub1) {
                    case 1: {
                        System.out.println("\t--Seleccionado crear cuenta--\n\tIntroduce DNI del titular");
                        String dni = scanner.next();
                        System.out.println("Introduce pin asociado");
                        int pin = scanner.nextInt();
                        Cuenta cuenta = bbva.buscarCuenta(dni, pin);
                        if (cuenta != null) {
                            System.out.println("Ya existe una cuenta asociada a ese DNI y ese PIN");
                        } else {
                            System.out.println("Introduce saldo inicial");
                            double saldo = scanner.nextDouble();
                            int isbn = (int) (Math.random() * 10000) + 1;
                            bbva.agregarCuenta(new Cuenta(dni, pin, saldo, isbn));
                            System.out.println("\t---Cuenta creada correctamente---");
                            break;
                        }
                    }
                    case 2: {
                        System.out.println("\t--Seleccionado ingresar dinero--\n\tIntroduce DNI del titular");
                        String dni = scanner.next();
                        System.out.println("Introduce pin asociado");
                        int pin = scanner.nextInt();
                        Cuenta cuenta = bbva.buscarCuenta(dni, pin);
                        if (cuenta != null) {
                            System.out.println("Introduce saldo a ingresar");
                            int ingreso = scanner.nextInt();
                            cuenta.ingresarDinero(ingreso);
                        } else {
                            System.out.println("DNI o PIN incorrectos");
                        }
                        System.out.println("\t---Dinero ingresado correctamente---");
                        break;
                    }
                    case 3: {
                        System.out.println("\t--Seleccionado retirar dinero--\n\tIntroduce DNI del titular");
                        String dni = scanner.next();
                        System.out.println("Introduce pin asociado");
                        int pin = scanner.nextInt();
                        Cuenta cuenta = bbva.buscarCuenta(dni, pin);
                        if (cuenta != null) {
                            System.out.println("Introduce cantidad a retitar");
                            int retiro = scanner.nextInt();
                            cuenta.retinarDinero(retiro);
                        } else {
                            System.out.println("DNI o PIN incorrectos");
                        }
                        System.out.println("\t---Dinero retirado correctamente---");
                        break;
                    }
                    case 4: {
                    }
                    case 5: {
                    }
                }
            }
            case 2: {
            }
        }
    }
}
