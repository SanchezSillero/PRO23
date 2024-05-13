import java.util.Scanner;

/* 2.Realiza las siguientes acciones dentro de una misma clase:
a. Una clase llamada Entrada que contenga un método main. Realiza las siguientes acciones dentro de la clase
    i.Crea las siguientes variables: nombre, apellido, edad, altura, peso, sexo (M/F).
      Pon el tipo que consideres correcto
    ii.Pide por consola cada uno de los datos anteriores y guárdalos en las variables
    iii.Crea una variable llamada IMC
b. Crea un método estático llamado calculoIMC el cual pida por parámetros el peso (en kg) y la altura (en m).
    Este método retornará el valor obtenido en la siguiente fórmula peso
c. En el método main, iguala el valor de la variable IMC al retorno del método creado en el punto anterior
d. Imprime por consola un mensaje con el siguiente formato

“Hola Borja tu IMC teniendo en cuenta tu altura de 174cm y tu peso de 68kg, tiene un valor de 19,54”
 */
public class Entrada {
    public static void main(String[] args) {
        String nombre, apellido;
        int edad;
        double altura, peso;
        char sexo;
        double IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        nombre = sc.next();
        System.out.println("Introduzca su apellido");
        apellido= sc.next();
        System.out.println("Introduzca su edad");
        edad = sc.nextInt();
        System.out.println("Introduzca su altura en m");
        altura = sc.nextDouble();
        System.out.println("Introduzca su peso en kg");
        peso= sc.nextDouble();
        System.out.println("Introduzca su sexo");
        sexo = sc.next().charAt(0);

        IMC = calculoIMC(altura, peso);

        System.out.println("Hola "+nombre+", tu IMC teniendo en cuenta tu altura de "+altura+ " metros y tu peso de "+peso+ "kg, tiene un valor de "+IMC);
    }

    public static double calculoIMC (double altura, double peso){
        double IMC = peso/Math.pow(altura, 2);
        return IMC;
    }
}
