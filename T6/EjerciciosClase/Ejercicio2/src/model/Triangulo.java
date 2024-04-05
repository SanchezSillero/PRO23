package model;

public class Triangulo {
    private double base, altura, area;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mostrarDatos(){
        System.out.println("Base= "+base);
        System.out.println("Altura= "+altura);
        System.out.println("Área= "+area);
    }

    public void calcularArea(){
      area = (base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
