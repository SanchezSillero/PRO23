import java.util.Scanner;

/*4. (PosicionesArray) Crea una aplicación que:
    - pida por teclado la longitud de un array
    - cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
    - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] numeros = new int[tamaño];
        int aux;
        int[] numerosDerecha = new int[tamaño];
        int[] numerosIzquierda = new int[tamaño];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        aux = numeros[tamaño - 1];
        for (int i = tamaño - 1; i > 0; i--) {
            numerosDerecha[i] = numeros[i - 1];
        }
        numerosDerecha[0] = aux;

        System.out.println();
        for (int item : numerosDerecha) {
            System.out.print(item + " ");
        }

        aux = numeros[0];
        for (int i = 0; i < tamaño - 1; i++) {
            numerosIzquierda[i] = numeros[i + 1];
        }
        numerosIzquierda[tamaño - 1] = aux;

        System.out.println();
        for (int item : numerosIzquierda) {
            System.out.print(item + " ");
        }
    }
}