/* Crea una excepción nueva llamada ErrorValidacionDNI que represente un error en la validación de un DNI.
Crea también un método que, dado un String con un DNI, valide este y lance la excepción que hemos definido cuando no se cumpla alguna de las restricciones.
Para la validación, simplemente tendremos en cuenta estas tres normas:
· La longitud exacta de la cadena será de 9 caracteres.
· El último carácter será una letra.
· Los 8 primeros caracteres deberán ser dígitos.
Puedes utilizar los métodos isDigit() e isNumber() de la clase Character para efectuar las comprobaciones. */

import exception.ErrorValidacionDNI;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws ErrorValidacionDNI {
        String dni;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce DNi");
        dni = sc.nextLine();
        validarDNI(dni);
    }
    public static void validarDNI (String dni) throws ErrorValidacionDNI {
        if (dni.length()!=9) throw new ErrorValidacionDNI("Longitud no válida");
        if (!Character.isLetter(dni.charAt(8))) throw new ErrorValidacionDNI("El ultimo caracter debe ser una letra");
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) throw new ErrorValidacionDNI("Los primeros ocho caracteres deben ser numeros");
        }

    }

}
