import java.util.Scanner;

public class Parapracticar2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un numero entero");
            int a = scanner.nextInt();

            if (a%2==0){
                a=a+1;
            }
            else if (a<10){
                a=a-1;
            } else if (a<100) {
                a=2*a;
            }
            else
                a=0;
            System.out.println(a);
        }
    }