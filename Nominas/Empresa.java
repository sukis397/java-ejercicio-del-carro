package nomina;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Vendedor("V01", "Luis Garzon", 20, 2018, 1200000, 5000000));
        listaEmpleados.add(new Vendedor("V02", "Dilan Muñoz", 22, 2024, 1200000, 2000000));
        listaEmpleados.add(new Vendedor("V03", "Ana Perez", 25, 2020, 1200000, 8000000));

        listaEmpleados.add(new Repartidor("R01", "Carlos Ruiz", 30, 2021, 1100000, 20, '1'));
        listaEmpleados.add(new Repartidor("R02", "Marta Gomez", 28, 2025, 1100000, 15, '2'));
        listaEmpleados.add(new Repartidor("R03", "Jose Leon", 35, 2019, 1100000, 30, '4'));

        for (Empleado e : listaEmpleados) {
            System.out.println(e.obtenerDetalles());
        }
    }
}