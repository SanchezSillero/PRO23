// Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
//a) Suma
//b) Resta
//c) Multiplicación
//d) División entera
//e) Resto entero

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

// PASO 1: introducir dos variables enteras
        System.out.print("Introduzca el valor de la variable 1:");
        Scanner scanner = new Scanner(System.in);
        int variable1 = scanner.nextInt();
        System.out.print("Introduzca el valor de la variable 2:");
        Scanner scanner1 = new Scanner(System.in);
        int variable2 = scanner1.nextInt();

// PASO 2: Mostras variables en pantalla
        System.out.println("variable 1 = "+variable1+ ", variable 2 = "+variable2);


// PASO 3: Obtener las operaciones de suma resta multiplicacion division y resto
    //suma
        int suma = variable1 + variable2;

    //resta
        int resta = variable1 - variable2;

    //multiplicacion
        int multiplicacion = variable1 * variable2;

    //division
        int division = variable1 / variable2;

    //resto
        int resto = variable1 % variable2;

    //mostrar en pantalla

        System.out.println("Suma = " + suma ); ;
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicación = " + multiplicacion);
        System.out.println("División entera= " + division) ;
        System.out.println("Resto = " + resto) ;
    }
}
