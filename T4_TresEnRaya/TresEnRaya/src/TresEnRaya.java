import java.util.Scanner;

public class TresEnRaya {
    static char[][] tablero;
    static char jugadorActual='X';
    static boolean juegoTerminado = false;

    public static void main(String[] args) {
        generarTablero();
        mostrarTablero();

        while (juegoTerminado != true) {
            turnoJugador();
            mostrarTablero();
            if (hayGanador()) {
                System.out.println("Enhorabuena, el jugador " + jugadorActual + " ha ganado");
                break;
            } else if (tableroLleno()) {
                System.out.println("Empate!");
                juegoTerminado = true;
            }
            cambiarJugador();
        }


    }


    public static void generarTablero() { //Generar una matriz 3 x 3
        tablero = new char[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void turnoJugador() {
        System.out.println("turno jugador " + jugadorActual);
        System.out.println("elija donde colocar su ficha, ingrese fila (0-2) y columna (0-2)");
        Scanner scanner = new Scanner(System.in);
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != '-') {
            System.out.println("coordenadas no validas, por favor ingrese de nuevo");
            turnoJugador();
        } else {
            tablero[fila][columna] = jugadorActual;
        }
    }

    public static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    public static boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual ||
                    tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;
            }
        }
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual ||
                tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }
        return false;
    }

    public static boolean tableroLleno() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }

            }

        }
        return true;
    }
}
