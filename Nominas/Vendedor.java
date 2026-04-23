package nomina;

public class Vendedor extends Empleado {
    private double ventasTotalesMes;
    private static final double PORCENTAJE_COMISION = 0.15;

    public Vendedor(String id, String nombre, int edad, int anioIngreso, double salarioBasico, double ventasTotalesMes) {
        super(id, nombre, edad, anioIngreso, salarioBasico);
        this.ventasTotalesMes = ventasTotalesMes;
    }

    public double calcularComision() {
        return ventasTotalesMes * PORCENTAJE_COMISION;
    }

    @Override
    public double bonificacion() {
        if (getAntiguedad() > 5) {
            return salarioBasico * 0.10;
        }
        return 0;
    }

    @Override
    public double calcularNomina() {
        double totalDevengado = salarioBasico + calcularComision() + bonificacion();
        return totalDevengado - (totalDevengado * 0.10);
    }

    @Override
    public String obtenerDetalles() {
        return "Vendedor, " + super.obtenerDetalles() + ", " + ventasTotalesMes + ", " + 
               calcularComision() + ", " + bonificacion() + ", " + (salarioBasico * 0.10) + ", " + calcularNomina();
    }
}