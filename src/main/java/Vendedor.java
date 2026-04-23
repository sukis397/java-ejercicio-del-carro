public class Vendedor extends Empleado {
    private double VentasTotalesMes;
    private static final double PORCENTAJE_COMISION = 0.15;

    public Vendedor(int id, String nombre, int edad, int añoIngreso, double salarioBasico, double totalVentas) {
        super(id, nombre, edad, añoIngreso, salarioBasico);
        this.VentasTotalesMes = totalVentas;
    }

    public double getComision() {
        return VentasTotalesMes * PORCENTAJE_COMISION;
    }

    @Override
    public double bonificacion() {
        if (getAntiguedad() > 20) {
            return 100_000;
        }
        return 0;
    }

    @Override
    public double calcularNomina() {
        double base = salarioBasico + getComision();
        double neto = base * (1 - getDescuentoPrestaciones());
        return neto + bonificacion();
    }

    @Override
    public void obtenerDetalles() {
    double comision = getComision();
    double base = salarioBasico + comision;
    double descuento = base * getDescuentoPrestaciones();
    double neto = calcularNomina();
    
    System.out.println("Vendedor, " + id + ", " + nombre + ", " + añoIngreso + ", " +
                       salarioBasico + ", " + comision + ", " + descuento + ", " + neto);
}
    }
