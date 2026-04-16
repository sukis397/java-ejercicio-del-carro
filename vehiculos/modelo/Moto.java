package modelo;


public class Moto extends Vehiculo {
    
   
    private String tipo;

    
    public Moto(String placa, String marca, double velocidadMaxima, String tipo) {
     
        super(placa, marca, velocidadMaxima);
        this.tipo = tipo;
    }

    @Override
    public void mover() {
        System.out.println("La moto " + marca + " zigzaguea rápidamente entre los carriles.");
    }

    @Override
    public double calcularPeaje() {
        
        return 5500.0;
    }

    @Override
    public String toString() {
       
        return super.toString() + " | Tipo: " + tipo;
    }
}