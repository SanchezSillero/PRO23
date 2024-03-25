import java.util.Scanner;

public class CuadradoMagico {
    static int[][] cuadradoMagico;
    static int sumaMagica, sumaAuxiliar;


    public static void main(String[] args) {

        tamañoCuadrado();
        calcularSumaMagica();
        do {
            rellenarCuadrado();
        }while (!esMagico());
        mostrarCuadrado();
    }


    public static void tamañoCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado");
        int tamaño = scanner.nextInt();
        cuadradoMagico = new int[tamaño][tamaño];
    }

    public static void rellenarCuadrado() {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random() * 9)+1;
                } while (estaNumero(aleatorio));
                cuadradoMagico[i][j] = aleatorio;
            }
        }
    }


    public static boolean estaNumero(int numero) {
        for (int[] fila : cuadradoMagico) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void calcularSumaMagica() {
        sumaMagica = 0;
        for (int j = 0; j < cuadradoMagico[0].length; j++) {
            sumaMagica += cuadradoMagico[0][j];
        }
    }

    public static void mostrarCuadrado() {
        for (int[] fila : cuadradoMagico) {
            for (int item : fila) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static boolean esMagico() {
        if (comprobarFilas() && comprobarColumnas() && comprobarDiagonalPrincipal() && comprobarDiagonalSecundaria()) {
            return true;
        }
        return false;
    }

    public static boolean comprobarFilas() {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumaAuxiliar = 0;
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                sumaAuxiliar += cuadradoMagico[i][j];
            }
            System.out.println(sumaAuxiliar);
            if (sumaAuxiliar != sumaMagica) {
                return false;
            }
        }
        return true;
    }


    public static boolean comprobarColumnas() {
        for (int j = 0; j < cuadradoMagico.length; j++) {
            sumaAuxiliar = 0;
            for (int i = 0; i < cuadradoMagico[j].length; i++) {
                sumaAuxiliar += cuadradoMagico[i][j];
            }
            System.out.println(sumaAuxiliar);
            if (sumaAuxiliar != sumaMagica) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarDiagonalPrincipal() {
        sumaAuxiliar = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumaAuxiliar += cuadradoMagico[i][i];
        }
        System.out.println(sumaAuxiliar);
        if (sumaAuxiliar != sumaMagica) {
            return false;
        }
        return true;
    }

    public static boolean comprobarDiagonalSecundaria() {
        sumaAuxiliar = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumaAuxiliar += cuadradoMagico[i][cuadradoMagico.length - 1 - i];
        }
        System.out.println(sumaAuxiliar);
        if (sumaAuxiliar != sumaMagica) {
            return false;
        }
        return true;
    }

}
