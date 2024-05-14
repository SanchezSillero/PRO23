import utils.*;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) throws TipoDatoIncorrectoException, LongitudDNINoValidaException, UltimoDigitoNoLetraException, NumeracionContieneLetrasException, EmailIncorrectoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Rellenar nombre");
        System.out.println("2. Rellenar apellidos");
        System.out.println("3. Rellenar DNI");
        System.out.println("4. Rellenar e-mail");
        System.out.println("5. Finalizar");

        int opcion;
        String nombre=null, apellidos=null, dni=null, email=null;

        do {
            System.out.println("Elija una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Introduzca su nombre");
                    nombre = scanner.next();
                    for (int i = 0; i < nombre.length(); i++) {
                        if (Character.isDigit(nombre.charAt(i))){
                            throw new TipoDatoIncorrectoException("Solo puede contener letras");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Introduzca sus apellidos");
                    scanner.nextLine();
                    apellidos = scanner.nextLine();
                    for (int i = 0; i < apellidos.length(); i++) {
                        if (Character.isDigit(apellidos.charAt(i))){
                            throw new TipoDatoIncorrectoException("Solo puede contener letras");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Introduzca su DNI");
                    dni = scanner.next();
                    if (dni.length()!=9){
                        throw new LongitudDNINoValidaException("El DNI debe ser de 9 dígitos");
                    } else if (!Character.isLetter(dni.charAt(8))) {
                        throw new UltimoDigitoNoLetraException("El ultimo digito debe ser una letra");
                    }
                    for (int i = 0; i < 8; i++) {
                        if (!Character.isDigit(dni.charAt(i))){
                            throw new NumeracionContieneLetrasException("Los primeros 8 digitos solo pueden ser numeros");
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Introduzca su email");
                    email = scanner.next();
                    for (int i = 0; i < email.length(); i++) {
                        if (!email.contains("@") || !email.contains(".")){
                            throw new EmailIncorrectoException("El email debe contener '@' y '.'");
                        }
                    }
                    break;
                }
                case 5: {
                    if (nombre==null || apellidos==null || dni==null || email==null){
                        System.out.println("Faltan datos por rellenar");
                    }
                    break;
                }
            }
        } while (opcion != 5 && nombre==null || apellidos==null || dni==null || email==null);

        System.out.println("Datos introducidos: \n\tNombre: " +nombre+ "\n\tApellidos: "+apellidos+ "\n\tDNI: "+dni+"\n\tEmail: "+email);
    }
}
