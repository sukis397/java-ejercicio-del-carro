package productos;

public class NoPerecedero extends Producto {
    private char tipo;

    public NoPerecedero(String codigo, String descripcion, double precio, char tipo) {
        super(codigo, descripcion, precio);
       
        this.tipo = validarTipo(tipo);
    }

   
    private char validarTipo(char tipo) {
        if (tipo == 'A' || tipo == 'B' || tipo == 'C') {
            return tipo;
        }
        return 'B'; 
    }

    @Override
    public double calcularPrecioVenta() {
       
        if (tipo == 'A') return precio * 1.03;   // +3%
        if (tipo == 'B') return precio * 1.02;   // +2%
        return precio * 1.015;                   // +1.5% 
    }

    @Override
    public String toString() {
        return "No Perecedero, " + super.toString() + ", " + tipo;
    }
}