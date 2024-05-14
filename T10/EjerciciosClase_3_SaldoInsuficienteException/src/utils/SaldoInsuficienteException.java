package utils;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, double numero) {
        super(message);
        System.out.println(message + ". No se puede realizar una operacion con el monto " + numero);
    }
}
