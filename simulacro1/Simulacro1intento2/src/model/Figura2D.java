package model;

abstract public class Figura2D implements FiguraGeometrica {
private String nombreFigura;
private double perimetro;

    public Figura2D() {
    }

    public Figura2D(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura2D{" +
                "nombreFigura='" + nombreFigura + '\'' +
                ", perimetro=" + perimetro +
                '}';
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
