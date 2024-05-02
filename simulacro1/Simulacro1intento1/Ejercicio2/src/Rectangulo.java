import java.util.Objects;

public class Rectangulo extends Figura2D{
    private double base, altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                super.toString() +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(getBase(), that.getBase()) == 0 && Double.compare(getAltura(), that.getAltura()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBase(), getAltura());
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = base + altura;
        return perimetro;
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
}
