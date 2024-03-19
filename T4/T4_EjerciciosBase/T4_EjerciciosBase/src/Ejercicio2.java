public class Ejercicio2 {
    /*Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
        Una vez metidos, se deberá mostrar:
            - Numero de puntos obtenidos
            - Media de puntos obtenidos*/
    public static void main(String[] args) {
        int[] numeros = new int[30];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            System.out.print(numeros[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
                    }
        System.out.println("La suma de los elementos del array es: " + suma);

        double media = (double) suma / numeros.length;

        System.out.println();
        System.out.println("La media de los elementos del array es:  " + media);


    }
}
