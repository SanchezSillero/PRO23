package model;

import java.util.Objects;

public class Triangulo extends Figura2D {
    private int lado1,lado2,lado3;

    public Triangulo(String nombreFigura, int lado1, int lado2, int lado3) {
        super(nombreFigura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1+lado2+lado3;
        setPerimetro(perimetro);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        return getLado1() == triangulo.getLado1() && getLado2() == triangulo.getLado2() && getLado3() == triangulo.getLado3();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLado1(), getLado2(), getLado3());
    }
}
