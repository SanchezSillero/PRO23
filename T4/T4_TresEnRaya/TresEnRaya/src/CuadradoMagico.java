import java.util.Scanner;

public class CuadradoMagico {
    static int[][] cuadradoMagico;
    static int sumaMagica, sumaAuxiliar;

    public static void main(String[] args) {
        tamañoCuadrado();
    }

    public static void tamañoCuadrado() {
        // tamaño del array multidimensional
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
                    aleatorio = (int) (Math.random() * 10);
                } while (estaNumero(aleatorio));
                cuadradoMagico[i][j] = aleatorio;
            }
        }
        calcularSumaMagica();
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
                System.out.println("el cuadrado magico es");
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }


    public static boolean esCuadradoMagico() {
        if (!comprobarFilas() || !comprobarColumnas() || !comprobarDiagonalPrincipal() || !comprobarDiagonalSecundaria()) {
            return false;
        }
        return true;
    }

    public static boolean comprobarFilas() {
        //comprobar filas
        for (int i = 0; i < cuadradoMagico.length; i++) {
            sumaAuxiliar = 0;
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                sumaAuxiliar += cuadradoMagico[i][j];
            }
            calcularSumaMagica();
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
            calcularSumaMagica();
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
        calcularSumaMagica();
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
        calcularSumaMagica();
        if (sumaAuxiliar != sumaMagica) {
            return false;
        }
        return true;
    }

    public static void generarMagico() {
        do {
            rellenarCuadrado();
        } while (!esCuadradoMagico());
    }
}


/* public static void comprobarDatos(){
        do {
            esMagico = true;
            rellenarCuadrado();
            //comprobar filas
            for (int i = 0; i < cuadradoMagico.length; i++) {
                sumaAuxiliar = 0;
                for (int j = 0; j < cuadradoMagico[i].length; j++) {
                    sumaAuxiliar += cuadradoMagico[i][j];
                }
                calcularSumaMagica();
                System.out.println("suma auxiliar=" + sumaAuxiliar);
                System.out.println("suma magica=" + sumaMagica);
                if (sumaAuxiliar != sumaMagica) {
                    esMagico = false;
                    break;
                }


            }
            //comprobar columnas
            for (int j = 0; j < cuadradoMagico.length; j++) {
                sumaAuxiliar = 0;
                for (int i = 0; i < cuadradoMagico[j].length; i++) {
                    sumaAuxiliar += cuadradoMagico[i][j];
                }
                if (sumaAuxiliar != sumaMagica) {
                    esMagico = false;
                    break;
                }
            }

            //comprobar diagonal principal
            sumaAuxiliar = 0;
            for (int i = 0; i < cuadradoMagico.length; i++) {
                sumaAuxiliar += cuadradoMagico[i][i];
            }
            if (sumaAuxiliar != sumaMagica) {
                esMagico = false;
                break;
            }


            //comprobal diagonal secundaria
            sumaAuxiliar = 0;
            for (int i = 0; i < cuadradoMagico.length; i++) {
                sumaAuxiliar += cuadradoMagico[i][cuadradoMagico.length - 1 - i];
            }
            if (sumaAuxiliar != sumaMagica) {
                esMagico = false;
                break;
            }

        } while (!esMagico);
        System.out.println("El cuadrado mágico es");
        mostrarCuadrado();
    }*/