package productos;

public class Perecedero extends Producto {
    private int diasACaducar;

    
    public Perecedero(String codigo, String descripcion, double precio, int diasACaducar) {
        super(codigo, descripcion, precio); // Llama al constructor de Producto
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioFinal = precio;
       
        if (diasACaducar == 1) {
            precioFinal /= 4;
        } else if (diasACaducar == 2) {
            precioFinal /= 3;
        } else if (diasACaducar == 3) {
            precioFinal /= 2;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Perecedero, " + super.toString() + ", " + diasACaducar;
    }
}
