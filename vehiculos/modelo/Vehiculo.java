package modelo;

public class Vehiculo { 
    
    protected String placa;
    protected String marca;
    protected double velocidadMaxima;

   
    public Vehiculo(String placa, String marca, double velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mover() {
        System.out.println("El vehículo con placa " + placa + " se está desplazando.");
    }

    public double calcularPeaje() {
        return 0.0; 
    }

    @Override
    public String toString() {
        return "Vehículo [Placa: " + placa + ", Marca: " + marca + ", Vel. Máx: " + velocidadMaxima + " km/h]";
    }
}