import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo("CIRCULO1", 3));
        listaFiguras.add(new Triangulo("TRIANGULO1", 3,4,5));
        listaFiguras.add(new Rectangulo("RECTANGULO1",5,6));
        for (Figura2D item : listaFiguras) {
            System.out.println(item.toString()+" perimetro = "+item.calcularPerimetro());
        }
    }
}
