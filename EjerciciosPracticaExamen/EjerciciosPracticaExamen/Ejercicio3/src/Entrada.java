import controller.Sistema;
import model.Usuario;

/* 3.	Desarrolla una aplicación que permita simular el funcionamiento de un sistema de login. Para ello crea las siguientes clases
a.	model.Usuario:
i.	tendrá como características un nombre, correo y contraseña
ii.	tendrá como métodos un mostrarDatos que sacará por consola todos los datos del usuario además de los constructores que consideres necesarios
b.	Sistema:
i.	Tendrá como características una lista de usarios. Esta lista se inicializará en el constructor por defecto
ii.	Tendrá como métodos los siguientes
1.	darAltaUsuario: pedirá por parámetro un usuario y lo meterá dentro de la lista
2.	loginUsuario: retornará un booleano indicando si el usuario está o no dentro de la lista
c.	Entrada: la cual tendrá las siguientes ejecuciones dentro de un método main
i.	Crea una instancia de sistema
ii.	Crea 3 usuarios con los datos que tú quieras (introducidos manualmente)
iii.	Da de alta los usuarios en el sistema
iv.	Muestra los datos de todos los usuarios
v.	Intenta hacer login en el sistema con un correo y contraseña que no esté en el sistema. Se deberá mostrar un mensaje de aviso indicando del resultado
vi.	Intenta hacer login en el sistema con un correo y contraseña que si esté en el sistema. Se deberá mostrar un mensaje de aviso indicando del resultado
 */
public class Entrada {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Usuario usuario1 = new Usuario("nombre1", "correo1@gmail.com", "password1");
        Usuario usuario2 = new Usuario("nombre2", "correo2@gmail.com", "password2");
        Usuario usuario3 = new Usuario("nombre3", "correo3@gmail.com", "password3");

        sistema.darAltaUsuraio(usuario1);
        sistema.darAltaUsuraio(usuario2);
        sistema.darAltaUsuraio(usuario3);

        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        usuario3.mostrarDatos();

        sistema.loginUsuario("correoMal@gmail.com", "passwordMal");
        sistema.loginUsuario("correo1@gmail.com", "password1");
    }
}
