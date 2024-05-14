package model;

import java.util.Objects;

public class Rectangulo extends Figura2D {
    private int base, altura;

    public Rectangulo(String nombreFigura, int base, int altura) {
        super(nombreFigura);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        setPerimetro(perimetro);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        return getBase() == that.getBase() && getAltura() == that.getAltura();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBase(), getAltura());
    }
}
