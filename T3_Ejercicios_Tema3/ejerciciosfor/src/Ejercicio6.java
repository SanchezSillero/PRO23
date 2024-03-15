public class Ejercicio6 { //mostrar todos los n pares entre dos dados
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 20;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
