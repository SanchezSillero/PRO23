package model;

public class Cuenta {
    private String dni;
    private int pin;
    private double saldo;
    private int isbn;

    public Cuenta() {
    }

    public Cuenta(String dni, int pin, double saldo) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
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
