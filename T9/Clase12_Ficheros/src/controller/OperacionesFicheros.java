package controller;

import java.io.File;
import java.io.IOException;

public class OperacionesFicheros {
    public void lecturaInformacion(){
        //Obtener informaicon de un fichero
        File file = new File("src/resources");
        // nombre, ruta, puedo leerlo, puedo ejecutarlo existe
        /*System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.exists());*/

        /*if (!file.exists()){
            try {
                file.createNewFile();//crear fichero
            } catch (IOException e) {
                System.out.println("Fallo en la creacion del fichero");
            }

        }*/

        /*if (!file.exists()){
            file.mkdir(); //crear un fichero; mkdirs, crea esa carpeta y las que no existan de la ruta proporcionada
        }*/
        if (file.isDirectory()){
            //saca todos los nombres que tienes dentro
           /* String[] nombres = file.list();
            for (String nombre : nombres) {
                System.out.println(nombre);
            }*/
                    
             //saca todos los ficheros que tienes dentro //min 44 clase 13
            File[] ficheros= file.listFiles();
            for (File item : ficheros) {
                if (item.isDirectory()){
                    System.out.println("esto es un directectoi");
                }
            }
        }
    }

    public void lect
}
