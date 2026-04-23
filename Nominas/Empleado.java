package nomina;

public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected int edad;
    protected int anioIngreso;
    protected double salarioBasico;

    public Empleado(String id, String nombre, int edad, int anioIngreso, double salarioBasico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
        this.salarioBasico = salarioBasico;
    }

    public abstract double calcularNomina();

    public int getAntiguedad() {
        return 2026 - anioIngreso;
    }

    public abstract double bonificacion();

    public String obtenerDetalles() {
        return id + ", " + nombre + ", " + anioIngreso + ", " + salarioBasico;
    }
}