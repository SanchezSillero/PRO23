import model.Circulo;
import model.Rectangulo;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(5, 5);

        /*triangulo.calcularArea();
        System.out.println("El area del triangulo es: "+triangulo.getArea());

        circulo.calcularArea();
        System.out.println("El area del circulo es: "+circulo.getArea());
        circulo.calcularDiametro();
        System.out.println("El diametro del circulo es: "+circulo.getDiametro());

        rectangulo.calcularArea();
        System.out.println("El area del rectangulo es: "+ rectangulo.getArea());
        rectangulo.calcularPerimetro();
        System.out.println("El perimetro del rectangulo es: "+rectangulo.getPerimetro());
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, con que opción desea trabajar:\n" +
                "\t1.Triangulos      2.Círculos      3.Rectángulos");
        System.out.println("Introduzca su opción (1-3):");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:{
                System.out.println("Introduzca la base de su triangulo:");
                triangulo.setBase(scanner.nextDouble());
                System.out.println("Introduzca la altura de su triangulo:");
                triangulo.setAltura(scanner.nextDouble());
                System.out.println("¿Qué operación desea realizar?\n" +
                        "1.Calcular área        2.Mostrar datos\n" +
                        "Introduzca su opción (1-2)");
                int opcionTriangulo = scanner.nextInt();
                switch (opcionTriangulo){
                    case 1:{triangulo.calcularArea();
                        System.out.println("El area del triangulo es: "+triangulo.getArea());
                    break;}
                    case 2:{triangulo.mostrarDatos();
                    break;}
                }

            }
            case 2:{}
            case 3:{}
        }
    }
}
