import java.util.Scanner;

public class ParaPracticar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = scanner.nextInt();

        if (numero<0 || numero>10){
            System.out.println("dato erróneo");
        }
        else
            for (int i=0; i<11 ;i++ )
            System.out.printf("\t%d por %d = %d;", numero, i, numero*i);
    }
}
