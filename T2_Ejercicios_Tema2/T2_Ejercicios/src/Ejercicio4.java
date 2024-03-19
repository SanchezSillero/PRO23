/* Ejercicio 4. Hágase un programa que convierta segundos en horas, minutos y segundos.
        (Segundos)
        ENTRADA/SALIDA
        Número de segundos: 24973
        Horas: 6
        Minutos: 56
        Segundos: 13 */
public class Ejercicio4 {
    public static void main(String[] args) {

        int tiempo= 24973;
        System.out.println("Tiempo= "+tiempo+"s");

        int horas= tiempo/3600;
        int restoHoras= tiempo%3600;
        int minutos = restoHoras/60;
        int restoMinutos = restoHoras%60;

        System.out.println("24973 segundos = " + horas + " horas " + minutos + " minutos " + restoMinutos + " segundos");
    }
