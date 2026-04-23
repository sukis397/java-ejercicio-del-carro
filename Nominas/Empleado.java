import java.time.Year;

public abstract class Empleado {
    private static final double DESCUENTO_PRESTACIONES = 0.10;
    
    protected int id;
    protected String nombre;
    protected int edad;
    protected int añoIngreso;   
    protected double salarioBasico;

    public Empleado(int id, String nombre, int edad, int añoIngreso, double salarioBasico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.añoIngreso = añoIngreso;
        this.salarioBasico = salarioBasico;
    }

    public int getAntiguedad() {
        return Year.now().getValue() - añoIngreso;
    }

    public double getDescuentoPrestaciones() {
        return DESCUENTO_PRESTACIONES;
    }

    public abstract double calcularNomina();
    public abstract double bonificacion();
    public abstract void obtenerDetalles();
}