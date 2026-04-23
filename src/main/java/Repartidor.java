public class Repartidor extends Empleado {
    private int numRepartos;
    private char zona;
    private static final double VALOR_POR_REPARTO = 10_000;

    public Repartidor(int id, String nombre, int edad, int añoIngreso, double salarioBasico,
                      int numeroRepartos, char zona) {
        super(id, nombre, edad, añoIngreso, salarioBasico);
        this.numRepartos = numeroRepartos;
        this.zona = validarZona(zona);
    }

    private char validarZona(char zona) {
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
            return zona;
        }
        return 'C';
    }

    public double getValorPagadoRepartos() {
        return numRepartos * VALOR_POR_REPARTO;
    }

    @Override
    public double bonificacion() {
        if (getAntiguedad() == 5 && zona == 'C') {
            return 50_000;
        }
        return 0;
    }

    @Override
    public double calcularNomina() {
        double base = salarioBasico + getValorPagadoRepartos();
        double neto = base * (1 - getDescuentoPrestaciones());
        return neto + bonificacion();
    }

    @Override
    public void obtenerDetalles() {
    double valorRepartos = getValorPagadoRepartos();
    double base = salarioBasico + valorRepartos;
    double descuento = base * getDescuentoPrestaciones();
    double neto = calcularNomina();
    
    System.out.println("Repartidor, " + id + ", " + nombre + ", " + añoIngreso + ", " +
                       salarioBasico + ", " + numRepartos + ", " + valorRepartos + ", " +
                       descuento + ", " + neto);
}
}