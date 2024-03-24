import java.util.Scanner;

/*3. (SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("longitud1");
        int long1= teclado.nextInt();
        System.out.println("longitud2");
        int long2= teclado.nextInt();
        int [] array1 = new int[long1];
        int [] array2 = new int[long2];
        int [] array3= new int[Math.max(long1,long2)];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("numero");
            array1[i]= teclado.nextInt();
        }
        for (int i = 0; i <array2.length; i++) {
            System.out.println("numero");
            array2[i]= teclado.nextInt();
        }
        for (int i = 0; i <array3.length ; i++) {
            int posiciones1 = (i<long1) ? array1[i] : 0;
            int posiciones2 = (i<long2) ? array2[i] : 0;
            array3[i] = posiciones1+posiciones2;
        }
        for (int item : array3) {
            System.out.print(item+" ");
        }
    }
}
