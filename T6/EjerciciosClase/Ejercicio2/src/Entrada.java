import model.Circulo;
import model.Rectangulo;
import model.Triangulo;

public class Entrada {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3,2);
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(5, 5);

        triangulo.calcularArea();
        System.out.println("El area del triangulo es: "+triangulo.getArea());

        circulo.calcularArea();
        System.out.println("El area del circulo es: "+circulo.getArea());
        circulo.calcularDiametro();
        System.out.println("El diametro del circulo es: "+circulo.getDiametro());

        rectangulo.calcularArea();
        System.out.println("El area del rectangulo es: "+ rectangulo.getArea());
        rectangulo.calcularPerimetro();
        System.out.println("El perimetro del rectangulo es: "+rectangulo.getPerimetro());


    }
}
