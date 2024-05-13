import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*1.Realizar un programa que pida por teclado las 20 notas de todos los alumnos de una clase
 y las guarde dentro de una colección. (Puede ser array o arraylist)
 Al finalizar, imprimir por pantalla los siguientes datos:
    a.	La nota más alta obtenida
    b.	La nota más baja obtenida
    c.	La cantidad de aprobados
    d.	La cantidad de suspensos
    e.	La nota media*/
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las notas de los 20 alumnos");
        do {
            notas.add(sc.nextInt());
        }while (notas.size()<5);

        //a. La nota más alta obtenida
        Collections.sort(notas.reversed());
        System.out.println("La nota más alta obtenida fue: " + notas.get(0));

        //b. La nota mas baja obtenida
        Collections.sort(notas);
        System.out.println("La nota más baja obtenida fue: " + notas.get(0));

        //c. La cantidad de aprobados
        int aprobados = 0;
        for (int item : notas) {
            if (item >=5){
                aprobados++;
            }
        }
        System.out.println("La cantidad de aprobados es: " + aprobados);

        //d. La cantidad de suspensos
        int suspensos = 0;
        for (int item : notas) {
            if (item <=5){
                suspensos++;
            }
        }
        System.out.println("La cantidad de suspensos es: " + suspensos);

        //e. La nota media
        double notaMedia;
        int sumaNotas = 0;
        for (int item : notas) {
            sumaNotas += item;
        }
        notaMedia = (double) sumaNotas /notas.size();
        System.out.println("La nota media de la clase es: " + notaMedia);
    }
}
