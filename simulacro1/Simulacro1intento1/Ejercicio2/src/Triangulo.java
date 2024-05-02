import java.util.Objects;

public class Triangulo extends Figura2D {

    private double lado1,lado2,lado3;

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                super.toString() +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(getLado1(), triangulo.getLado1()) == 0 && Double.compare(getLado2(), triangulo.getLado2()) == 0 && Double.compare(getLado3(), triangulo.getLado3()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLado1(), getLado2(), getLado3());
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1+lado2+lado3;
        return perimetro;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
