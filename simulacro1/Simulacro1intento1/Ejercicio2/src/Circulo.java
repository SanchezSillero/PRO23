import java.util.Objects;

public class Circulo extends Figura2D{
    private double radio;


    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                super.toString()+
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(getRadio(), circulo.getRadio()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadio());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
