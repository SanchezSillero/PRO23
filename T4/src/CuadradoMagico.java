import java.util.Scanner;

public class CuadradoMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado");
        int tamaño = scanner.nextInt();
        int [][] matriz = new int [tamaño] [tamaño];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }
}
