/* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
   Carga el array numero con valores aleatorios entre 0 y 100.
    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int [20];  // definimos arrays
        int[] cuadrado = new int [20];
        int[] cubo = new int [20];

        for (int i = 0; i < numero.length; i++) { // damos valores aleatorios al array numeros
            numero[i]=(int)(Math.random()*101);
            System.out.print(numero[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < cuadrado.length; i++) { //almacenamos los valores al cuadrado
            cuadrado[i] = (numero[i]*numero[i]);
            System.out.print(cuadrado[i]+" ");
        }

        System.out.println();
        for (int i = 0; i < cubo.length; i++) { //almacenamos los valores al cubo
            cubo[i]= (numero[i]*numero[i]*numero[i]);
            System.out.print(cubo[i]+ " ");

        }
    }
}
