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
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]
        }
    }
}