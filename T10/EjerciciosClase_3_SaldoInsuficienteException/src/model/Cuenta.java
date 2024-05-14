package model;

import utils.SaldoInsuficienteException;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void realizarTransaccion (double montanteSacar) throws Exception {
        if (montanteSacar<0){
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        } else if (montanteSacar>saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente",montanteSacar);
        }else {
            this.saldo-=montanteSacar;
            System.out.println("El saldo resultante es: "+this.saldo);
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
