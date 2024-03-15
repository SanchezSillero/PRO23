public class ParaPracticar3 {
    public static void main(String[] args) {
        int numero = 0;
        int pares= 0;
        for (int i=0; i<100; i++) {
            double numeroAleatorio = Math.round(Math.random() * 1001);
            System.out.println(numeroAleatorio);

            if (numeroAleatorio % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Cantidad de npares= "+pares);

    }
}
