package model;

public class Circulo {
    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
    public void calcularDiametro(){
        diametro = radio*2;
    }

    public void mostrarDatos(){
        System.out.println("Radio= "+radio);
        System.out.println("Diámetro= "+diametro);
        System.out.println("Área= "+area);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
