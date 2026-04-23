package productos;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        
        ArrayList<Producto> inventario = new ArrayList<>();

        
        inventario.add(new Perecedero("001", "Leche", 4000, 1));
        inventario.add(new Perecedero("002", "Pan", 2000, 3));
        inventario.add(new Perecedero("003", "Queso", 10000, 5));

        inventario.add(new NoPerecedero("101", "Arroz", 3000, 'A'));
        inventario.add(new NoPerecedero("102", "Pasta", 2500, 'X')); 
        inventario.add(new NoPerecedero("103", "Azúcar", 1500, 'C'));

      
        System.out.println("--- DATOS DE PRODUCTOS ---");
        for (Producto p : inventario) {
            System.out.println(p.toString());
        }

        
        System.out.println("\n--- LIQUIDACIÓN DE PRECIOS DE VENTA ---");
        for (Producto p : inventario) {
            System.out.println(p.toString() + ", Precio Venta: " + p.calcularPrecioVenta());
        }
    }
}