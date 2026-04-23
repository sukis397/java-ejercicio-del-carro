import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        listaEmpleados.add(e);
    }

    public void mostrarNomina() {
    for (Empleado e : listaEmpleados) {
        e.obtenerDetalles(); 
    }
}

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(new Vendedor(1, "Ana Lopez", 35, 2000, 1_200_000, 8_000_000));
        empresa.agregarEmpleado(new Vendedor(2, "Luis Perez", 28, 2015, 1_000_000, 5_000_000));
        empresa.agregarEmpleado(new Vendedor(3, "Carla Gomez", 45, 1995, 1_500_000, 10_000_000));


        empresa.agregarEmpleado(new Repartidor(4, "Pedro Ruiz", 30, 2020, 900_000, 120, 'C'));
        empresa.agregarEmpleado(new Repartidor(5, "Maria Diaz", 26, 2021, 850_000, 80, 'A'));
        empresa.agregarEmpleado(new Repartidor(6, "Jose Mora", 40, 2019, 950_000, 150, 'D'));

        System.out.println("Liquidacion de la nomina: \n");
        empresa.mostrarNomina();
    }
}
