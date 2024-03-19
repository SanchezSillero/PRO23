import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

     //PASO 1 introducir variables y mostrarlas en consola en una linea

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter variable1");
        int variable1= myObj1.nextInt();
        System.out.println("variable1: "+ variable1);
        // porq despues de ejecutar el ejercicio 2 si vulevo al 1 e intento ejecutarlo, automaticamente ejecuta el 2
        // como hago que las variables sean valores enteros, donde poner int?


        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter variable2");
        int variable2= myObj2.nextInt();
        System.out.println("variable2: "+ variable2);

        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Enter variable3");
        int variable3= myObj1.nextInt();
        System.out.println("variable3: "+ variable3);

        Scanner myObj4 = new Scanner(System.in);
        System.out.println("Enter variable4");
        int variable4= myObj1.nextInt();
        System.out.println("variable4: "+ variable4);

        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Enter variable5");
        int variable5= myObj1.nextInt();
        System.out.println("variable5: "+ variable5);

        System.out.println("variables originales: " + variable1+ " " +variable2+ " "+variable3+ " "+variable4+ " "+variable5);



    //PASO 2: Rotar valores a la izquierda
        int temp= variable1;
        variable1 = variable2;
        variable2 = variable3;
        variable3 = variable4 ;
        variable4 = variable5 ;
        variable5 = temp;


    //PASO 3 : mostrar valores rotados

        System.out.println("variables rotadas: " + variable1+ " " +variable2+ " "+variable3+ " "+variable4+ " "+variable5);


    }
}