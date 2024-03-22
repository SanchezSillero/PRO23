import java.util.Scanner;

/* Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
   Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    - Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[10];
        int eleccionMenu;
        int numeroAzar;

        //Rellenamos el array
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            palabras[i] = scanner.next();
        }

        //Desplegar menú
        System.out.println("Tienes las siguientes opciones;\n 1. Mostrar palabras introducidas\t\t\t " +
                "2. Mostrar una palabra al azar de las introducidas\n 3. Obtener la suma de todas las letras\t\t " +
                "4. Ver la media de letras por palabra\n 5. Ver la palabra con más letras\t\t\t 6. Ver la palabra con menos letras\n");


        // Requerir opcion de menu y dar solucion
        System.out.println("¿Qué opción desea (introduzca el nº correspondiente 1-6)?");
        eleccionMenu = scanner.nextInt();

        if (eleccionMenu == 1) { //mostrar array
            for (String item : palabras) {
                System.out.print(item + " ");
            }

        } else if (eleccionMenu==2) { //mostrar una posicion al azar del array
            numeroAzar=(int)(Math.random()*10);
            System.out.println( palabras[numeroAzar]);


        } else if (eleccionMenu==3) { //sumar todas las letras
            


        } else if (eleccionMenu==4) { //media de letras por palabra

        } else if (eleccionMenu==5) { //palabra con mas letras

        } else if (eleccionMenu==6) { //palabra con menos letras

        }else
*/

        }
    }
}
