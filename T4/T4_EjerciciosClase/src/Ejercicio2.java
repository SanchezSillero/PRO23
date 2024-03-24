import java.util.Scanner;
/*(MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] numeros = new int[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println(numeroMayor);
        System.out.println(numeroMenor);
    }
}
