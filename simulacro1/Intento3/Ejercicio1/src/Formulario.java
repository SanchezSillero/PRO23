import utils.TipoDatoIncorrectoException;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) throws TipoDatoIncorrectoException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre = null;
        String apellidos = null;
        String dni = null;
        String email = null;
        do {
            System.out.println("1. Rellenar nombre.\n" +
                    "2. Rellenar apellidos.\n" +
                    "3. Rellenar DNI.\n" +
                    "4. Rellenar e-mail.\n" +
                    "5. Finalizar.\n");

            System.out.println("¿Que opcion quiere usar?");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = scanner.next();
                    for (int i = 0; i < nombre.length(); i++) {
                        if (Character.isLetter(nombre.charAt(i))){
                            throw new TipoDatoIncorrectoException("Solo puede contener letras");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce los apellidos");
                    apellidos = scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Introduce el dni");
                    dni = scanner.next();
                    break;
                case 4:
                    System.out.println("Introduce el email");
                    email = scanner.next();
                    break;
                case 5:
                    if (nombre==null || apellidos==null || dni==null || email==null){
                        System.out.println("Faltan datos por rellenar");
                    }
                    break;
            }
        }while (opcion != 5 || nombre==null || apellidos==null || dni==null || email==null);
    }
}
