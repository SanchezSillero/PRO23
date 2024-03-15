public class Ejercicio5 {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;

        if (base==0 && exponente==0){
            System.out.println("no se puede calcular");
        } else {
            int resultado=1;
            for (int i=0; i<=exponente; i++){
                resultado *= base;
                }
            System.out.println(resultado);
        }
    }
}
