package model;

import java.util.Objects;

public class Circulo extends Figura2D {
    private int radio;

    public Circulo(String nombreFigura, int radio) {
        super(nombreFigura);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        setPerimetro(perimetro);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return getRadio() == circulo.getRadio();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadio());
    }
}
