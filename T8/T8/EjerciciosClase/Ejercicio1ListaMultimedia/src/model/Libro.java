package model;

public class Libro extends Elemento {
    private int isbn, numeroPaginas;

    public Libro() {
    }

    public Libro(int identificador, String titulo, Persona autor, double tamaño, Formato formato, int isbn, int numeroPaginas) {
        super(identificador, titulo, autor, tamaño, formato);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(String titulo, Persona autor, double tamanio, Formato formato, int isbn, int numeroPaginas) {
        super(titulo, autor, tamanio, formato);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
