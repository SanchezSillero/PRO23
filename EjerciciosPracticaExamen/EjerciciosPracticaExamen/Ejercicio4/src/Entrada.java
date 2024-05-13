import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 4001) + 1000;
        System.out.println(aleatorio);

        int intentos=5;
        do {
            System.out.println("Introduzca la combinación de la caja fuerte");
            int introducido = sc.nextInt();
            intentos--;
            if (aleatorio == introducido) {
                System.out.println("Enhorabuena, has abierto la caja");
                break;
            }else {
                System.out.println("Error, te quedan "+ intentos +" intentos");
            }
            if(intentos==0){
                System.out.println("Caja bloqueada, has perdido la opertunidad");
            }
        }while (intentos>0);
    }
}
