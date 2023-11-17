import java.util.Scanner;

public class Ejercicio2_2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] variables= new int[5];
        // corchetes son un array? como funciona el new??ç

        //paso 1: leer las 5 variables enteras
        for (int i=0;i<5;i++) {
            System.out.println("Enter variable " + (i + 1) + ": ");
            variables[i] = scanner.nextInt();
        }
            //nextInt es por ser n entero y nexLine es por ser texto?

        //paso 2: mostrar las variables separadas por un espacio
            System.out.print("variables originales: ");
            for (int i=0; i<5; i++) {
                System.out.print(variables[i] + " "); //diferencia entre print y println
            }

        //paso 3: rote los valores hacia la izquierda, la 1 tome el valor de la 2...
        int temp = variables[0];
            //esto es un entero con valor la variable 0, q es la primera??

        for (int i = 0; i < 4; i++) {
            variables[i] = variables[i + 1]; //esta reescribiendo el valor de variables a variables +1
        }
        variables[4] = temp; //la ultima en esta caso la 4 se reescribe al temp donde asignamos el valor de la var1

        // Paso 4: Mostrar las variables rotadas
        System.out.print("Variables rotadas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(variables[i] + " ");
        }


        scanner.close(); //para liberar recursos conviene cerrar manualmente



    }
}
