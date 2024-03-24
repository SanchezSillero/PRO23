import java.util.Scanner;

/* (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos*/
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número entero");
            numeros[i] = teclado.nextInt() ;
        }
        for (int item : numeros) {
            System.out.print(item+" ");
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=numeros[i]*2;
        }
        System.out.println();
        for (int item : numeros) {
            System.out.print(item+" ");
        }
        for (int item : numeros) {
         suma += item;
        }
        System.out.println("\n La suma de los elementos es: " + suma);
        double media = (double) suma/ numeros.length;
        System.out.println("\n La media de los elementos es: "+ media);

    }
}
