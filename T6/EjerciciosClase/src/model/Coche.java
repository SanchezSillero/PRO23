package model;

public class Coche {
    private Motor motor;
    private String  marca, modelo;
    private double precioAverias;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAverias = 0;
    }

    public void acumularAveria(double precioAveria){
        precioAverias += precioAveria;
    }

    public void mostrarDatos(){
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

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }



}
