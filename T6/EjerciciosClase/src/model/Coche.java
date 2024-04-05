package model;

public class Coche {
    private Motor motor;
    private String marca, modelo;
    private double precioAverias;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAverias = 0;
    }

    public Coche(Motor motor, String marca, String modelo) {
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acumularAveria(double precioAveria) {
        precioAverias += precioAveria;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio averías: " + precioAverias);
        System.out.println("Datos del motor: ");
        System.out.println("CV: " + motor.getCV());
        System.out.println("Litros aceite : " + motor.getLitrosAceite());
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }

    public void setPrecioAverias(double precioAverias) {
        this.precioAverias = precioAverias;
    }
}
