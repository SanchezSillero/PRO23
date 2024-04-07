package controller;

import model.Cuenta;
import model.EntidadBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {
    Scanner scanner = new Scanner(System.in);

    public Cajero() {
    }


    public void  operarBanco(EntidadBancaria banco){
        int opcionSub1;
        do {
            System.out.println("\t--Seleccionado "+banco.getNombre()+"--\n\t1. Crear una cuenta\n\t2. Ingresar dinero\n\t3. Sacar dinero\n\t" +
                    "4. Ver cuentas de un cliente\n\t5. Ver todas las cuentas\n\t6. Salir\n\t¿Qué desea hacer?");

            opcionSub1 = scanner.nextInt();
            switch (opcionSub1) {
                case 1: {
                    crearCuenta(banco);
                    break;
                }
                case 2: {
                    ingresarDinero(banco);
                    break;
                }
                case 3: {
                    sacarDinero(banco);
                    break;
                }
                case 4: {
                    cuentasCliente(banco);
                    break;
                }
                case 5: {
                    cuentasBanco(banco);
                    break;
                }
                case 6: {
                    System.out.println("¡Gracias por utilizar nuestro sevicio! ¡Hasta pronto!");
                    break;
                }
            }
        } while (opcionSub1 != 6);
    }

    public void crearCuenta (EntidadBancaria banco){
        System.out.println("\t--Seleccionado crear cuenta--\n\tIntroduce DNI del titular");
        String dni = scanner.next();
        System.out.println("Introduce pin asociado");
        int pin = scanner.nextInt();
        Cuenta cuenta = banco.buscarCuenta(dni, pin);
        if (cuenta != null) {
            System.out.println("Ya existe una cuenta asociada a ese DNI y ese PIN");
        } else {
            System.out.println("Introduce saldo inicial");
            double saldo = scanner.nextDouble();
            int isbn = (int) (Math.random() * 10000) + 1;
            banco.agregarCuenta(new Cuenta(dni, pin, saldo, isbn));
            System.out.println("\t---Cuenta creada correctamente---");
        }
    }

    public void ingresarDinero(EntidadBancaria banco){
        System.out.println("\t--Seleccionado ingresar dinero--\n\tIntroduce DNI del titular");
        String dni = scanner.next();
        System.out.println("Introduce pin asociado");
        int pin = scanner.nextInt();
        Cuenta cuenta = banco.buscarCuenta(dni, pin);
        if (cuenta != null) {
            System.out.println("Introduce saldo a ingresar");
            int ingreso = scanner.nextInt();
            cuenta.ingresarDinero(ingreso);
        } else {
            System.out.println("DNI o PIN incorrectos");
        }
        System.out.println("\t---Dinero ingresado correctamente---");
    }

    public void sacarDinero(EntidadBancaria banco){
        System.out.println("\t--Seleccionado retirar dinero--\n\tIntroduce DNI del titular");
        String dni = scanner.next();
        System.out.println("Introduce pin asociado");
        int pin = scanner.nextInt();
        Cuenta cuenta = banco.buscarCuenta(dni, pin);
        if (cuenta != null) {
            System.out.println("Introduce cantidad a retitar");
            int retiro = scanner.nextInt();
            cuenta.retinarDinero(retiro);
        } else {
            System.out.println("DNI o PIN incorrectos");
        }
    }

    public void cuentasCliente (EntidadBancaria banco){
        System.out.println("\t--Seleccionado ver cuentas cliente--\n\tIntroduce DNI del titular");
        String dni = scanner.next();
        ArrayList<Cuenta> cuentas = banco.cuentasCliente(dni);
        if (cuentas == null || cuentas.isEmpty()) {
            System.out.println("El DNI introducido no tiene cuentas asociadas");
        } else {
            System.out.println("Las cuentas asociadas del cliente con DNI " + dni + " son:\n");
            for (Cuenta cuenta : cuentas) {
                cuenta.mostrarDatos();
            }
        }
        System.out.println("\t---Listadas cuentas cliente correctamente---");
    }

    public void cuentasBanco (EntidadBancaria banco){
        System.out.println("\t--Seleccionado ver cuentas del banco--");
        ArrayList<Cuenta> cuentasBBVA = banco.getListaCuentas();
        if (cuentasBBVA.isEmpty()) {
            System.out.println("No hay cuentas asociadas al banco BBVA");
        } else {
            System.out.println("Cuentas del banco "+banco.getNombre() +": ");
            for (Cuenta cuenta : cuentasBBVA) {
                cuenta.mostrarDatos();
            }
        }
    }




}
