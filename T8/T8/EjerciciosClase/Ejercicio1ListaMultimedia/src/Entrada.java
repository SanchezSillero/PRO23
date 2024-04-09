import controller.Coleccion;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---BIENVENIDO AL GESTOR MULTIMEDIA---");
        System.out.println("\n\tPulse Enter para entrar");
        scanner.nextLine();
        int menuOpcion;

        do {

            System.out.println("\n---MENÚ DEL GESTOR MULTIMEDIA---\n");
            System.out.println("\t1. Añadir a la colección\n\t2. Eliminar de la colección\n\t3. Listar elementos\n\t4. Salir\n");
            System.out.println("¿Qué desea hacer?");
            menuOpcion = scanner.nextInt();

            switch (menuOpcion) {
                case 1: {
                    int opcion1;
                    do {
                        System.out.println("¿Qué tipo de elemento quiere añadir?\n\t1. Libro\t2. Video\t3. Audio\t4. Salir");
                        opcion1 = scanner.nextInt();
                        switch (opcion1) {
                            case 1: {
                                System.out.println("Introduzca el título del libro");
                                scanner.nextLine();
                                String titulo = scanner.nextLine();
                                System.out.println("Introduzca el nombre del autor");
                                String nombre = scanner.nextLine();
                                Persona autor = new Persona(nombre);
                                System.out.println("Introduzca el tamaño del archivo en MB");
                                double tamaño = scanner.nextDouble();
                                System.out.println("Introduzca el formato del archivo (AVI, MP4, MP3, WAV, PDF, EPUB)");
                                String formatoStr = scanner.next();
                                Formato formato = Formato.valueOf(formatoStr.toUpperCase());
                                System.out.println("Introduzca el ISBN del libro");
                                int isbn = scanner.nextInt();
                                System.out.println("Introduzca el número de páginas que tiene el libro");
                                int numeroPaginas = scanner.nextInt();
                                Libro libro = new Libro(titulo, autor, tamaño, formato, isbn, numeroPaginas);
                                coleccion.anadirElemento(libro);
                                break;
                            }
                            case 2: {
                                System.out.println("Introduzca el título del video");
                                scanner.nextLine();
                                String titulo = scanner.nextLine();
                                System.out.println("Introduzca el nombre del autor");
                                String nombre = scanner.nextLine();
                                Persona autor = new Persona(nombre);
                                System.out.println("Introduzca el tamaño del archivo en MB");
                                double tamaño = scanner.nextDouble();
                                System.out.println("Introduzca el formato del archivo (AVI, MP4, MP3, WAV, PDF, EPUB)");
                                String formatoStr = scanner.next();
                                Formato formato = Formato.valueOf(formatoStr.toUpperCase());
                                System.out.println("Introduzca el nombre del director");
                                String nombreDirector = scanner.next();
                                Persona director = new Persona(nombreDirector);
                                System.out.println("Introduzca el número de actores");
                                int numeroActores = scanner.nextInt();
                                ArrayList<Persona> actores = new ArrayList<>();
                                for (int i = 0; i < numeroActores; i++) {
                                    System.out.println("Introduce el nombre del actor " + (i + 1));
                                    String nombreActor = scanner.next();
                                    actores.add(new Persona(nombreActor));
                                }
                                Video video = new Video(titulo, autor, tamaño, formato, director, actores);
                                coleccion.anadirElemento(video);
                                break;
                            }
                            case 3: {
                                System.out.println("Introduzca el título del audio");
                                scanner.nextLine();
                                String titulo = scanner.nextLine();
                                System.out.println("Introduzca el nombre del autor");
                                String nombre = scanner.nextLine();
                                Persona autor = new Persona(nombre);
                                System.out.println("Introduzca el tamaño del archivo en MB");
                                double tamaño = scanner.nextDouble();
                                System.out.println("Introduzca el formato del archivo (AVI, MP4, MP3, WAV, PDF, EPUB)");
                                String formatoStr = scanner.next();
                                Formato formato = Formato.valueOf(formatoStr.toUpperCase());
                                System.out.println("Introduzca la duracion del audio");
                                double duracion = scanner.nextDouble();
                                System.out.println("Introduzca el soporte del audio(DISCO_DURO, CD, DVD, BLU_RAY, NUBE");
                                String soporteStr = scanner.next();
                                Soporte soporte = Soporte.valueOf(soporteStr.toUpperCase());
                                Audio audio = new Audio(titulo, autor, tamaño, formato, duracion, soporte);
                                coleccion.anadirElemento(audio);
                                break;
                            }
                            case 4: {
                                break;
                            }
                            default:{
                                System.out.println("Opción no válida");
                            }
                        }
                    }while (opcion1!=4);
                    break;
                }
                case 2: {
                    System.out.println("Introduzca el identificador del elemento que desea eliminar");
                    int identificador = scanner.nextInt();
                    coleccion.borrarElemento(identificador);
                    break;
                }
                case 3: {
                    int opcion3;
                    do {
                        System.out.println("¿Qué tipo de elementos quiere ver?\n\t1. Libros\t2. Videos\t3. Audios\t4. Todos\t5. Salir");
                        opcion3 = scanner.nextInt();
                        switch (opcion3){
                            case 1:{
                                System.out.println("--LISTADO DE ELEMENTOS TIPO LIBRO");
                                coleccion.listarDetalle(1);
                                break;
                            }
                            case 2:{
                                System.out.println("--LISTADO DE ELEMENTOS TIPO VIDEO");
                                coleccion.listarDetalle(2);
                                break;
                            }
                            case 3:{
                                System.out.println("--LISTADO DE ELEMENTOS TIPO AUDIO");
                                coleccion.listarDetalle(3);
                                break;
                            }
                            case 4:{
                                System.out.println("--LISTADO DE TODOS LOS ELEMENTOS");
                                coleccion.listarElemento();
                                break;
                            }
                            case 5: {
                                break;
                            }
                            default: {
                                System.out.println("Opción no válida");
                            }
                        }
                    }while(opcion3!=5);
                    break;
                }
                case 4: {
                    System.out.println("¡HASTA PRONTO!");
                    break;
                }
                default: {
                    System.out.println("Opción no valida");
                }
            }
        } while (menuOpcion != 4);

    }
}
