public class Ejercicio1 {


    public static void main(String[] args) {
        final String name = "Francisco Sánchez Sillero";
        final String adress= "Calle Guadalquivir";
        final int numeroPortal= 4;
        final int numeroPiso= 2;
        final char letraPiso = 'A'; // error al usar char, porq comilla simple
        final int codigoPostal= 14700;
        final String localidad= "Palma del Río";
        final String provincia="Córdoba";
        final String pais = "España";
        System.out.println(name);
        System.out.println(adress+ " nº "+numeroPortal+","+ " "+numeroPiso+letraPiso);
        System.out.println(provincia+" "+codigoPostal);
        System.out.println(pais);

        // puedo hacer todo esto solo con un System.out
        // como añado un salto de linea entre cada System.out...
        // se puede optimizar o tengo q abrir "" para meter los espacios entre variables del system.out


    }
}
