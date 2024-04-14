package controller;

import java.io.File;
import java.io.IOException;

public class OperacionesFicheros {
    public void lecturaInformacion(){
        //Obtener informaicon de un fichero
        File file = new File("src/resources/informacion.txt");
        // nombre, ruta, puedo leerlo, existe
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.exists());

        if (!file.exists() && file.isFile()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
