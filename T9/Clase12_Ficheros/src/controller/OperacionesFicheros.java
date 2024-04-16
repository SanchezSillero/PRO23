package controller;

import model.Usuario;

import java.io.*;

public class OperacionesFicheros {

    //SACAR INFORMACION DE LOS FICHEROS
    public void lecturaInformacion() {
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
        if (file.isDirectory()) {
            //saca todos los nombres que tienes dentro
           /* String[] nombres = file.list();
            for (String nombre : nombres) {
                System.out.println(nombre);
            }*/

            //saca todos los ficheros que tienes dentro //min 44 clase 13
            File[] ficheros = file.listFiles();
            for (File item : ficheros) {
                if (item.isDirectory()) {
                    System.out.println("esto es un directectoi");
                }
            }
        }
    }


    //OPERACIONES SOBRE FICHEROS
    public void lecturaFichero() {
        File file = new File("src/resources/ejemplos/lectura.txt");
        //File -> FileReader (caracter a caracter) -> BufferedReader (linea a linea)


        FileReader fileReader = null; //este objeto me permite poner un fichero en modo lectura
        /* lo igualamos a nulo en vez de igualarlo directamente porque como todo flujo de  datos se tiene que se cerrar,
        primero lo igualo a nullo, luego lo inicializo para poder meterlo dentro de un bloque try catch, porque lo voy a cerrar
        siempre en el finally, que se ejecuta de todas todas y queremos cerrar los flujos de todas todas */

        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);//lo inincializo. Abro el flujo
            bufferedReader = new BufferedReader(fileReader);
            //leo linea a linea -> readline()
            //lee si existe/ (caracter a caracter) -> read()
            //leer el fichero de forma completa -> hasta que codigo sea -1(ausencia de datos)
            //int codigo =  fileReader.read();
            /*int codigo = -1;
            while ((codigo=fileReader.read())!=-1){
                System.out.print((char) codigo);
            }*/

            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("El fichero no se puede leer");
        } finally {//cierro el flujo
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
                ;
            } catch (NullPointerException e) {//Recomendable poner
                System.out.println("Cerrado en nulo");
            }
        }
    }

    public void escrituraFichero() {
        //File - FileWriter - PrintWriter

        File file = new File("src/resources/ejemplos/escritura.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file); //sin el true pisa lo ya escrito, con el true anexa
            //fileWriter.write(45);*/
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esto es una frase con printWriter");
            printWriter.println("Esto es la segunda frase");

        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                fileWriter.close();
                printWriter.close();
            } catch (IOException e) {
                System.out.println("error al cerrar");
            } catch (NullPointerException e) {
                System.out.println("Cerrado en nulo");
            }
        }
    }

    public void escrituraObjeto() {
        // ObjectOutputStream -> FileOutputStream -> File

        ObjectOutputStream objectOutputStream = null;
        //FileOutputStream fileOutputStream;//lo creamos directamente en el constructor
        File file = new File("src/resources/ejemplos/usuarios.obj");

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(new Usuario("Francisco", "micorreo@....", 30, "cordoba"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            } catch (NullPointerException e) {
                System.out.println("Cerrado en nulo");
            }
        }
    }

    public void lecturaObjeto() {
        // ObjectInputStream -> FileInputStream -> File
        ObjectInputStream objectInputStream = null;
        File file = new File("src/resources/ejemplos/usuarios.obj");
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Usuario usuario = (Usuario) objectInputStream.readObject();
            System.out.println(usuario); // model.Usuaruio@123da4 -> HEXADECIMAL (el espacio de la memoria ubicado del objeto), se soluciona con el toString

        } catch (IOException e) {
            System.out.println("error en la lectura");
        } catch (ClassCastException e) {
            System.out.println("error en el casteo de la clase");
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            } catch (NullPointerException e) {
                System.out.println("Cerrado en nulo");
            }
        }
    }


}
