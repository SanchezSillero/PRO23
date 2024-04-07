package model;

public enum Puesto {
    //DATOS FIJOS

    mando("este puesto manda sobre el resto", 1000), gerencia("este puesto controla", 1520), direccion("este dirige", 1000);

    private String descripcion;
    private int salarioAdicion;

    Puesto(String descripcion, int salarioAdicion) {
        this.descripcion = descripcion;
        this.salarioAdicion = salarioAdicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSalarioAdicion() {
        return salarioAdicion;
    }

    public void setSalarioAdicion(int salarioAdicion) {
        this.salarioAdicion = salarioAdicion;
    }
}
