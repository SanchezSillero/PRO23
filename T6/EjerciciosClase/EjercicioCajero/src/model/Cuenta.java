package model;

public class Cuenta {
    private String dni;
    private int pin;
    private double saldo;
    private int isbn;

    public Cuenta() {
    }

    public Cuenta(String dni, int pin, double saldo, int isbn) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
        this.isbn = (int) (Math.random() * 10000) + 1;
    }

    public void mostrarDatos() {
        System.out.println("Cuenta: " + isbn);
        System.out.println("Saldo: " + saldo);
        System.out.println("Pin: " + pin);
        System.out.println("ISBN: " + isbn);
    }

    public void ingresarDinero(int ingreso) {
        if (ingreso <= 0) {
            System.out.println("Introduzca un valor positivo");
        } else {
            this.saldo += ingreso;
            System.out.println("Saldo actualizado a " + this.saldo);
        }
    }

    public void retinarDinero(int retiro) {
        if (this.saldo<retiro){
            System.out.println("No dispone de saldo suficiente");
        }else {
            this.saldo -= retiro;
            System.out.println("Saldo actualizado a " + this.saldo);
        }
    }


    public String getDni() {
        return dni;
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIsbn() {
        return isbn;
    }
}
