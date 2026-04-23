package nomina;

public class Repartidor extends Empleado {
    private int numRepartos;
    private char zona;
    private static final double VALOR_POR_REPARTO = 10000.0;

    public Repartidor(String id, String nombre, int edad, int anioIngreso, double salarioBasico, int numRepartos, char zona) {
        super(id, nombre, edad, anioIngreso, salarioBasico);
        this.numRepartos = numRepartos;
        this.zona = validarZona(zona);
    }

    private char validarZona(char zona) {
        if (zona == '1' || zona == '2' || zona == '3') {
            return zona;
        }
        return '3';
    }

    public double calcularValorRepartos() {
        return numRepartos * VALOR_POR_REPARTO;
    }

    @Override
    public double bonificacion() {
        if (zona == '1' && getAntiguedad() > 3) {
            return 150000.0;
        }
        return 0;
    }

    @Override
    public double calcularNomina() {
        double totalDevengado = salarioBasico + calcularValorRepartos() + bonificacion();
        return totalDevengado - (totalDevengado * 0.10);
    }

    @Override
    public String obtenerDetalles() {
        return "Repartidor, " + super.obtenerDetalles() + ", " + numRepartos + ", " + 
               calcularValorRepartos() + ", " + bonificacion() + ", " + (salarioBasico * 0.10) + ", " + calcularNomina();
    }
}