import controller.Empresa;
import model.*;

public class Entrada {
    public static void main(String[] args) {
        Asalariado asalariado = new Asalariado("12345678A", "Nombre", "correo@correo", 15000, 14);
        Asalariado asalariado1 = new Asalariado("12345678A", "Nombre1", "correo@correo", 15000, 14);
        Asalariado asalariado2 = new Asalariado("12345678A", "Nombre2", "correo@correo", 15000, 14);
        Asalariado asalariado3 = new Asalariado("12345678A", "Nombre3", "correo@correo", 15000, 14);
        Autonomo autonomo = new Autonomo("876543221A", "Juan", "juancorreo@correo", 25000, 5000, 1500);
        Jefe jefe1 = new Jefe("65432187B", "Boss", "nomandescorreos@correo.com", 75000, 49, Puesto.direccion);
        Jefe jefe2 = new Jefe("65432187B", "Boss2", "nomandescorreos@correo.com", 75000, 49, Puesto.gerencia);
        Accionista accionista = new Accionista("65432187B", "Accioner", "mandacorreos@correo.com");

        Empresa empresa = new Empresa();
        empresa.agregarPersona(asalariado);
        empresa.agregarPersona(asalariado1);
        empresa.agregarPersona(asalariado2);
        empresa.agregarPersona(asalariado3);
        empresa.agregarPersona(jefe1);
        empresa.agregarPersona(jefe2);
        empresa.agregarPersona(autonomo);
        empresa.agregarPersona(accionista);

        empresa.empezarJornadaLaboral();
        empresa.realizarVotacion();

        jefe2.mostrarDatos();
    }
}
