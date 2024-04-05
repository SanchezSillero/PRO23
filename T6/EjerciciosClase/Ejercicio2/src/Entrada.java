import model.Circulo;
import model.Rectangulo;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
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
        int opcionMenuPrincipal;

        do {
            System.out.println("Hola, con que opción desea trabajar:\n" +
                    "\t1.Triangulos      2.Círculos      3.Rectángulos      4.Salir");
            System.out.println("Introduzca su opción (1-4):");
            opcionMenuPrincipal = scanner.nextInt();

            switch (opcionMenuPrincipal) {
                case 1: {
                    int opcionTriangulo;
                    do {
                        System.out.println("---------------------------------------------------");
                        System.out.println("Introduzca la base de su triangulo:");
                        double base = scanner.nextDouble();
                        System.out.println("Introduzca la altura de su triangulo:");
                        double altura = scanner.nextDouble();
                        Triangulo triangulo = new Triangulo(base, altura);


                        System.out.println("¿Qué operación desea realizar?\n" +
                                "1.Calcular área        2.Mostrar datos      3.Finalizar\n" +
                                "Introduzca su opción (1-3)");
                        opcionTriangulo = scanner.nextInt();
                        switch (opcionTriangulo) {
                            case 1: {
                                triangulo.calcularArea();
                                System.out.println("El area del triangulo es: " + triangulo.getArea());
                                break;
                            }
                            case 2: {
                                triangulo.calcularArea();
                                triangulo.mostrarDatos();
                                break;
                            }
                        }


                    } while (opcionTriangulo != 3);
                    System.out.println("Presione Enter para volver al menú");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                }
                case 2: {
                    int opcionCirculo;
                    do {
                        System.out.println("---------------------------------------------------");
                        System.out.println("Introduzca el radio de su circulo:");
                        double radio = scanner.nextDouble();
                        Circulo circulo = new Circulo(radio);


                        System.out.println("¿Qué operación desea realizar?\n" +
                                "1.Calcular área      2.Calcular diámetro      3.Mostrar datos      4.Finalizar\n" +
                                "Introduzca su opción (1-4)");
                        opcionCirculo = scanner.nextInt();
                        switch (opcionCirculo) {
                            case 1: {
                                circulo.calcularArea();
                                System.out.println("El area del círculo es: " + circulo.getArea());
                                break;
                            }
                            case 2: {
                                circulo.calcularDiametro();
                                System.out.println("El diámetro del círculo es: " + circulo.getDiametro());
                                break;
                            }
                            case 3: {
                                circulo.calcularArea();
                                circulo.calcularDiametro();
                                circulo.mostrarDatos();
                                break;
                            }
                        }


                    } while (opcionCirculo != 4);
                    System.out.println("Presione Enter para volver al menú");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                }
                case 3: {
                    int opcionRectángulo;
                    do {
                        System.out.println("---------------------------------------------------");
                        System.out.println("Introduzca la base de su rectángulo:");
                        double base = scanner.nextDouble();
                        System.out.println("Introduzca la altura de su rectángulo:");
                        double altura = scanner.nextDouble();
                        Rectangulo rectangulo = new Rectangulo(base, altura);


                        System.out.println("¿Qué operación desea realizar?\n" +
                                "1.Calcular área      2.Calcular perímetro      3.Mostrar datos      4.Finalizar\n" +
                                "Introduzca su opción (1-4)");
                        opcionRectángulo = scanner.nextInt();
                        switch (opcionRectángulo) {
                            case 1: {
                                rectangulo.calcularArea();
                                System.out.println("El area del rectángulo es: " + rectangulo.getArea());
                                break;
                            }
                            case 2: {
                                rectangulo.calcularPerimetro();
                                System.out.println("El perímetro del rectángulo es: " + rectangulo.getPerimetro());
                                break;
                            }
                            case 3: {
                                rectangulo.calcularArea();
                                rectangulo.calcularPerimetro();
                                rectangulo.mostrarDatos();
                                break;
                            }
                        }


                    } while (opcionRectángulo != 4);
                    System.out.println("Presione Enter para volver al menú");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                }
                case 4: {
                    System.out.println("¡Hasta pronto!");
                    break;
                }
                default: {
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4");
                }
            }
        } while (opcionMenuPrincipal != 4);
    }
}
