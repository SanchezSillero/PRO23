package model;

public class Círculo {
    private double radio, diametro, area;

    public Círculo() {
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
    public void calcularDiametro(){
        diametro = radio*2;
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
