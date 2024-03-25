/*(OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática).
  Se mostrarán los datos separados por una coma y un espacio.
  Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.
  hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones*/
public class Ejercicio5 {
    static int[] numeros = new int[10];

    public static void main(String[] args) {
        System.out.println("Generando 10 numeros aleatorios...");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        mostrarArray();
    }

    //Metodos para el menu

    static public void mostrarArray() {
        System.out.println();
        for (int item : numeros) {
            System.out.print(item + ", ");
        }
    }

    static public void incrementarPares() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] + 1;
            } else numeros[i] = numeros[i] - 1;
        }
        mostrarArray();
    }

    static public void duplicarPositivos() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0 && numeros[i] < 5) {
                numeros[i] = numeros[i] * 2;
            }
        }
        mostrarArray();
    }

    static public void sumarYrestar() {
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 11) - 5;
            numeros[i] += aleatorio;
        }
        mostrarArray();
    }

    static public void moverDerecha() {
        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = aux;
        mostrarArray();
    }

    static public void intercambios() {
        for (int i = 0; i < numeros.length - 1; i += 2) {
            int aux = numeros[i];
            numeros[i] = numeros[i + 1];
            numeros[i + 1] = aux;
        }
        mostrarArray();
    }

    static public void invertir() {
        System.out.println();
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i]+", ");
        }
    }

    static public void primerParUltimoImpar(){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                System.out.print("el primer par es "+numeros[i]);
                break;
            }
        }
        System.out.println();
        for (int i = numeros.length-1; i >=0 ; i--) {
            if (numeros[i]%2!=0){
                System.out.print("el último impar es "+numeros[i]);
                break;
            }
        }

    }

}


