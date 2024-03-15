
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        for (int i=numero1; i<=numero2; i++){
            System.out.println("tabla de multiplicar del "+i);
            for (int j=0; j<=10; j++){
                System.out.printf("\t%d x %d = %d\n",i,j,+i*j); //no entiendo
            }
        }
    }
}