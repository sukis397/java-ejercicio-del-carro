package modelo;

public class Camion extends Vehiculo {

   
    private double capacidadCarga;

    
    public Camion(String placa, String marca, double velocidadMaxima, double capacidadCarga) {
       
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión " + marca + " transporta " + capacidadCarga + " toneladas de carga pesada.");
    }

    @Override
    public double calcularPeaje() {
       
        return 25000.0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Capacidad de Carga: " + capacidadCarga + " Ton";
    }
}