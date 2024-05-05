import java.util.Scanner;

public class Formulario {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido, a continuación podrá rellenar su formulario");
        pulseEnter();
        int opcion;
        String nombre = null;
        String apellidos = null;
        String dni = null;
        String email = null;
        boolean valido = true;
        do {
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellidos");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Rellenar email");
            System.out.println("5. Finalizar");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    scanner.nextLine();
                    System.out.println("Introduzca su nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println(nombre);
                    pulseEnter();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Introduzca sus apellidos: ");
                    apellidos = scanner.nextLine();
                    System.out.println(apellidos);
                    pulseEnter();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Introduzca su DNI: ");
                    dni = scanner.nextLine();
                    System.out.println(dni);
                    pulseEnter();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Introduzca su email: ");
                    email = scanner.nextLine();
                    System.out.println(email);
                    pulseEnter();
                    break;
                case 5:
                    if (nombre == null || apellidos == null || dni == null || email == null){
                        valido = false;
                        System.out.println("Debes rellenar todos los campos del formulario");
                    }else {
                    System.out.println("¡Hasta pronto!");
                    }
                    break;
            }

        }while (opcion != 5 || !valido);
    }
    public static void pulseEnter(){
        System.out.println("Pulse Enter para continuar");
        scanner.nextLine();
    }
}
