package productos;

public abstract class Producto {
  
    protected String codigo;
    protected String descripcion;
    protected double precio;

    
    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    
    public abstract double calcularPrecioVenta();

  
    @Override
    public String toString() {
        return codigo + ", " + descripcion + ", " + precio;
    }
}