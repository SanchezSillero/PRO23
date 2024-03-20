/*Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.
  Una vez hecho esto realizará las siguientes operaciones:
        - modificar todos los 6 por 8
        - modificar todos los 7 por 15
        - modificar todos los 20 por 10  */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int)(Math.random()*31);
        }

        for (int item : numeros) {
            System.out.print(item+" ");
        }
    }
}
