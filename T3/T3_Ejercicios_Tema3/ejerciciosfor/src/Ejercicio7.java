import java.util.Scanner;

public class Ejercicio7 {   //Simúlese el lanzamiento de un dado. Se introducirá
                            // el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas veces se va tirar el dado?");
        int nveces= scanner.nextInt();
         if (nveces<1){
             nveces=100;
         }
         for (int i=0; i<nveces; i++){
             int tirada = (int)(Math.random()*6)+1; //math random entre 0 y 0.99
             System.out.println(tirada);
         }
    }
}
